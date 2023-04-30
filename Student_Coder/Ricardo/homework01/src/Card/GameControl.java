package Card;

/**
 * @ClassName: GameControl
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2023/4/16 07:56
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */

import java.util.ArrayList;
import java.util.Random;

/**
 * 游戏控制
 */
public class GameControl {

    ArrayList<Card> cards = new ArrayList<Card>(); // 卡片数组（顺序就是卡片大小）
    ArrayList<Card> allCards = new ArrayList<Card>();//所有卡片

    public GameControl() {
        initCards(); //初始化卡片信息
        intiGame();//初始化游戏所有信息
    }

    /**
     * 初始化扑克
     */
    private void initCards() {
        //按扑克大小生成对应的卡片
        String[] cardNum = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        for (int i = 0; i < cardNum.length; i++) {
            cards.add(new Card(cardNum[i]));
        }
    }

    /**
     * 初始化 52 张卡片
     */
    private void intiGame() {
        for (int i = 0; i < cards.size(); i++) {//循环每个卡片的数字
            for (int j = 1; j < 5; j++) { //每个对应的数字对应着 4 张卡
                allCards.add(cards.get(i));//把生成的卡片放入所有卡片的数组中
            }
        }
    }

    /**
     * 随机获取一张卡片
     * 返回卡片
     *
     * @return
     */
    public Card randomGetCard() {
        // 随机生成 0 - allCards.size() 的一个整数，不包含 allCards.size()
        int index = new Random().nextInt(allCards.size());
        return allCards.get(index);//获取指定位置的Card
    }

    /**
     * 判断 first 是否比 second 小
     * 返回 false 或者 true
     */
    public String isSmall(Card first, Card second) {
        int firstIndex = -1; //选择的第一幅
        int secondIndex = -1; // 选择的第二个
        for (int i = 0; i < cards.size(); i++) { //循环所有卡片信息
            Card card = cards.get(i);
            if (card.getRank().equals(first.getRank())) {//如果第一个数字在 cards 中就获取对应的角标
                firstIndex = i;
            }
            if (card.getRank().equals(second.getRank())) {//如果第二个数字在 cards 中就获取对应的角标
                secondIndex = i;
            }

        }
        if (firstIndex == secondIndex) {//第一个与第二个相等
            return "equal";
        }
        if (firstIndex < secondIndex) {//第一个比第二个小
            return "smaller";
        }
        if (firstIndex > secondIndex) {//第一个比第二个大
            return "large";
        }
        return "";//没有找到对应的卡片，直接返回空
    }

    @Override
    public String toString() {
        // 游戏控制类输出成字符串
        //显示卡片数组
        //显示所有卡片
        return "GameControl{" +
                "cards=" + cards +
                ", allCards=" + allCards +
                '}';
    }
}

