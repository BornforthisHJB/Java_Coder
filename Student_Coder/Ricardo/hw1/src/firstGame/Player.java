package firstGame;

public class Player {
    private String name;//玩家名称

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
