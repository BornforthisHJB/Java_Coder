/**
 * @ClassName: demo
 * @Description: TODO
 * @Author: Zuyan Qu
 * @date: 2023/1/9 12:17
 * @Version: V1.0
 */

import java.util.Scanner;
import java.util.Random;

public class demo4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number ");
//        int guess_num = input.nextInt(101);

//int count=0;
//int i=0;


        Random n = new Random();//生成随机数字
        int num2 = n.nextInt(100) + 1;
//        int s=guess_num-num2;
        //表示绝对值
        System.out.println("the right answer is:" + num2);

//        int s2=num2-num;

        while (true) {
            for (int i = 0; i < 11; i++) {
                System.out.println("Enter a num");
                int guess_num = input.nextInt();
                if (i == 10) {
                    System.out.println("you lose all the chances");
                }
                int minus = Math.abs(num2 - guess_num);
                if (minus < 10) {
                    System.out.println("very close");
                }
                if (num2 == guess_num) {
                    System.out.println("you did it!");
                    break;
                } else if (num2 < guess_num) {
                    System.out.println("bigger than that num try again");
                } else if (num2 > guess_num) {
                    System.out.println("smaller than that num try again");

                }
                if (minus < 10) {
                    System.out.println("very close, the num is in a range of 10");

                } else if (minus > 30) {
                    System.out.println("to far bigger try again");

                }

            }
        }
    }
}


//        if(num2==num){
//            System.out.println("try again('yes'or'no')");
//            String c= input.next();
//            if(c.equals('y')){
//                count=1;
//                i=1;
//            }else {
//                System.out.println("game over");
//            }
//        }
//            String decision = input.next();
//            System.out.println("you wanna play again(enter 'yes' or 'no')?");
//            if (decision.equals("yes")) {
//
//            } else {
//                System.out.println("gama over");


//    }
//}





