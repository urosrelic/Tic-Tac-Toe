import java.util.Scanner;

public class Main {
    private static char[][] grid = new char[3][3];
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        initializeGrid();
        print(grid);

        boolean player1 = true;
        char playerSymbol;

        boolean gameFinished = false;
        while (!gameFinished) {
            if(player1) {
                playerSymbol = 'X';
                System.out.println("Player 1's turn: ");
            } else {
                playerSymbol = 'O';
                System.out.println("Player 2's turn: ");
            }

            playerTurn(playerSymbol);

            if(hasWon('X')) {
                System.out.println("X wins");
                gameFinished = true;
            } else if(hasWon('O')) {
                System.out.println("O wins");
                gameFinished = true;
            } else {
                if(gridFull()) {
                    System.out.println("Draw");
                    gameFinished = true;
                } else {
                    player1 = !player1;
                }
            }
        }
    }

    private static void playerTurn(char playerSymbol) {
        boolean moveFinished = false;
        while(!moveFinished) {
            System.out.print("Enter a row number (1, 2 or 3): ");
            int row = in.nextInt();
            System.out.print("Enter a column number (1, 2 or 3): ");
            int col = in.nextInt();
            if (row < 1 || col < 1 || row > 3 || col > 3) {
                System.out.println("Coordinates should be from 0 to 2!");
            } else if (grid[row-1][col-1] != '_') {
                System.out.println("This cell is occupied! Choose another one!");
            } else {
                moveFinished = true;
                grid[row-1][col-1] = playerSymbol;
                print(grid);
            }
        }
    }

    private static boolean hasWon(char symbol) {
        // Should probably use a for loop instead of hard coding

        // Check in rows
        for (int i = 0; i < 3; i++) {
            if (grid[i][0] == symbol && grid[i][1] == symbol && grid[i][2] == symbol) {
                return true;
            }
        }

        // Check in columns
        for(int i = 0; i < 3; i++) {
            if(grid[0][i] == symbol && grid[1][i] == symbol && grid[2][i] == symbol) {
                return true;
            }
        }

        // Check in main diagonal
        if(grid[0][0] == symbol && grid[1][1] == symbol && grid[2][2] == symbol) {
            return true;
        }

        // Check in secondary diagonal
        if(grid[0][2] == symbol && grid[1][1] == symbol && grid[2][0] == symbol) {
            return true;
        }

        return false;
    }

    private static boolean gridFull() {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(grid[i][j] == '_') {
                    return false;
                }
            }
        }
        return true;
    }

    private static void print(char[][] grid) {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("---------");
    }

    private static void initializeGrid() {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                grid[i][j] = '_';
            }
        }
    }


}
