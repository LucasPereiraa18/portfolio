# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Overview

Static, single-page personal portfolio (Portuguese, `pt-BR`) for Lucas Pereira. No build step, no package manager, no tests, no dependencies. The public repository is `LucasPereiraa18/portfolio`. The Ponto Líder code lives separately in `LucasPereiraa18/ponto-lider` (its old `portfolio-site` branch is an obsolete copy of this site).

## Running locally

Open `index.html` directly in a browser, or serve the folder with any static server (e.g. `npx serve .` or `python -m http.server`).

## Deployment

Hosted on Vercel, originally deployed via API **without Git integration** — committing/pushing does not update production. Changes must be published manually (or Git integration configured on the Vercel project).

`vercel.json` sets a strict Content-Security-Policy (`default-src 'self'`, `script-src 'self'`, `style-src 'self'`, `connect-src 'none'`, `form-action 'none'`). Consequences when editing:
- No inline `<script>`, inline `style="..."` attributes, or `<style>` blocks — they will be blocked in production (they work when opening the file locally, so test against the CSP).
- No external CDNs, hosted web fonts, analytics, or fetch/XHR calls. Any new asset must be served from the same origin, or the CSP must be updated deliberately. The one font (Saira, variable `wdth`/`wght`, OFL) is self-hosted in `fonts/`.
- No forms that submit; contact is via `mailto:` links.
- JS may set CSS custom properties with `element.style.setProperty(...)` (CSSOM is allowed by the CSP); `setAttribute('style', ...)` is blocked.
- To test locally under the real headers, serve the folder with a server that sends the `vercel.json` headers; a plain static server does not.

## Structure

The visual system is a split-flap departures board ("Painel de partidas"); see `DESIGN.md` for tokens and rules.

- `index.html` — all content. The hero is a steel-framed `.board` (headline + recruiter facts `dl.facts`). Projects appear twice: as rows of the departures table `.dep-table` (inside `.departures`) and as detail sheets `article.ficha` in `.fichas`. Both carry `data-category`; table rows link to the ficha `id`.
- `app.js` — progressive enhancement only:
  - splits every `.flap-title` (`h1`/`h2`, each line a `.flap-line`) into per-letter `.cell` spans marked `aria-hidden`, plus an `.sr-only` copy of the sentence;
  - runs the flip cascade (`flip()`: adds `.is-flipping` and sets a `--d` delay per `.cell`/`.plate`) on `[data-flip="load"]` boards and on `.departures` when it first scrolls into view or the filter changes;
  - the filter: `.filters` is `hidden` in HTML and revealed by JS; buttons use `data-filter` (`todos`, `gestao`, `academico`) and toggle `aria-pressed`, hide both table rows and fichas, and update the `#project-count` live region.
- `styles.css` — readable CSS. Tokens live in `:root` (materials, steel, ink, state colors, `--ease-out`). Breakpoints: 1080px, 900px, 720px, 420px, 359px (max-width), plus `prefers-reduced-motion` and `forced-colors`.

When adding or recategorizing a project: add both a `.dep-table` row and an `article.ficha` with the same `data-category` (an existing filter value, or add a new filter button), and update the static `6 projetos` count text in `#project-count` plus the "seis projetos" wording in the `<meta name="description">`. Status labels must use one of the five `.st` variants from the legend.

## Content conventions

Project descriptions are deliberately conservative about status: each states what is implemented vs. pending, and avoids claiming production validation that hasn't happened (each ficha has a "Funciona / Falta" note, and statuses come from a fixed legend). `PRODUCT.md` lists the confirmed facts and what must not be invented. Internal apps note that code/credentials are not included. Preserve this honesty when editing copy, and keep all user-facing text in Portuguese.
