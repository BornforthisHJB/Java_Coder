/**
 * @ClassName: Game
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2023/5/2 09:01
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */

/**
 * class 2 游戏类
 * 包含有 id, name, numOfPlayers, platform 属性
 */
public class Game {
    private int id;
    private String name;
    private int numOfPlayers;
    private String platform;

    public Game(int id, String name, int numOfPlayers, String platform) {
        this.id = id;
        this.name = name;
        this.numOfPlayers = numOfPlayers;
        this.platform = platform;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getNumOfPlayers() {
        return numOfPlayers;
    }

    public String getPlatform() {
        return platform;
    }

    public void setNumOfPlayers(int numOfPlayers) {
        this.numOfPlayers = numOfPlayers;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}