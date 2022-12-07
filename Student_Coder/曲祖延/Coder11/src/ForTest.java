/**
 * @ClassName: ForTest
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/11/25 23:31
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
//public class ForTest {
//    public static void main(String[] args) {
////        打印1-100之间13的倍数，使用for循环
//    }
//}

import java.util.Scanner;
// 用户要指定多少的范围
// 用户要指定几的倍数
//用户要指定输出几个结果
//class ForTest {
//    public static void main(String[] args) {
//        //int num = 0;
//        int index = 0;
//        System.out.println("xxxxxxxxxxx");
//        Scanner input = new Scanner(System.in);
//        int fw = input.nextInt();
//        for (int i = 1; i <= fw && index < 3; i++) {
//            if (i % 13 == 0) {
//                index += 1;
//                System.out.println(i);
//            }
//        }
//    }
//}


//
//
//
//
//
//
//
//
class ForTest{
    public static void main(String[] args) {
        for (int i = 1;i <= 8 ;i ++ ){
            for (int j = 1;j <= 20 ;j++ ){
                System.out.print(" " + "*" + " ");
            }
            System.out.println();
        }
    }
}
