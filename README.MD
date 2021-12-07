# Simple Tic-Tac-Toe

---

# Tic-Tac-Toe
- Project by JetBrains Academy https://www.jetbrains.com/academy/

---

## About
Tic-tac-toe is known all over the world. Each country may have its own version of the name, sometimes the rules are different, but the essence of the game remains the same. Below are the main rules that may be familiar to you since childhood.

Tic-tac-toe is a game played by two players on a 3x3 grid. One of the players is 'X', and the other player is 'O'. X plays first, then O takes the next turn, and so on.The first player that puts 3 X's or 3 O's in a straight line (including diagonals) wins the game.

---

## Project tasks / stages

### Stage 1/5
First task in this project is to print the game grid in the console output.

### Stage 2/5
In this stage, write a program that:

- Reads a string of 9 symbols from the input and displays them to the user in a 3x3 grid. The grid can contain only X, O and _ symbols.
- Outputs a line of dashes --------- above and below the grid, adds a pipe | symbol to the beginning and end of each line of the grid, and adds a space between all characters in the grid.

### Stage 3/5
In this stage, your program should:
- Take a string entered by the user and print the game grid as in the previous stage.
- Analyze the game state and print the result. Possible states:
- Draw when no side has a three in a row and the grid has no empty cells.
- X wins when the grid has three X’s in a row.
- O wins when the grid has three O’s in a row.

### Stage 4/5
The program should ask the user to enter the coordinates of the cell where they want to make a move.

In this stage, the user plays as X, not O. Keep in mind that the first coordinate goes from top to bottom and the second coordinate goes from left to right. Also note that coordinates start with 1 and can be 1, 2, or 3.

The program should work as follows:
- Prompt the user to make a move.
- The user should input 2 numbers that represent the cell where they want to place their move.
- Analyze user input and show messages in the following situations:
    1. This cell is occupied! Choose another one! if the cell is not empty.
    2. You should enter numbers! if the user enters non-numeric symbols in the coordinates input
    3. Coordinates should be from 1 to 3! if the user enters coordinates outside the game grid.
- Update the grid to include the user's move and print the updated grid to the console.

### Stage 5/5
In this stage, write a program that:
- Prints an empty grid at the beginning of the game.
- Creates a game loop where the program asks the user to enter the cell coordinates, analyzes the move for correctness and shows a grid with the changes if everything is okay
- Ends the game when someone wins or there is a draw.
---
