package lib;

public class gameLauncher {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int dimension = 20;
        int numOfMine = 10;
        Board board1 = new Board(dimension, numOfMine);

        board1.fillBoard();
        board1.fillNumber();
        board1.printBoard();

    }

}
