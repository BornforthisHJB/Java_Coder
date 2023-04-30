package secondGame;

/**
 * 扑克
 */
public class Card {
    public String rank; //牌面值

    public Card(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        //卡片信息输出成字符串
        return "Card{" +
                "rank='" + rank + '\'' +
                '}';
    }
}
