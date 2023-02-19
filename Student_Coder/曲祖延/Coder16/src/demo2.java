/**
 * @ClassName: demo
 * @Description: TODO
 * @Author: Zuyan Qu
 * @date: 2023/1/9 12:17
 * @Version: V1.0
 */
import java.util.Scanner;
import java.util.Random;

public class demo2 {
    public static void main(String[] args) {
        /*
        * 1. 超过规定回答次数，输出答案
        * 2. 游戏如何继续
        * 3. 游戏回答错误次数统计
        * 4. 游戏退出指令
        * 5. 游戏指定范围
        * 6. 给游戏添加一个玩家名称
        * 7. 开始游戏前，生成游戏说明
        */
        Scanner input = new Scanner(System.in);
//        System.out.print("输入你要猜的数字：");
//        int num = input.nextInt();
        //int count=0;
        //int i=0;
        Random n = new Random();  // 生成随机整数
        int guess_num = n.nextInt(100) + 1;  // 生成要猜的数字 0～1
        System.out.println("正确答案是：" + guess_num);
//        int s = num - guess_num; // 求差

//        int s2 = guess_num - num;
//        int minus = Math.abs(num - guess_num);  // 绝对值
        int total_guess = 10;
        int user_guess_index = 0;
        boolean game_start = true;
        while (game_start && user_guess_index < total_guess) {
            System.out.print("输入你要猜的数字：");
            int user_guess = input.nextInt();
            user_guess_index++;

            int minus = Math.abs(user_guess - guess_num);  // 绝对值
            if (minus < 10) {
                System.out.println("你的答案很接近了。");
            } else if (minus > 30) {
                System.out.println("你距离答案越来越远了......");
            }

            if (guess_num == user_guess) {
                System.out.println("猜对了。");
//                break;
                game_start = false;
            } else if (user_guess > guess_num) {
                System.out.println("猜的数字太大了");
            } else {
                System.out.println("猜的数字太小了");
            }
        }
    }
}
//    }
//}





