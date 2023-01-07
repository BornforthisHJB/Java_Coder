package one;

/**
 * 扫雷玩家
 */
public class MinePlayer {
    /**
     * 玩家号码
     */
    private int playerIndex = -1;


    /**
     * 玩家面板
     */
    private Board board;

    public MinePlayer(int playerIndex) {
        this.playerIndex = playerIndex;
    }


    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public int getPlayerIndex() {
        return playerIndex;
    }

    public void setPlayerIndex(int playerIndex) {
        this.playerIndex = playerIndex;
    }


}