/**
 * @ClassName: MainEntry
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2023/4/16 07:58
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */

import TokTacToe.TicTacToeGame;
import Card.CardGame;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 游戏主入口
 */
public class MainEntry {
    public static void main(String[] args) {
        int selectGame = -1;//用户选择的游戏
        while (selectGame == -1) {
            Scanner in = new Scanner(System.in);//获取用户输入的数字
            try {
                System.out.println("1. 3*3 TicTacToeGame:");
                System.out.println("2. 扑克牌比大小 ");
                System.out.println("请输入要玩的游戏:");
                // 等待玩家输入数字
                int userSelect = in.nextInt(); // 获取玩家输入的数字
                if (userSelect == 1 || userSelect == 2) {
                    selectGame = userSelect;//修改用户的选择，让循环可以退出
                    break;
                } else {
                    System.out.println(
                            "输入的数字无效！请重新选择要玩的游戏:");
                    continue;//让用户重新选择
                }

            } catch (InputMismatchException e) {
                //用户输入的不是数字
                System.out.println(
                        "输入的数字无效！请重新输入一个数字:");
                continue;
            }
        }
        if (selectGame == 1) {//判断是否选择了第一个游戏
            new TicTacToeGame().startGame();//开启 TicTac 游戏
        }
        if (selectGame == 2) {//判断是否选择了第二个游戏
            new CardGame().startGame(); // 扑克游戏
        }

    }
}

