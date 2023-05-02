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

public class MainEntry {
    public static void main(String[] args) {
        int selectGame = -1;
        CardGame cardGame = new CardGame();
        while (selectGame != 0) {
            Scanner in = new Scanner(System.in);
            try {
                System.out.println("请选择游戏:");
                System.out.println("1. 3*3 TicTacToeGame");
                System.out.println("2. 扑克牌比大小");
                System.out.println("3. 查看金币");
                System.out.println("0. 退出");
                selectGame = in.nextInt();

                switch (selectGame) {
                    case 1:
                        TicTacToeGame ticTacToeGame = new TicTacToeGame();
                        ticTacToeGame.startGame();
                        break;
                    case 2:
                        cardGame.startGame();
                        break;
                    case 3:
                        cardGame.showPlayerCoins();
                        break;
                    case 0:
                        System.out.println("感谢您的参与，再见!");
                        break;
                    default:
                        System.out.println("无效的输入，请重新选择");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("无效的输入，请输入数字");
                in.nextLine(); // 清空输入缓冲
            }
        }
    }
}

