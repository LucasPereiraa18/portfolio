---
name: Lucas Pereira — Portfólio
description: Software para problemas reais. A split-flap departures board where every fact is a row and every project a departure.
colors:
  flap: "#0b0b0b"
  concourse: "#151515"
  sheet: "#111111"
  flap-face: "#1b1b1b"
  flap-face-2: "#222324"
  seam: "#000000"
  rule: "#2d2d2d"
  rule-strong: "#464646"
  row-hover: "#161616"
  lamp-off: "#3a3a3a"
  steel: "#b6bbc2"
  steel-dark: "#7d838c"
  steel-hi: "#d3d7dc"
  steel-mid: "#8d939a"
  steel-lo: "#c4c9ce"
  rail-top: "#c9cdd2"
  rail-bottom: "#9ba1a8"
  rail-edge: "#5d636a"
  rail-ink-soft: "#26292c"
  flap-white: "#f2f2f2"
  text: "#e6e7e8"
  muted: "#a8afb7"
  label: "#949ba3"
  delay-amber: "#ffb400"
  delay-amber-soft: "#ffc633"
  amber-ink: "#111111"
  concluded: "#c9ced4"
typography:
  display:
    fontFamily: "Saira, Segoe UI, system-ui, sans-serif"
    fontSize: "clamp(32px, 3.7vw, 54px)"
    fontWeight: 600
    lineHeight: 1
    letterSpacing: "0"
    fontVariation: "'wdth' 62.5"
  headline:
    fontFamily: "Saira, Segoe UI, system-ui, sans-serif"
    fontSize: "clamp(22px, 2.6vw, 36px)"
    fontWeight: 600
    lineHeight: 1
    letterSpacing: "0"
    fontVariation: "'wdth' 62.5"
  title:
    fontFamily: "Saira, Segoe UI, system-ui, sans-serif"
    fontSize: "24px"
    fontWeight: 600
    lineHeight: 1.15
    letterSpacing: "0.08em"
    fontVariation: "'wdth' 62.5"
  board:
    fontFamily: "Saira, Segoe UI, system-ui, sans-serif"
    fontSize: "17px"
    fontWeight: 500
    lineHeight: 1.75
    letterSpacing: "0.14em"
    fontVariation: "'wdth' 62.5"
  body:
    fontFamily: "Saira, Segoe UI, system-ui, sans-serif"
    fontSize: "17px"
    fontWeight: 400
    lineHeight: 1.6
  label:
    fontFamily: "Saira, Segoe UI, system-ui, sans-serif"
    fontSize: "12px"
    fontWeight: 600
    lineHeight: 1.5
    letterSpacing: "0.1em"
    fontVariation: "'wdth' 75"
rounded:
  plate: "2px"
  sheet: "4px"
  label: "6px"
  lamp: "50%"
spacing:
  row: "12px"
  board-pad: "24px"
  gap: "24px"
  section: "96px"
  gutter: "32px"
  gutter-mobile: "16px"
components:
  button-primary:
    backgroundColor: "{colors.delay-amber}"
    textColor: "{colors.amber-ink}"
    rounded: "{rounded.plate}"
    padding: "0 12px"
    height: "48px"
    typography: "{typography.board}"
  button-primary-hover:
    backgroundColor: "{colors.delay-amber-soft}"
    textColor: "{colors.amber-ink}"
  button-plate:
    backgroundColor: "{colors.flap-face}"
    textColor: "{colors.flap-white}"
    rounded: "{rounded.plate}"
    padding: "0 12px"
    height: "48px"
  button-plate-hover:
    textColor: "{colors.delay-amber}"
  filter:
    backgroundColor: "{colors.flap-face}"
    textColor: "{colors.flap-white}"
    rounded: "{rounded.plate}"
    padding: "0 14px"
    height: "40px"
  filter-active:
    backgroundColor: "{colors.flap-white}"
    textColor: "{colors.flap}"
  status-publicado:
    textColor: "{colors.flap-white}"
    rounded: "{rounded.plate}"
    padding: "3px 9px"
  status-concluido:
    textColor: "{colors.concluded}"
    rounded: "{rounded.plate}"
    padding: "1px 7px"
  status-homologacao:
    textColor: "{colors.delay-amber}"
    rounded: "{rounded.plate}"
    padding: "3px 9px"
  status-desenvolvimento:
    textColor: "{colors.flap-white}"
    rounded: "{rounded.plate}"
    padding: "3px 9px"
  status-codigo-publico:
    backgroundColor: "{colors.steel}"
    textColor: "{colors.flap}"
    rounded: "{rounded.plate}"
    padding: "3px 9px"
  plate:
    backgroundColor: "{colors.flap-face}"
    textColor: "{colors.flap-white}"
    rounded: "{rounded.plate}"
    padding: "0.14em 0.45em"
  ficha:
    backgroundColor: "{colors.sheet}"
    textColor: "{colors.text}"
    rounded: "{rounded.sheet}"
