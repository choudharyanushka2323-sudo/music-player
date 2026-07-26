# Java Console Music Player 🎵

A lightweight, terminal-based audio player built in Java using the `javax.sound.sampled` API. Load a local audio file and control playback — play, stop, and reset — through a simple command-line menu.

## Features

- ▶️ **Play** audio from a local file path
- ⏹️ **Stop** playback at any time
- 🔄 **Reset** playback to the beginning
- ❌ **Quit** cleanly with proper resource cleanup
- Robust exception handling for missing, corrupted, or unsupported audio files

## Demo

```
P = Play
S = Stop
R = Reset
Q = Quit
Enter your choice : P
```

## Tech Stack

- **Language:** Java (JDK 8+)
- **Core API:** `javax.sound.sampled` (built-in Java Sound API)
- **Supported formats:** `.wav`, `.au`, `.aiff` (native support — see [Limitations](#limitations) for MP3)

## Project Structure

```
music-player/
├── main.java        # Entry point and core playback logic
└── README.md         # Project documentation
```

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher installed
- An audio file in `.wav`, `.au`, or `.aiff` format

### Installation

1. Clone or download this repository:
   ```bash
   git clone https://github.com/<your-username>/music-player.git
   cd music-player
   ```

2. Update the `FilePath` variable in `main.java` to point to your audio file:
   ```java
   String FilePath = "C:\\path\\to\\your\\audio-file.wav";
   ```

3. Compile the program:
   ```bash
   javac main.java
   ```

4. Run it:
   ```bash
   java main
   ```

## Usage

Once running, the program displays a menu of options:

| Key | Action |
|-----|--------|
| `P` | Play the audio |
| `S` | Stop the audio |
| `R` | Reset playback to the beginning |
| `Q` | Quit the program |

Type the corresponding letter and press **Enter** to trigger the action.

## Error Handling

The player gracefully handles common failure cases:

| Exception | Meaning |
|-----------|---------|
| `UnsupportedAudioFileException` | The file format isn't supported by the Java Sound API |
| `LineUnavailableException` | The audio line/output device couldn't be accessed |
| `FileNotFoundException` | The specified file path doesn't exist |
| `IOException` | A general I/O error occurred while reading the file |

## Limitations

- **No native MP3 support.** Java's built-in `AudioSystem` only supports `.wav`, `.au`, and `.aiff`. To play MP3 files, you'll need a third-party library such as [JLayer](http://www.javazoom.net/javalayer/javalayer.html) or [mp3spi](http://www.javazoom.net/mp3spi/mp3spi.html).
- File paths are currently hardcoded; there's no command-line argument or file picker yet.
- Single-track playback only — no playlist support.

## Roadmap

- [ ] Add MP3/OGG support via `mp3spi` or JLayer
- [ ] Accept file path as a command-line argument
- [ ] Add pause/resume (distinct from stop)
- [ ] Add volume control
- [ ] Support playlists / directory scanning
- [ ] Build a simple GUI with JavaFX or Swing

## Contributing

Contributions are welcome! Feel free to open an issue or submit a pull request for bug fixes, new features, or documentation improvements.

## License

This project is open source and available under the [MIT License](LICENSE).

## Acknowledgments

Built using Java's native `javax.sound.sampled` API — no external dependencies required for core WAV/AU/AIFF playback.
