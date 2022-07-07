public class ModCalc {
    public static void main(String[] args) {
        int num = 10;
//        System.out.println(num % 2);  // 0  // 10 / 2 = 2...0 -> 0
//        System.out.println(num % -3);  // 1 // 10 / -3 = -3...1 -> 1
//        System.out.println(num % 4);  // 2  // 10 / 4 = 2...2 -> 1
//        System.out.println(num % 5);  // 0  // 10 / 5 = 2...0  -> 0
//        System.out.println(num % -6);  // 4  // 10 / -6 = -1...4

        int num1 = -10;
        System.out.println(num1 % 2);  // 0
        System.out.println(num1 % -3); // -1
        System.out.println(num1 % 4);  // -2
        System.out.println(num1 % 5);  // 0
        System.out.println(num1 % -6); // -4
        // 结论：被取模的这个数字的正负，影响最后结果的正负
        // 小数的取模也是支持的，但是在我的职业生涯没有遇到过
    }
}
