
    import java.util.Scanner;

    public class TicTacToe {
        private char[][] board;
        private char currentPlayer;

        public TicTacToe() {
            board = new char[3][3];
            currentPlayer = 'X';
            initializeBoard();
        }

        private void initializeBoard() {
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    board[row][col] = '-';
                }
            }
        }

        public void playGame() {
            boolean gameOver = false;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome to Tic Tac Toe!");

            while (!gameOver) {
                System.out.println("Player " + currentPlayer + ", enter your move (row [1-3] column [1-3]):");
                int row = scanner.nextInt() - 1;
                int col = scanner.nextInt() - 1;

                if (isValidMove(row, col)) {
                    makeMove(row, col);
                    printBoard();

                    if (isWinningMove(row, col)) {
                        System.out.println("Player " + currentPlayer + " wins!");
                        gameOver = true;
                    } else if (isBoardFull()) {
                        System.out.println("It's a draw!");
                        gameOver = true;
                    } else {
                        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                    }
                } else {
                    System.out.println("Invalid move! Try again.");
                }
            }

            scanner.close();
            System.out.println("Game Over.");
        }

        private boolean isValidMove(int row, int col) {
            return (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-');
        }

        private void makeMove(int row, int col) {
            board[row][col] = currentPlayer;
        }

        private boolean isWinningMove(int row, int col) {
            // Check row
            if (board[row][0] == board[row][1] && board[row][0] == board[row][2])
                return true;

            // Check column
            if (board[0][col] == board[1][col] && board[0][col] == board[2][col])
                return true;

            // Check diagonal
            if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && (row == 0 && col == 0 || row == 1 && col == 1 || row == 2 && col == 2))
                return true;

            // Check anti-diagonal
            if (board[0][2] == board[1][1] && board[0][2] == board[2][0] && (row == 0 && col == 2 || row == 1 && col == 1 || row == 2 && col == 0))
                return true;

            return false;
        }

        private boolean isBoardFull() {
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    if (board[row][col] == '-')
                        return false;
                }
            }
            return true;
        }
        private void printBoard() {
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    // Access the value at the specified row and column in your board data structure
                    // and print it here
                    System.out.print(board[row][col] + " ");
                }
                System.out.println(); // Print a new line after each row
            }


        }
        }

