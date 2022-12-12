/**
 * @ClassName: MineSweeper
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/12/8 08:37
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */

import java.util.Random;
import java.util.Scanner;

/**
 * 扫雷游戏
 *
 * @author zjl
 */
public class MineSweeper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //初始化游戏数据
        int[][][] gameData = init();
        while (true) {
            //打印游戏信息
            showInfo();
            //打印游戏框
            showWin(gameData);
            //踩中地雷结束游戏
            //由于踩中地雷会把所有标记变成'*'，所以只需要判断0行0列的显示标记是不是'*'就行了
            if (gameData[0][0][1] == 2) {
                System.out.println("踩中地雷,游戏结束！");
                break;
            }
            //通关结束游戏
            if (missionAccomplished(gameData)) {
                System.out.println("恭喜通关！");
                break;
            }
            //读取控制台数据并对游戏数据数组进行修改
            gameData = readAndChangeData(input, gameData);
        }
    }

    /**
     * 打印提示信息
     */
    private static void showInfo() {
        printBlank(25);
        System.out.println("Start");
    }

    /**
     * 打印游戏框
     */
    private static void showWin(int[][][] gameData) {
        System.out.println("    0 1 2 3 4 5 6 7 8 9" + "\n  ***********************");
        //遍历游戏框中的每个坐标，读取并打印显示符号
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " * ");
            for (int j = 0; j < 10; j++) {
                //读取展示的符号
                char sign;
                switch (gameData[i][j][1]) {
                    case 1:
                        sign = '#';
                        break;
                    case 2:
                        sign = '*';
                        break;
                    case 3:
                        sign = (char) (gameData[i][j][2] + 48);
                        break;
                    default:
                        sign = '?';
                        break;
                }
                //打印符号
                System.out.print(sign + " ");
            }
            System.out.println("*");
        }
        System.out.println("  ***********************");
    }

    /**
     * 打印空白行
     */
    private static void printBlank(int blankNum) {
        for (int i = 0; i < blankNum; i++) {
            System.out.println("");
        }
    }

    /**
     * 随机生成地雷坐标
     */
    private static int[][] createMineCoord() {
        //定义二维数组
        int[][] mineCoordArray = new int[20][2];
        Random random = new Random();
        //将生成的随机坐标存入数组中
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 2; j++) {
                //生成0~9范围内的随机数
                int randomNumber = random.nextInt(10);
                mineCoordArray[i][j] = randomNumber;
            }
        }
        return mineCoordArray;
    }

    /**
     * 初始化游戏数据
     */
    private static int[][][] init() {
        //创建大小为10*10*3的三维数组(默认初始值为0)
        int[][][] gameData = new int[10][10][3];
        //生成随机的地雷坐标，并将其存入游戏数据数组中
        int[][] mineCoordArray = createMineCoord();
        for (int[] mineCoord : mineCoordArray) {
            int row = mineCoord[0];
            int col = mineCoord[1];
            gameData[row][col][0] = 1;
        }
        //计算每格周围地雷数并将其存入游戏数据数组中
        //循环遍历每个坐标
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                //遍历当前坐标周围的8个坐标
                for (int aroundRow = i - 1; aroundRow <= i + 1; aroundRow++) {
                    //行号超范围则跳过
                    if (aroundRow < 0 || aroundRow > 9) {
                        continue;
                    }
                    for (int aroundCol = j - 1; aroundCol <= j + 1; aroundCol++) {
                        //列号超范围则跳过
                        if (aroundCol < 0 || aroundCol > 9) {
                            continue;
                        }
                        //排除本身坐标点
                        if ((gameData[aroundRow][aroundCol][0] == 1) && (!(aroundRow == i && aroundCol == j))) {
                            gameData[i][j][2] += 1;
                        }
                    }
                }
            }
        }
        return gameData;
    }

    /**
     * 从控制台读取数据，并对游戏的数据数组进行修改
     *
     * @param input
     */
    private static int[][][] readAndChangeData(Scanner input, int[][][] gameData) {
        //定义在循环外部，以方便后续使用
        int row;
        int col;
        printBlank(12);
        //读取输入
        //设置循环来读取行号，当输入的行号不在范围内时，会一直提示玩家
        while (true) {
            System.out.print("请输入行号：");
            row = input.nextInt();
            if (row >= 0 && row <= 9) {
                break;
            } else {
                System.out.println("输入的行号不符合规范！");
            }
        }
        //设置循环来读取列号，当输入的行号不在范围内时，会一直提示玩家
        while (true) {
            System.out.print("请输入列号：");
            col = input.nextInt();
            if (col >= 0 && col <= 9) {
                break;
            } else {
                System.out.println("输入的列号不符合规范！");
            }
        }
        //设置循环，防止玩家输入不能识别的字符
        while (true) {
            System.out.print("标记(B)还是直接翻开(F)：");
            String sign = input.next();
            //如果翻开的是炸弹，直接把所有标记变成'*'，并返回结束游戏
            if (sign.equalsIgnoreCase("f")) {
                if (gameData[row][col][0] == 1) {
                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < 10; j++) {
                            gameData[i][j][1] = 2;
                        }
                    }
                    break;
                }
            }
            //修改数据
            if (gameData[row][col][1] != 3) {//gameData[row][col][1] == 3 表示已被翻开，翻开的坐标点不能再被操作
                if (sign.equalsIgnoreCase("b")) {
                    gameData[row][col][1] = 1;
                } else if (sign.equalsIgnoreCase("f")) {
                    //如果翻开的不是炸弹，则显示其周围地雷数
                    if (gameData[row][col][0] != 1) {
                        gameData[row][col][1] = 3;
                    }
                } else {
                    System.out.println("输入不符合要求，请重新输入！");
                    continue;
                }
            }
            break;
        }
        return gameData;
    }

    /**
     * 通关判断
     *
     * @return
     */
    private static boolean missionAccomplished(int[][][] gameDate) {
        //坐标点总数
        int totalSite = 10 * 10;
        //统计地雷数与非地雷数
        int mineSigned = 0;
        int noMineOpen = 0;
        //遍历游戏数据数组
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                //通关条件
                //1、翻开非地雷的位置
                if (gameDate[i][j][0] == 0 && gameDate[i][j][1] == 3) {
                    noMineOpen++;
                }
                //2、地雷位置标记
                if (gameDate[i][j][0] == 1 && gameDate[i][j][1] == 1) {
                    mineSigned++;
                }
            }
        }
        if (totalSite == (noMineOpen + mineSigned)) {
            return true;
        }
        return false;
    }
}
