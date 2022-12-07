/**
 * @ClassName: demo
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/11/25 23:26
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class demo {
    public static void main(String[] args) {
        int sum = 0;
//        int i;
        int sum2 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
//                System.out.println(i);
            } else {
                sum2 += i;
            }
        }
        System.out.println("even=" + sum);
        System.out.println("odd=" + sum2);
    }
}
