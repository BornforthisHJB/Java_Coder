package secondGame;

public class CardGame {
    private GameControl control;

    public void startGame() {
        System.out.println("====扑克游戏开始====");
        control = new GameControl(); //初始化游戏控制类
        Card playerCard = control.randomGetCard();//随机生成玩家卡片
        Card computerCard = control.randomGetCard();//随机生成电脑卡片
        System.out.println("玩家卡片:" + playerCard.getRank());
        System.out.println("电脑卡片:" + computerCard.getRank());
        String result = control.isSmall(playerCard, computerCard); //判断两个卡片的大小
        if (!result.isEmpty()) {
            if (result.equals("equal")) {
                System.out.println("平局!");
            }
            if (result.equals("smaller")) {
                System.out.println("电脑获胜!" + computerCard.toString());
            }
            if (result.equals("large")) {
                System.out.println("玩家获胜!" + playerCard.toString());
            }
        } else {
            System.out.println("程序异常，请重新开始!");
        }
    }
}
