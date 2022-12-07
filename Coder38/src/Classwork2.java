/**
 * @ClassName: Classwork2
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/11/27 08:20
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */

import java.util.Scanner;

public class Classwork2 {
    public static void main(String[] args) {
        System.out.print("请输入您想要的倍数:>>> ");
        Scanner input1 = new Scanner(System.in);
        int multiplier = input1.nextInt();
        System.out.print("请输入您想要的范围:>>> ");
        Scanner input2 = new Scanner(System.in);
        int scope = input2.nextInt();
        System.out.print("请输入您想要的结果数量:>>> ");
        Scanner input3 = new Scanner(System.in);
        int numOfResults = input3.nextInt();

//        System.out.println(multiplier);
//        System.out.println(scope);
//        System.out.println(numOfResults);

        int index = 0;

        for (int i = 1; i < scope && index < numOfResults; i++) {
            if (i % multiplier == 0) {
                index += 1;
//                System.out.println(multiplier + " * " + i + " = " + (multiplier * i));
                System.out.println(i);
            }
        }
    }
}
/*修饰符   当前类    同一包内   子孙类（同一包内）   子孙类（不同包）   其他包
* public Y             Y      Y                     Y           Y
* protected  Y          Y       Y               Y/N「之后补充」   N
* default    Y          Y       Y                   N           N
* private    Y          N       N                   N           N
* */
