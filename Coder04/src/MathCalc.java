public class MathCalc {
    public static void main(String[] args) {
        System.out.println("5+6"); // 双引号是个字符串 5+6
        System.out.println(5 + 6);  // 11
        System.out.println(5 - 6); // -1
        System.out.println(5 * 6);  // 30
        System.out.println(5 / 6.0);  // 后面带你解析，为什么加 .0 // 0.8333333333333334
        System.out.println((1 + 2 - 3) * 4 / 5.0);  // 0.0
        System.out.println((1 + 2 + 3) * 4 / 5.0);  // 4.8

        System.out.println(2 * 5 + 2 * 5 * 5 + 3 * 5 * 5 * 5);  // 435
    }
}
