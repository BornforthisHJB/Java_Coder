/**
 * @ClassName: ModCalc
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/11/7 18:27
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class ModCalc {
    public static void main(String[] args) {
//        int num = 10;
//        System.out.println(num % 2); // 0
//        System.out.println(num % -3); // 输出什么：1
//        System.out.println(num % 4);  // 2
//        System.out.println(num % 5);
//        System.out.println(num % -6);
        int num = 911;
//        7
//        52
        int gewei = num % 10;
        int shiwei = num / 10;
        System.out.println(shiwei + gewei);
        System.out.println(gewei * 10 + shiwei);


//        System.out.println(num % 2); // 0
//        System.out.println(num % -3); // 1
//        System.out.println(num % 4);  // -2
//        System.out.println(num % 5);  // 0
//        System.out.println(num % -6); // 4
    }
}
