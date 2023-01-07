package lib;

public class Board {
    char[][] board;
    int dimension;
    int numOfMine;

    public Board(int dimension, int numOfMine) {
        this.dimension = dimension;
        this.numOfMine = numOfMine;
        this.board = new char[dimension][dimension];
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[i].length; j++) {
                System.out.print(this.board[i][j] + " ");
            }
            System.out.println();
        }
    }


    public void fillBoard() {
        Mine mine1 = new Mine(this.numOfMine, this.dimension);
        String[] mineLocation = mine1.mineLocation;
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[i].length; j++) {
                for (int k = 0; k < mineLocation.length; k++) {
                    // compare to the coordinate of mine, if same, change the board, 只先填了mine
                    if (i == Integer.parseInt(mineLocation[k].substring(0, 2))
                            && j == Integer.parseInt(mineLocation[k].substring(2, 4)))
                        this.board[i][j] = 'X';
                }
            }
        }
    }

    public void fillNumber() {
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[i].length; j++) {
                if (this.board[i][j] == ' ') {
                    if (i == 0 || i == this.board.length - 1
                            || j == 0 || j == this.board.length - 1) {
                        if ((i == 0 && j == 0) || (i == this.board.length - 1 && j == this.board.length - 1)
                                || (i == 0 && j == this.board.length - 1) || (i == this.board.length - 1 && j == 0)) {
                            fillCorner(i, j);
                        } else
                            fillSide(i, j);
                    } else
                        fillCenter(i, j);
                }
            }
        }
    }

    public void fillCenter(int row, int column) {
        String type = "center";
        int count;
        count = checkSquare(row - 1, column - 1, type);
        this.board[row][column] = (char) (count + '0');
    }

    public void fillCorner(int row, int column) {
        String type = "corner";
        int count;
        if (row == 0) {
            if (column == 0) {
                count = checkSquare(row, column, type);
            } else { // // column = board.length - 1
                count = checkSquare(row, column - 1, type);
            }
        } else { // row == board.length - 1
            if (column == 0) {
                count = checkSquare(row - 1, column, type);
            } else { // column = board.length - 1
                count = checkSquare(row - 1, column - 1, type);
            }
        }
        this.board[row][column] = (char) (count + '0');
    }

    public void fillSide(int row, int column) {
        String type1 = "sideVertical";
        String type2 = "sideHorizontal";
        int count;
        if (row == 0) {
            count = checkSquare(row, column - 1, type2);
        } else if (row == this.board.length - 1) {
            count = checkSquare(row - 1, column - 1, type2);
        } else if (column == 0) {
            count = checkSquare(row - 1, column, type1);
        } else if (column == this.board.length - 1) {
            count = checkSquare(row - 1, column - 1, type1);
        } else {
            count = -1;
            System.out.println("Error");
            System.exit(1);
        }
        this.board[row][column] = (char) (count + '0');
    }

    // search 2 by 2 square
    public int checkSquare(int row, int column, String type) {
        int m;
        int n;
        if (type.equals("corner")) {
            m = 2;
            n = 2;
        } else if (type.equals("sideVertical")) {
            m = 3;
            n = 2;
        } else if (type.equals("sideHorizontal")) {
            m = 2;
            n = 3;
        } else if (type.equals("center")) {
            m = 3;
            n = 3;
        } else {
            m = 0;
            n = 0;
            System.out.println("Error");
            System.exit(1);
        }

        int c = 0;
        for (int i = row; i < row + m; i++) {
            for (int j = column; j < column + n; j++) {
                if (board[i][j] == 'X') {
                    c++;
                }
            }
        }
        return c;
    }


}
