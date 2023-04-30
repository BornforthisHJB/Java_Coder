package TokTacToe;

/**
 * @ClassName: Player
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2023/4/16 07:03
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class Player {
    private String name;//玩家名称

    /**
     * 备用构造函数
     */
    public Player(String name) {
        //构造函数
        this.name = name;
    }

    public String getName() {
        return name;//获得玩家名称
    }

    public void setName(String name) {
        this.name = name;//设置玩家名称
    }

    @Override
    public String toString() {
        //玩家信息输出成字符串
        return "Player{" +
                "name='" + name + '\'' +
                '}';
    }
}