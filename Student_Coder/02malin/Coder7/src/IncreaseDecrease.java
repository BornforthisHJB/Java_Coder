/**
 * @ClassName: IncreaseDecrease
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/12/6 07:16
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class IncreaseDecrease {
    public static void main(String[] args) {
        int a = 1;
        System.out.println("a++" + a++); //
        System.out.println("a=" + a);  //
        /**
         * 等价于：
         * int a = 1;
         * System.out.println("a++=" + a);
         * a = a + 1; // or a += 1;
         * System.out.println("a=" + a);
         * 多行注释：control + shift + /
         * ins
         */
        int b = 10;
        System.out.println("b--=" + b--);
        System.out.println("b=" + b);

    }
}
