public class IntegerDiv {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        System.out.println(a / b);  // 3
        System.out.println(b / a);  // 0
        /*
         * 整数的除法运算，和数学中的除法运算是不一样的，从算数的角度来说
         * 10 / 3 得到的结果应该是 3.333333333...但是实际上，我们计算机 Java 得出来的结果是多少呢？——3
         * 这就是整数除法不一样的地方。
         * 这也就是为什么在之前加减乘除的课程中，除法时，我们要在其中一个整数添加上 .0
         * 【也就是说：10 / 3.0 才能得到我们想要的结果，如果只是 10 / 3 的话就只能得到 3】 */
    }
}
