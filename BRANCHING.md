# Branching Model

Solrion uses a trunk-based development model.

---

## Main Branch

- `main` is the only long-lived branch
- Always buildable
- Always releasable

---

## Feature and Fix Branches

Short-lived branches may be used:

- feature/<name>
- fix/<name>

These must:
- Be rebased or merged into `main`
- Never live long-term

---

## Releases

- Releases are created using git tags
- No release branches
- Tag format:

  vMAJOR.MINOR.PATCH

Example:
- v1.2.0

---

## Why This Model

- Solrion is a library, not a deployed service
- Consumers depend on versions, not branches
- Keeps contribution and CI simple