---

# Design System: Lucas Pereira — Portfólio

## Overview

**Creative North Star: "Painel de partidas"**

The site is a concourse departures board. The visitor reads it the way a traveller reads a split-flap board: one gaze down fixed columns of ruled rows. Facts about Lucas are rows on a fact board (Status, Nome, Curso, Disponibilidade, Local, Foco, E-mail). Each project is a departure with a fixed Status column. The detail sheets (fichas) below are the timetable behind each departure. Matte black flap faces sit inside brushed-steel frames. The only light on the board is amber, and it always means something.

The mood is **clear, practical and organized**. Density is board-like: compact ruled rows inside generous steel-framed regions. Prose (intros, problem and solution, Funciona and Falta) is set in normal-width sentence case so it reads as text. Board voice (headings, labels, statuses, row values) is condensed tracked caps. Illustrations are abstract CSS/SVG diagrams drawn in the board's own material and are never screenshots of the real systems.

It must never drift toward the neon/glow/3D-blob dev portfolio, the purple-gradient SaaS template, or fake screens of the internal systems. Dark here is a matte board, not a glowing terminal.

**Key Characteristics:**
- Matte flap-black boards in brushed-steel frames; flat, with no shadows or glows.
- Headlines are set letter by letter in split-flap cells with a hairline seam.
- Every fact is a ruled row, and every project a departure row with a fixed Status column.
- Amber is reserved for state and the one primary action per board.
- One motion: the top half of each flap falls on its hairline, once.

## Colors

The palette is near-black and steel, with one signal colour that means delay, pending, or "act here".

### Primary
- **Delay Amber** (`delay-amber`): Em homologação, the Falta and Em desenvolvimento labels in each status note, the "Em busca de estágio" lamp and plate, the row lamp on hover/focus, focus rings, and the primary button (the hero "Conheça meus projetos" and the contact "Enviar e-mail"). **Delay Amber Soft** is only its hover.

### Neutral
- **Flap** (`flap`): the face of every board and of the top bar and footer.
- **Concourse** (`concourse`): the page ground around the boards.
- **Sheet** (`sheet`): the ficha panels.
- **Flap Face / Flap Face 2** (`flap-face`, `flap-face-2`): the upper and lower halves of a plate or cell. The split is what reads as a flap.
- **Seam** (`seam`): the 1px hairline through each cell.
- **Rule / Rule Strong** (`rule`, `rule-strong`): ruled rows and board dividers.
- **Steel** (`steel-hi`, `steel-mid`, `steel-lo`, `steel`, `steel-dark`): frames (a vertical gradient through hi/mid/lo, drawn with `border-image`), rails, the dashed and filled status borders, and the illustration line work.
- **Rail** (`rail-top`, `rail-bottom`, `rail-edge`, `rail-ink-soft`): the brushed steel process rail under the hero, with flap-black text.
- **Ink** (`flap-white`, `text`, `muted`, `label`): headings and plate text, body text, secondary text, and 12px field labels. All clear AA on the flap (lowest: label 5.6:1 on the lower plate half).
- **Concluded** (`concluded`): the "Concluído" status only.

### Named Rules
**The Delay Rule.** Amber means state (pending, in validation, active) or the single primary action of a board. Never decoration: no amber icons, accents, pills or links.

**The No-Hue Rule.** The board has no other hue. Status is told apart by border style (solid, double, dashed, filled), not by new colours.

