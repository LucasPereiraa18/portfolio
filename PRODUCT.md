# Product

<!-- impeccable:product-schema 1 -->

## Platform

web

## Users

Internship recruiters and tech leads at Brazilian companies hiring a software, data or artificial intelligence (IA) intern (estágio). They read quickly: they skim the hero and project list, then open one or two projects to judge depth and judgment before reaching out.

## Product Purpose

A personal portfolio for Lucas Pereira, an Análise e Desenvolvimento de Sistemas student at Fatec Praia Grande (with a technical background in Informática para Internet from Etec). It exists to land an internship in software development, data or artificial intelligence (IA). Success means a recruiter understands what Lucas has built, trusts the claims, and gets in touch by e-mail or visits GitHub.

## Positioning

"Software para problemas reais": every project comes from the day-to-day operation of the family restaurant, Bar Líder (stock, purchasing, labels and expiry dates, quality routines, time tracking), plus one academic project (the Vocatec TCC). The difference is real operating context together with honest status reporting. Each project says what is implemented, what is still pending, and what has not been validated yet.

## Operating Context

Visitors arrive from a CV, LinkedIn or a direct link, on desktop or a phone. Nothing on the site can be tried live. The internal apps are private or access-protected, so visitors judge the work from the written case (problem, solution, features, current stage), the tech tags, and the one public sanitized repository (Ponto Líder on GitHub).

## Capabilities and Constraints

- Single static page: `index.html`, `styles.css`, `app.js` (project filter), `favicon.svg`. No build step, no framework, no package manager.
- Hosted on Vercel. Commits do not deploy automatically; publishing is manual.
- Strict CSP in `vercel.json`: no third-party fonts, CDNs, analytics or network calls, and no inline scripts or styles. All assets must be self-hosted.
- Content is in Portuguese (pt-BR) only. No English version is planned for now.
- Contact is by `mailto:` and GitHub links only; there are no forms.
- Project filter categories: `gestao` and `academico`.

## Brand Commitments

- Name: Lucas Pereira. Monogram "lp.". Favicon at `favicon.svg`.
- Voice: plain, modest, factual Portuguese. Avoid overclaiming; explicitly separate "published" from "validated/homologated".
- Core line: "Software para problemas reais."

## Evidence on Hand

- Six real projects, described in `index.html`: Gestão Líder, Inventário Takeat, Ambiente Líder Etiquetas, Líder Qualidade, Ponto Líder, Vocatec.
- Public code: https://github.com/LucasPereiraa18 (Ponto Líder sanitized repository).
- Education: ADS at Fatec Praia Grande, 4º ciclo (in progress); Técnico em Informática para Internet at Etec, concluded 2023–2024.
- Vocatec is the concluded Etec TCC (status "Concluído").
- Ambiente Líder Etiquetas is concluded (status "Concluído", confirmed by the user 2026-11-17). The e-mail/WhatsApp reminders were dropped by decision and must not be listed as a feature or pending item.
- Python and Django are part of his toolset (confirmed 2026-11-17), but no project on the site uses them, so they never appear in project tags.
- Ponto Líder: v2.0.0 published; login, calculations and v2 features are not yet homologated (confirmed by the user 2026-11-16, overriding the CV's "Em uso interno").
- Recruiter facts (confirmed 2026-11-16): available manhã e tarde, immediate start; Praia Grande/SP; accepts presencial, híbrido or remoto.
- LinkedIn: https://www.linkedin.com/in/lucas-oliveira-pereira-b6b107380
- CV: `cv.pdf` (updated 2026-11-17, no phone number), linked from the hero and the contact section.
- Líder Qualidade: the full flow was validated with the team (confirmed 2026-11-17); no pending item remains.
- **Absent, must not be fabricated:** real screenshots or data from the internal apps (they stay private, so use illustrations clearly marked as such), testimonials, employer references, metrics or impact numbers, live demos, and a published Vocatec repository or demo.

## Product Principles

1. Context before code: show the operational problem first, then the solution.
2. Honesty is the credibility: always state status and pending work; never imply production validation that has not happened.
3. Respect privacy: no real business data, credentials or screenshots from internal systems.
4. Fast to scan for a recruiter: what was built, with what, and what stage it is in, all within seconds.
5. Self-contained and secure: static, same-origin and CSP-safe by default.

## Accessibility & Inclusion

The current implementation already keeps a skip link, visible focus states, `aria-pressed` filters, a live project count, and `prefers-reduced-motion` support. Future work must keep that baseline. No formal standard was specified; WCAG 2.2 AA is the working assumption.
