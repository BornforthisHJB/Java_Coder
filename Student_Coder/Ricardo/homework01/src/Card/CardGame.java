package Card;

/**
 * @ClassName: CardGame
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2023/4/16 07:56
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class CardGame {
    private GameControl control;//游戏控制类，用于控制游戏进程

    public void startGame() {//开始游戏
        System.out.println("====扑克游戏开始====");
        control = new GameControl(); //初始化游戏控制类
        Card playerCard = control.randomGetCard();//随机生成玩家卡片
        Card computerCard = control.randomGetCard();//随机生成电脑卡片
        System.out.println(playerCard.toString());//tostring输出玩家信息
        System.out.println(computerCard.toString());//tostring输出玩家信息
        System.out.println("玩家卡片:" + playerCard.getRank());
        System.out.println("电脑卡片:" + computerCard.getRank());
        String result = control.isSmall(playerCard, computerCard); //判断两个卡片的大小
        if (!result.isEmpty()) {//判断返回结果不为空
            if (result.equals("equal")) {//返回的 equal 字符就是平均
                System.out.println("平局!");
            }
            if (result.equals("smaller")) {//返回的是 smaller 就是 第一个比第二个小
                System.out.println("电脑获胜!" + computerCard.toString());
            }
            if (result.equals("large")) {// 返回的是 large 就是第一个比第二个大
                System.out.println("玩家获胜!" + playerCard.toString());
            }
        } else {
            System.out.println("程序异常，请重新开始!");
        }
    }
}