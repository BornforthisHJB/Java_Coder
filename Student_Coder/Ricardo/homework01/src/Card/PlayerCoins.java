package Card;

/**
 * @ClassName: PlayerCoins
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2023/5/1 00:21
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */

public class PlayerCoins {
    private int coins;

    public PlayerCoins(int coins) {
        this.coins = coins;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public void addCoins(int coins) {
        this.coins += coins;
    }

    @Override
    public String toString() {
        return "PlayerCoins{" +
                "coins=" + coins +
                '}';
    }
}
