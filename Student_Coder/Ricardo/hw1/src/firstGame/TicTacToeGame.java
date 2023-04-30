package firstGame;

import java.util.*;

public class TicTacToeGame {

    //    static String[] gamePlaneBlock;//面板上面的每个游戏方格
    static String currentPlayer;//记录当前玩家
    static GamePanel gamePanel;//游戏面板对象
    static int playGroudSize = 9;
    static Player xplayer;//X玩家
    static Player oplayer;//0玩家
    static Player winner;//赢家

    //判断是否有玩家胜利
    //有整行 或者 整列 或者对角线 是一样的，就是胜利
    static Player checkWinner(Player winner) {
        for (int a = 0; a < 8; a++) {
            String line = null;

            switch (a) {
                case 0:
                    line = gamePanel.getTargetBlock(0) + gamePanel.getTargetBlock(1) + gamePanel.getTargetBlock(2);
                    break;
                case 1:
                    line = gamePanel.getTargetBlock(3) + gamePanel.getTargetBlock(4) + gamePanel.getTargetBlock(5);
                    break;
                case 2:
                    line = gamePanel.getTargetBlock(6) + gamePanel.getTargetBlock(7) + gamePanel.getTargetBlock(8);
                    break;
                case 3:
                    line = gamePanel.getTargetBlock(0) + gamePanel.getTargetBlock(3) + gamePanel.getTargetBlock(6);
                    break;
                case 4:
                    line = gamePanel.getTargetBlock(1) + gamePanel.getTargetBlock(4) + gamePanel.getTargetBlock(7);
                    break;
                case 5:
                    line = gamePanel.getTargetBlock(2) + gamePanel.getTargetBlock(5) + gamePanel.getTargetBlock(8);
                    break;
                case 6:
                    line = gamePanel.getTargetBlock(0) + gamePanel.getTargetBlock(4) + gamePanel.getTargetBlock(8);//对角线
                    break;
                case 7:
                    line = gamePanel.getTargetBlock(2) + gamePanel.getTargetBlock(4) + gamePanel.getTargetBlock(6);//对角线
                    break;
            }
            if (line.equals("XXX")) {//赢了
                return xplayer;
            }

            // For O winner
            else if (line.equals("OOO")) {
                return oplayer;
            }
        }
        if (gamePanel.hasEmptyBLock()) {
            winner.setName("");
        } else {
            winner.setName("equal"); //所有格子都被占领，平局
            return winner;
        }

        System.out.println("轮到 " + currentPlayer + " 请输入一个数字的数字: ");
        return winner;
    }

    public void startGame() {
        System.out.println("====Tic Tac游戏开始====");
        gamePanel = new GamePanel(playGroudSize);
        xplayer = new Player("X");//初始化 x 玩家
        oplayer = new Player("O");//初始化 o 玩家
        winner = new Player("");
        currentPlayer = xplayer.getName(); //默认第一个
        // 玩家为X
//        String winner = null; //游戏赢家
        //初始化游戏面板的格子
        String[] blocks = new String[9];
        for (int i = 0; i < playGroudSize; i++) {
            blocks[i] = String.valueOf(i + 1);
        }
        gamePanel.setGamePlaneBlock(blocks); //把初始化号的格子传入游戏面板


        System.out.println("欢迎来带 3x3 Tic Tac Toe 游戏");
        gamePanel.printGamePlane();

        System.out.println(
                "玩家 X 先玩。请输入数字来把 X 放入指定格子 :");

        while (winner.getName().equals("")) {
            int numInput;
            Scanner in = new Scanner(System.in);
            try {

                // 等待玩家输入数字
                numInput = in.nextInt(); // 获取玩家输入的整形数字
                if (!(numInput > 0 && numInput <= 9)) { //判断是否在 0-9 之间的数字
                    System.out.println(
                            "输入的数字无效！请重新输入一个数字:");
                    continue;
                }
            } catch (InputMismatchException e) {
                //用户输入的不是数字
                System.out.println(
                        "输入的数字无效！请重新输入一个数字:");
                continue;
            }
            //判断玩家输入的位置是否已经被占领
            if (gamePanel.getTargetBlock(numInput - 1).equals(String.valueOf(numInput))) {
//                gamePlaneBlock[numInput - 1] = XPlayer;
                gamePanel.setBlock(numInput - 1, currentPlayer);

                if (currentPlayer.equals("X")) {//切换玩家
                    currentPlayer = "O"; //如果当前玩家为X 就修改为 O
                } else {
                    currentPlayer = "X";
                }

                gamePanel.printGamePlane();//输出游戏面板
                winner = checkWinner(winner);
            } else {
                System.out.println(
                        "当前格子已被占领，请重新输入一个格子数字:");
            }
        }
        //平局，直接打印棋盘
        if (winner.getName().equals("equal")) {
            System.out.println(
                    "平局，感谢参与！");
        } else {
            // 游戏结束，有玩家获胜
            System.out.println(
                    "恭喜! " + winner.getName()
                            + " 获得游戏胜利！");
        }
    }
}