**The Steel-Only Material Rule.** The only texture is brushed steel on frames and the rail. No gradients on surfaces, no glows, no blur.

## Typography

**Display, board and label font:** Saira (variable `wdth` 50–125, `wght` 100–900), self-hosted from `fonts/saira-latin.woff2` (OFL), with Segoe UI and system-ui as fallbacks.
**Body font:** Saira at normal width.

**Character:** one family carries both voices. Condensed (`font-stretch: 62.5%`) tracked caps are the board; normal-width sentence case is the reading voice. Labels under 14px open up to 75% width and 0.1em tracking so they stay legible.

### Hierarchy
- **Display** (600, clamp(32px, 3.7vw, 54px), line-height 1): the hero h1 in split-flap cells, two authored rows ("Software para / problemas reais.").
- **Headline** (600, clamp(22px, 2.6vw, 36px)): section h2s in flap cells, always two `.flap-line` rows.
- **Title** (600, 24px, 0.08em tracking, condensed caps): ficha names and skill-row names.
- **Board** (500–600, 15–17px, 0.12–0.14em tracking, condensed caps): departure rows, ficha field values, buttons, filters, nav.
- **Body** (400, 16–19px, line-height 1.5–1.65): the hero intro (18px), ficha summary (19px), case text and status notes (16px). The measure stays at roughly 30–40em.
- **Label** (600, 12px, 75% width, 0.1em tracking, caps): field names (Campo, Status, Tipo, Área), column heads, tags, contact labels.

### Named Rules
**The 12px Floor Rule.** No text renders below 12px at any width. Narrow screens drop board columns (Stack at ≤1080, Área at ≤720), never type size.

**The Two-Voice Rule.** Board text is condensed caps; prose is sentence case at normal width. Never set a paragraph in caps.

**The Centered Cell Rule.** Flap cells have a fixed width (0.66em), letter-spacing 0 and centred glyphs. Tracking lives between cells, never inside one.

## Layout

The container is `calc(100% − 64px)` (16px gutters at ≤720) with a max of 1240px. The page is a sequence of steel-framed boards on the concourse ground:

1. **Top bar** (black, steel rule below): the brand plate "lp." with the name, and the nav.
2. **Hero board:** a 1.4fr / 1fr grid. On the left are the flap headline, the intro and the four actions in one row. On the right is the CAMPO / INFORMAÇÃO fact board with seven one-line rows. It stacks at ≤1080.
3. **Rail:** brushed steel with the process steps and a next-arrow icon.
4. **Departures board**, directly under the rail. Its head bar holds the h2, intro and filters. Below that is the table (Nº, Projeto, Área, Stack, Status), and the foot holds the context line and status legend.
5. **Fichas:** full-width sheets, illustration 0.8fr | text 1.2fr. They stack at ≤900.
6. **Sobre:** text beside an education board.
7. **Tecnologias:** one board with ruled rows (area | description | tools).
8. **Contato:** the guichê board, with facts and the primary action beside the contact rows.

Section rhythm is 96px (72px at ≤900, 56px at ≤720). Breakpoints are 1080, 900, 720, 420 and 359px (max-width), plus `forced-colors` and `prefers-reduced-motion`.

**The Ruled Row Rule.** Facts, notes, education and contact entries are rows separated by 1px rules with 9–22px of block padding. Content sits on the board, not in nested cards.

## Elevation & Depth

Flat. There are no `box-shadow`s for depth. Depth comes from material only: the concourse ground, the black board face inside a 6px steel `border-image` frame (4px at ≤720), the split two-tone plates with a seam, and the brushed rail. The one inset is a 1px, 3.5% white inner line on flap cells, which suggests the edge of the module.

**The Frame-Not-Lift Rule.** A region that needs to stand out gets a steel frame or a rule, never a shadow or glow.

## Shapes

Hard and mechanical. Plates, buttons, filters and status boxes use a 2px radius; ficha sheets 4px; the printed label inside the Ambiente Líder illustration 6px; steel frames are square. Circles are reserved for lamps (9px), diagram dots and the clock. Borders are 1px, except the 6px steel frame, the 4px steel rule under the top bar and above the footer, and the 3px double border of "Concluído".

