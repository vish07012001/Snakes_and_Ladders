# Snakes_and_Ladders
Snakes and Ladders game in Java. <br>
Multiplayer Game which can be played by 2-4 people.

# Overview
This project is a console-based implementation of the classic Snakes and Ladders game, developed as part of an assignment for the COMP 248 course. The game allows between 2 and 4 players to participate, with each player rolling a dice to move across the board. Players encounter snakes that can send them back and ladders that can advance them forward, with the ultimate goal of reaching the 100th square first.

# Features
- Random Dice Roll: Simulates a dice roll to determine player movement.
- Snakes and Ladders: Certain squares are designated as snakes or ladders, which can affect player progress.
- Player Order Decision: Players roll the dice at the start to determine the playing order.
- Tie-Breaking Mechanism: In case of a tie when determining the order, players roll the dice again until the tie is broken.
- Input Validation: Ensures the number of players is between 2 and 4, with multiple attempts allowed for valid input.
- Winner Announcement: The first player to reach or exceed the 100th square is declared the winner.
# How to Play
- Run the Program: Start the game by executing the main method in the PlayLadderAndSnake class.
- Enter Number of Players: You will be prompted to enter the number of players (between 2 and 4). If an invalid number is entered, you will have up to 4 attempts to provide a valid input.
- Play the Game: The game will proceed with players taking turns rolling the dice. The program will automatically handle the movement of players, interaction with snakes and ladders, and display the updated board after each turn.
- Win the Game: The first player to reach the 100th square wins the game. The game will announce the winner and terminate.
# Code Structure
- Snakes.java: Contains the main logic for the Snakes and Ladders game, including the board setup, player movement, and interaction with snakes and ladders.
- PlayLadderAndSnake.java: Acts as the entry point for the game, handling player input and initiating the game with the specified number of players.
# How to Run
**1.** Compile the Java files:
   - javac Snakes.java PlayLadderAndSnake.java
     
**2.** Run the game:
   - java PlayLadderAndSnake
