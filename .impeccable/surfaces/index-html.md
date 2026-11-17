---
version: 1
slug: "index-html"
primary_target: "index.html"
related_targets: []
---

# Surface brief: portfolio home (index.html)

Scope: the whole single-page portfolio. Visitor mode: Experience (portfolio) serving recruiters who skim for about 60 seconds.
Audience/job: internship recruiters and tech leads. In seconds they need: who, semester, availability, projects with honest status, GitHub, LinkedIn, CV.
Constraints: the content, facts, project statuses and Funciona/Falta texts are unchanged; static HTML/CSS/JS; the CSP is unchanged (self-hosted Saira font only); CSS/SVG illustrations only; pt-BR; WCAG 2.2 AA; minimum text size 12px; motion fast and discreet, off under reduced motion.

## Direction contract

THESIS: The portfolio is a concourse departures board. Every fact is a row on a split-flap board and every project is a departure with a fixed status column. It refuses the category default of a hero with copy beside a picture followed by a grid of equal project cards.

OWN-WORLD: Matte flap black (#0d0d0d / #1b1b1b) ground in brushed-steel frames (#b6bbc2 / #7d838c); flap-white letters (#f2f2f2); delay amber (#ffb400) used only for state and the one primary action. Saira, condensed and in tracked caps, in character-cell plates with a hairline split; normal-width sentence case for prose. Thin ruled rows and fixed columns. No glow, no gradients beyond the steel brushing.

STORY: The visitor reads the board: Lucas Pereira, an ADS 4º ciclo student, available manhã e tarde with an immediate start, in Praia Grande. They scan six departures and their status in one gaze, open a ficha for proof (Funciona/Falta, stack, the public code), then reach the guichê (email, GitHub, LinkedIn, CV).

FIRST VIEWPORT: A full-width steel-framed board. Left (about 7 of 12 columns): the headline "SOFTWARE PARA PROBLEMAS REAIS." on flap rows at display scale, a one-line intro, then the primary amber "VER PARTIDAS" action plus GitHub, LinkedIn and Currículo plates. Right: a fact board with columns CAMPO / INFORMAÇÃO for Nome, Curso, Horário, Início, Local, Status (Em busca de estágio). The departures board starts directly below the steel rail.

FORM: Split-flap concourse board (catalog challenger, competitive verdict, chosen by the user). seed:ae414a2a0c3e7697

SIGNATURE INTERACTION + MOTION: A single flip cascade: plates turn over on their hairline (rotateX on the top half, 180-220ms ease-out, 25-40ms stagger, under 700ms in total) when the board first enters the viewport and when the filter re-sorts the departures. Hovering or focusing a row lights its amber row lamp. There is nothing else. Under reduced motion, plates appear already set.

FINISH: unreviewed and undocumented is unfinished; this build ends with the finish review, the verdict, DESIGN.md, and every shipping raster carrying its provenance

Unresolved: none.
