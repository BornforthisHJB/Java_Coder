package Card;

/**
 * @ClassName: Card
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2023/4/16 07:56
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */

/**
 * 扑克
 */
public class Card {
    public String rank; //牌面值

    /**
     * 备用构造函数
     */
    public Card(String rank) {
        this.rank = rank;
    }

    /**
     * 访问器
     */
    public String getRank() {
        return rank;
    }

    /**
     * 修改器
     */
    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        //卡片信息输出成字符串
        //显示牌面数字
        return "Card{" +
                "rank='" + rank + '\'' +
                '}';
    }
}

