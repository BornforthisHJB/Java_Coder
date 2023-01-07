package demo;

import java.util.Scanner;
import java.util.regex.Pattern;

public class gameLauncher {
    /**
     * 判断输入的坐标是否正确的正则
     */
    public static final String REGEX_GAME_PANEL_POS = "\\d{1,3}\\s{1}\\d{1,3}";
    public static final String REGEX_GAME_PANEL_POS2 = "\\d{1,3}";
    private static Board board;
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int dimension = 10;
        int numOfMine = 10;
        board = new Board(dimension, numOfMine);
        MinePlayer minePlayer = new MinePlayer(0);
        minePlayer.setBoard(board);
        startGuess(minePlayer);
    }

    private static void startGuess(MinePlayer minePlayer) {
        System.out.println("************命令行扫雷游戏************");
        System.out.println();
        board.printBoard(0);
        //地雷 横纵坐标同时输入
//        digMine(minePlayer);
        //地雷 横纵坐标分开输入
        digMine2(minePlayer);
    }

    /**
     * 游戏开始主函数
     *
     * @param minePlayer
     */
    private static void digMine(MinePlayer minePlayer) {
        while (true) {
            String inputPosition = "";
            System.out.print("请输入您要选择的位置坐标，以空格分隔，第一个为纵坐标，第二个为横坐标，以回车键确认: ");
            inputPosition = reader.nextLine();
            if (Pattern.matches(REGEX_GAME_PANEL_POS, inputPosition)) {
                int rows = Integer.parseInt(inputPosition.split(" ")[0]);
                int cols = Integer.parseInt(inputPosition.split(" ")[1]);
                if (rows >= 0 && rows < board.getPanelRow()) // 输入检查
                {
                    if (cols >= 0 && cols < board.getPanelCol()) {
                        boolean flag = checkMine(rows, cols, minePlayer);
                        board.printBoard(0);
                        if (flag) {
                            System.exit(0);
                        }

                    } else {
                        System.out.println("========================");
                        System.out.println("  坐标托板！请重新输入");
                        System.out.println("========================");
                    }


                } else {
                    System.out.println("========================");
                    System.out.println("  坐标托板！请重新输入");
                    System.out.println("========================");
                }

            } else {
                System.out.println();
                System.out.println("输入坐标异常请重新输入!");
                System.out.println();
            }

        }
    }
    private static void digMine2(MinePlayer minePlayer) {
        while (true) {
            int mineRow = -1;
            int mineCol = -1;
            while (true) {
                System.out.print("请输入地雷横坐标: ");
                String row = reader.next();
                if (Pattern.matches(REGEX_GAME_PANEL_POS2, row)) {
                    mineRow = Integer.parseInt(row);
                    break;
                } else {
                    System.out.println("地雷横坐标输入异常，请重新输入！ ");
                }
            }
            while (true) {
                System.out.print("请输入地雷纵坐标: ");
                String col = reader.next();
                if (Pattern.matches(REGEX_GAME_PANEL_POS2, col)) {
                    mineCol = Integer.parseInt(col);
                    break;
                } else {
                    System.out.println("地雷纵坐标输入异常，请重新输入！ ");
                }
            }

            if (mineRow >= 0 && mineRow < board.getPanelRow()) // 输入检查
            {
                if (mineRow >= 0 && mineRow < board.getPanelCol()) {
                    boolean flag = checkMine(mineRow, mineCol, minePlayer);
                    board.printBoard(0);
                    if (flag) {
                        System.exit(0);
                    }

                } else {
                    System.out.println("========================");
                    System.out.println("  坐标托板！请重新输入");
                    System.out.println("========================");
                }


            } else {
                System.out.println("========================");
                System.out.println("  坐标托板！请重新输入");
                System.out.println("========================");
            }


        }

    }

    /**
     * 判断玩家输入的位置是否有地雷
     *
     * @param row
     * @param col
     * @param minePlayer
     * @return
     */
    private static boolean checkMine(int row, int col, MinePlayer minePlayer) {
        if (minePlayer.getBoard().getStatus(row, col) == Location.UNGUESSED) {
            if (minePlayer.getBoard().hasMine(row, col)) {
                minePlayer.getBoard().markHit(row, col);
                System.out.println("恭喜你踩到雷了！！");
                System.out.println();
                return true;
            } else {
                System.out.println("此处没有雷！！");
                minePlayer.getBoard().markShowNearby(row, col);
                minePlayer.getBoard().checkSquare(row, col);
                return false;
            }
        } else {
            System.out.println();
            System.out.println("此坐标已经输入过！！请重新输入坐标");
            System.out.println();
            return false;
        }
    }

}
