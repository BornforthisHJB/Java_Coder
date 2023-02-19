/**
 * @ClassName: demo
 * @Description: TODO
 * @Author: Zuyan Qu
 * @date: 2023/1/9 12:17
 * @Version: V1.0
 */
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
import java.util.Random;
public class demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = input.nextInt();
//int count=0;
//int i=0;
        Random n = new Random();
        int num2 = n.nextInt(100) + 1;
        int s=num-num2;

        int s2=num2-num;
        if(s>10){
            System.out.println("very close");
        }
        while (true) {
            if (num2 < num) {
                System.out.println("bigger than that num try again");
            } else if (num2 == num) {
                System.out.println("you did it!");
                break;
            } else if (num2 > num) {
                System.out.println("smaller than that num try again");

            } else if (s < 10) {
                System.out.println("very close, the num is in a range of 10");

            } else if (s > 30) {
                System.out.println("to far bigger try again");
                break;
            }else if (s2 < 10) {
                System.out.println("very close, the num is in a range of 10");

            } else if (s2> 30) {
                System.out.println("to far smaller try again");
                break;}
            System.out.print("enter another number");
            num = input.nextInt();
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
            }
        }
//    }
//}





