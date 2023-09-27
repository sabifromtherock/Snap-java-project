# Snap Java Project

## Table of Contents

- [Overview](#overview)
- [Snap Rules](#snap-rules)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [How to Play](#how-to-play)

## Overview

This Java project implements the card game "Snap."

## Snap Rules

The Snap game follows these simple rules:

1. **Taking Turns**: Players take turns drawing cards by pressing Enter.

2. **Dealing Cards**: A new card is dealt on each turn.

3. **Winning the Round**: To win a round, you must type 'snap' within 2 seconds after two consecutive cards with the same symbol are drawn.

## Project Structure

This project is organized into several classes:

- **Card**: Represents a playing card with a symbol.
- **CardGame**: A base class for card games with common functionality.
- **SnapGame**: The main Snap game class that implements the game logic.
- **Player**: Represents a player in the game.
- **Display**: Handles user interface and input/output.
- **Main**: Contains the main method to start the game.
- **Color enum**: Provides color constants for console text formatting.

## Getting Started

Follow these steps to clone the project from GitHub and open it on your local machine:

1. **Clone the Repository**:

   Open your terminal or command prompt and navigate to the directory where you want to store the project. Then, use the following command to clone the repository:

   ```
   git clone https://github.com/sabifromtherock/snap-java-project
   ```

2. **Open the Project**:

   Once the repository is cloned, navigate to the project folder using your terminal or a file explorer.

3. **Open with an Integrated Development Environment (IDE)**:

   You can open the project using your preferred Java IDE (e.g., IntelliJ IDEA). Import the project into your IDE, and you'll be able to explore, edit, and run the code.

4. **Compile and Run**:

   In your IDE, locate the `Main` class and run it to start the Snap game.

## How to Play

1. Start the game by running the `Main` class.
2. Choose options from the main menu:
    - Rules: Display the rules of the game.
    - Start game: Enter player names and choose a dealer.
3. Players take turns drawing cards by pressing Enter.
4. If two consecutive cards have the same symbol, type 'snap' within 2 seconds to win the round.
