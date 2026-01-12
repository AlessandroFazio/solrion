# Release Process

This document describes how to release Solrion.

Solrion follows:
- Semantic Versioning (SemVer)
- Conventional Commits
- Trunk-based development

---

## Versioning

Versions follow the format:

MAJOR.MINOR.PATCH

Examples:
- 0.1.0
- 1.2.3

Rules:
- MAJOR: breaking API changes
- MINOR: backward-compatible features
- PATCH: backward-compatible bug fixes

---

## Release Steps

1. Ensure `main` is clean and passing CI


2. Update the version in the root `pom.xml`
  - Remove `-SNAPSHOT`


3. Commit the version bump

   Example:
   chore(release): prepare 0.3.0


4. Create and push a git tag:

   git tag v0.3.0

   git push origin v0.3.0


5. CI will:
  - Build all modules
  - Run checks
  - Publish artifacts (if enabled)

6. After release:
  - Bump `main` to next `-SNAPSHOT`
  - Commit:

    chore(release): start 0.4.0-SNAPSHOT

---

## Breaking Changes

Breaking changes MUST be declared using Conventional Commits.

Either:

feat(api)!: change facet response model

Or using a footer:

BREAKING CHANGE: JsonFacetResult no longer exposes raw map

---

## Supported JDKs

- Java 17 (LTS)
