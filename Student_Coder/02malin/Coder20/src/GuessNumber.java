/**
 * @ClassName: GuessNumber
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2023/1/7 07:23
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */

import java.util.Scanner;  // 用户输入相关

public class GuessNumber {
    public static void main(String[] args) {
        /*
         * 用户输入所猜的数字
         * 用户要猜数字的范围，输入最多能错几次。
         * 不停的猜数字，记录用户猜数字的次数「猜（玩）了几次」、猜错了几次。输入 q 退出猜数字游戏。
         * 如果，玩家输入的次数超过规定错误次数，则输出正确结果，且询问是否继续游戏。
         * */
        Scanner in = new Scanner(System.in);  // 实例化输入
        boolean start_game = true;
        while (start_game) {
            System.out.println("--------Game Start--------");
            System.out.println("Game Description：\n\ta. Game Name「Guess Number」\n\tb. Rules:\n\t\t" +
                    "1. 输入猜数字的范围;\n\t\t" +
                    "2. 输入最多的猜几次;\n\t\t" +
                    "3. 你可以开始猜数字啦～\n\t\t" +
                    "4. 你可以选择继续游戏也可以选择退出游戏:\n\t\t\t" +
                    "a. keep「k」\t\tb. quit「q」\n\t" +
                    "游戏正在加载......");
            System.out.print("Player Name:>>>");
            String player_name = in.next();

            System.out.print("Digital range start:>>>");
            int digital_range_star = in.nextInt();
            System.out.print("Digital range end:>>>");
            int digital_range_end = in.nextInt();
            System.out.println("你输入的数字范围为:[" + digital_range_star + ":" + digital_range_end + "]");
//            System.out.println(player_name);
//            start_game = false;
        }

    }
}
