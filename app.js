'use strict';

document.documentElement.classList.add('js');

/* Split-flap titles: each letter in its own cell. The readable text stays in an
   sr-only copy so screen readers hear the sentence, not single letters. */
function buildCells(title) {
  const lines = Array.from(title.querySelectorAll('.flap-line'));
  if (!lines.length) return;
  const sr = document.createElement('span');
  sr.className = 'sr-only';
  sr.textContent = title.textContent.replace(/\s+/g, ' ').trim();
  for (const line of lines) {
    const words = line.textContent.trim().split(/\s+/);
    line.textContent = '';
    line.setAttribute('aria-hidden', 'true');
    for (const word of words) {
      const group = document.createElement('span');
      group.className = 'word';
      for (const char of word) {
        const cell = document.createElement('span');
        cell.className = 'cell';
        cell.textContent = char;
        group.appendChild(cell);
      }
      line.appendChild(group);
    }
  }
  title.prepend(sr);
}

document.querySelectorAll('.flap-title').forEach(buildCells);

/* The one motion on the page: plates turn over in a short cascade.
   Total stays under ~700ms however many plates a board holds. */
const MAX_SPREAD = 480;
const DURATION = 200;
const timers = new WeakMap();
function flip(unit) {
  const plates = Array.from(unit.querySelectorAll('.cell, .plate')).filter((el) => el.offsetParent !== null);
  if (!plates.length) return;
  const step = Math.min(32, MAX_SPREAD / plates.length);
  plates.forEach((el, i) => el.style.setProperty('--d', `${Math.round(i * step)}ms`));
  clearTimeout(timers.get(unit));
  unit.classList.remove('is-flipping');
  requestAnimationFrame(() => {
    unit.classList.add('is-flipping');
    // The flaps are gone once they fall; drop the class so nothing lingers.
    timers.set(unit, setTimeout(() => unit.classList.remove('is-flipping'), MAX_SPREAD + DURATION + 80));
  });
}

document.querySelectorAll('[data-flip="load"]').forEach(flip);

const departures = document.querySelector('.departures');
if (departures && 'IntersectionObserver' in window) {
  const observer = new IntersectionObserver((entries) => {
    for (const entry of entries) {
      if (!entry.isIntersecting) continue;
      observer.disconnect();
      flip(entry.target);
    }
  }, { rootMargin: '0px 0px -15% 0px', threshold: 0 });
  observer.observe(departures);
}

/* Project filter: re-sorts the departures board and the fichas together. */
const filters = document.querySelector('.filters');
const count = document.getElementById('project-count');
const items = Array.from(document.querySelectorAll('#projetos [data-category]'));

if (filters && count && items.length) {
  filters.hidden = false;
  filters.addEventListener('click', (event) => {
    const button = event.target.closest('button[data-filter]');
    if (!button || !filters.contains(button)) return;
    const selected = button.dataset.filter;
    for (const item of filters.querySelectorAll('button')) {
      item.setAttribute('aria-pressed', String(item === button));
    }
    for (const item of items) {
      item.hidden = selected !== 'todos' && item.dataset.category !== selected;
    }
    const visible = document.querySelectorAll('.dep-table tbody tr:not([hidden])').length;
    count.textContent = `${visible} ${visible === 1 ? 'projeto' : 'projetos'}`;
    if (departures) flip(departures);
  });
}