## Components

### Buttons
Plates you can press.
- **Primary:** Delay Amber fill, amber-ink text, 48px tall, condensed caps, label and icon spread apart. Hover is Delay Amber Soft. Press is scale(0.98) over 100ms.
- **Plate:** a flap-face fill with a 1px rule-strong border and white text. Hover turns the border and text amber.
- **Focus:** a 3px amber outline with a 3px offset on every control.

### Filter chips
40px plates in condensed caps. Pressed (`aria-pressed=true`) is a flap-white fill with flap-black text. In forced-colors mode the pressed chip uses Highlight/HighlightText.

### Status boxes
13px condensed caps (12px in the legend), 1px border in the text colour, 2px radius, no wrapping above 359px:
- **Publicado:** solid flap-white border.
- **Concluído:** concluded grey with a 3px double border.
- **Em homologação:** amber.
- **Em desenvolvimento:** flap-white text with a dashed steel border.
- **Código público:** steel fill with flap-black text.

The same boxes appear in the departures table and the ficha field strip. The legend lists only the statuses in current use (today: Em homologação, Publicado, Concluído, Código público); add a status back to the legend whenever a project uses it again, as with Em desenvolvimento.

### Departures table
A real `<table>` with a caption, column headers and row-header links. Each row has a lamp (off at `lamp-off`, amber on hover/focus-within), a number plate, a project-name plate linking to its ficha, Área and Stack as board lettering, and the Status box. Rows align to the top.

### Fact board
A `dl role="group"` of rows: a 12px label column (112px) and a value set as an inline plate (`box-decoration-break: clone`, so wrapped lines each get their own face). On the hero the values are set at 87.5% width so each fits one row. The Status row carries the amber lamp and plate.

### Ficha
A sheet with a black header (number plate + name), a board-lettered field strip (Tipo | Área | Status in three fixed columns; two columns at ≤720), then illustration | text. The text runs: summary, problem and solution, the status note (Funciona / Falta rows, where Falta and Em desenvolvimento are amber), tags, a "Recursos" disclosure, and a footer with the access note and a link.

### Contact rows
Full-width rows: a 12px label, the value as a plate (17–22px) and a steel icon that turns amber on hover.

### Signature: split-flap cells and the flip
`app.js` splits each `.flap-title` into `aria-hidden` letter cells and keeps an `.sr-only` sentence for assistive tech. The flip is one cascade: the top half of each cell or plate (`::before` over the always-visible glyph) falls on the hairline with `rotateX(0 → −90deg)` over 200ms, using `cubic-bezier(0.23, 1, 0.32, 1)`. Delays are staggered and capped at 480ms in total. It runs on the hero at load and on the departures board at first view and on filter re-sort, and is removed under `prefers-reduced-motion`. Colour transitions elsewhere take 120ms.

## Do's and Don'ts

### Do:
- **Do** frame every board in steel with `border-image: var(--steel-frame) 1`, keeping the face a solid `flap`.
- **Do** set facts and statuses as ruled rows with fixed columns; drop columns on narrow screens instead of shrinking type below 12px.
- **Do** use one of the five status boxes for any project status, with the same words, and keep the legend in step with the statuses actually in use.
- **Do** keep amber for state and the single primary action of a board.
- **Do** set new section headings as two `.flap-line` rows inside a `.flap-title` so `app.js` builds the cells.
- **Do** draw project illustrations in CSS/SVG in steel and flap-white, and label them as illustrations when they could be mistaken for real data.
- **Do** self-host any new asset; the CSP allows only same-origin.

### Don't:
- **Don't** add shadows, glows, neon, blur or surface gradients; the only texture is brushed steel.
- **Don't** drift into the neon/glow/3D-blob dev portfolio or the purple-gradient SaaS template.
- **Don't** show fake screens or dashboards of the internal systems.
- **Don't** introduce another hue; status difference comes from border style.
- **Don't** add small labels above headings; put that information in a field strip or row instead.
- **Don't** use amber for decoration (icons, accent words, links, pills).
- **Don't** animate anything else; the flip is the only motion, and it runs once per trigger.
