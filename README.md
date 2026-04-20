# Pacman Java Console Game

A console-based Pac-Man inspired game built in Java.
The player moves through a maze, collects dots, and avoids a ghost.

## Project Structure

This project is divided into 5 classes:

- **Game.java** ⭐ (MAIN CLASS) — Entry point of the game. Runs the main
  game loop, handles player input, tracks score and lives.

- **Maze.java** — Stores the 10x15 grid layout. Manages walls, dots,
  and eaten cells.

- **Pacman.java** — Represents the player. Handles movement, dot
  collection, and collision detection.

- **Ghost.java** — Represents the enemy. Moves randomly through
  the maze each turn.

- **Display.java** — Handles all console output. Renders the maze,
  player, ghost, score, and lives.
