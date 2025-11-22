# Umaishow Developer Documentation

## Project Overview
Umaishow is a Kotlin Multiplatform application designed to calculate and display affinity tables for "Uma Musume Pretty Derby". It includes features for affinity optimization, factor farming calculations, and modification success rate estimation.

## Project Structure
The project is organized into several modules:

- **`core`**: Contains common business logic, data models (`RelationInfo.kt`, `Source.kt`), and state management (`State.kt`, `Preferences.kt`).
- **`html`**: The Kotlin/JS module for the web application. Contains the main UI components (`src/jsMain/kotlin/.../components`).
- **`composeCommon`**: Shared UI components using Compose Multiplatform.
- **`wasm`**: Experimental Wasm target (currently has build issues with `skiko.mjs`).
- **`utility`**: Helper functions and test utilities.

## Setup and Build

### Prerequisites
- JDK 11 or higher
- Kotlin Multiplatform plugin support

### Running Locally
To run the web application locally with hot-reload:
```bash
./gradlew :html:jsBrowserDevelopmentRun
```
Access the app at `http://localhost:8080`.

### Building for Production
To build the production artifacts for the web app:
```bash
./gradlew :html:assemble
```
The output will be in `html/build/dist/js/productionExecutable`.

### Running Tests
To run unit tests for the utility module:
```bash
./gradlew :utility:jvmTest :utility:jsTest
```

## Localization (Japanese to English)
The application was originally in Japanese. We have translated the UI and data to English.

### Key Files for Translation
- **UI Components**:
    - `html/.../components/pages/table/FilterSetting.kt`
    - `html/.../components/pages/table/RelationTable.kt`
    - `html/.../components/pages/factor/FactorPanel.kt`
    - `html/.../components/pages/chara/CharaPanel.kt`
    - `html/.../components/pages/calc/RatePanel.kt`
    - `html/src/jsMain/resources/index.html` (Site title and meta tags)
- **Data & State**:
    - `core/.../data/RelationInfo.kt`: Contains the bulk of game terms, character relationships, and race names.
    - `core/.../data/Source.kt`: Character names.
    - `core/.../vm/State.kt`: UI labels and state enums.
    - `core/.../vm/Preferences.kt`: Default settings.

### Maintenance
Since strings are hardcoded in Kotlin files, any future updates from upstream that introduce new characters or features will likely be in Japanese. You will need to:
1. Identify the new strings in the updated files.
2. Translate them directly in the code.
3. Rebuild and verify.

## Troubleshooting
- **Wasm Build Error**: The `:wasm:wasmJsBrowserProductionWebpack` task may fail with `Module not found: Error: Can't resolve './skiko.mjs'`. This is a known issue. The `html` module (JS target) works correctly and is the primary deployment target.
