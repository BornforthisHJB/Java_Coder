package TokTacToe;

import java.util.Arrays;
/**
 * @ClassName: GamePanel
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2023/4/16 06:11
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */

/**
 * 游戏面板类
 */
public class GamePanel {
    private String[] gamePlaneBlock;  //  面板上面的每个游戏方格
    private int playGroudSize = 9; // 游戏面板的大小（常量）

    /**
     * 设计一个备用构造函数
     */
    public GamePanel(int playGroudSize) {
        // 构造函数
        // 可以传入游戏面板的大小
        this.playGroudSize = playGroudSize;

    }

    /**
     * 访问器
     * 获取游戏面板大小
     */
    public String[] getGamePlaneBlock() {
        return gamePlaneBlock;
    }

    /**
     * 获取指定游戏面板上面的格子
     *
     * @param index
     * @return
     */
    public String getTargetBlock(int index) {
        if (getGamePlaneBlock().length > 0) {//先判断是否有blocks
            return getGamePlaneBlock()[index];
        } else
            return "";
    }

    /**
     * 修改格子的内容
     *
     * @param index      具体格子的角标
     * @param playerName //格子内容为玩家名字
     */
    public void setBlock(int index, String playerName) {
        if (getGamePlaneBlock().length > 0) {
            getGamePlaneBlock()[index] = playerName;
        }
    }

    /**
     * 判断是否还有未被占领的格子
     * 返回 true false
     *
     * @return
     */
    public boolean hasEmptyBLock() {
        for (int i = 0; i < getGamePlaneBlock().length; i++) {
            if (getGamePlaneBlock()[i].equals(String.valueOf(i + 1))) {
                return true;
            }
        }
        return false;
    }

    /**
     * 修改器
     * 修改游戏面板格子数量
     */
    public void setGamePlaneBlock(String[] gamePlaneBlock) {
        this.gamePlaneBlock = gamePlaneBlock;
    }

    /**
     * 访问器
     * 获取游戏面板的大小
     */
    public int getPlayGroudSize() {
        return playGroudSize;
    }

    /**
     * 设置游戏面板大小
     */
    public void setPlayGroudSize(int playGroudSize) {
        this.playGroudSize = playGroudSize;
    }

    /***
     * 在控制住打印游戏面板

     |---|---|---|
     | 1 | 2 | 3 |
     |-----------|
     | 4 | 5 | 6 |
     |-----------|
     | 7 | 8 | 9 |
     |---|---|---|
     */
    public void printGamePlane() {
        System.out.println("|---|---|---|");
        //第一行数字
        System.out.println("| " + getGamePlaneBlock()[0] + " | "
                + getGamePlaneBlock()[1] + " | " + getGamePlaneBlock()[2]
                + " |");
        System.out.println("|-----------|");
        //第二行数字
        System.out.println("| " + getGamePlaneBlock()[3] + " | "
                + getGamePlaneBlock()[4] + " | " + getGamePlaneBlock()[5]
                + " |");
        System.out.println("|-----------|");
        ////第三行数字
        System.out.println("| " + getGamePlaneBlock()[6] + " | "
                + getGamePlaneBlock()[7] + " | " + getGamePlaneBlock()[8]
                + " |");
        System.out.println("|---|---|---|");
    }

    @Override
    public String toString() {
        //游戏面板信息输出成字符串
        //显示游戏面板格子数量
        //显示游戏面板大小
        return "GamePanel{" +
                "gamePlaneBlock=" + Arrays.toString(gamePlaneBlock) +
                ", playGroudSize=" + playGroudSize +
                '}';
    }
}
