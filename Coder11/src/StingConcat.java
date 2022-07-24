public class StingConcat {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("a + b=" + c);  // 把被加的 c 转成字符串

        boolean aBiggerThanB = a > b;
        System.out.println("a > b 是" + aBiggerThanB + "的");

        System.out.println("a + b=" + a + b); // 考运算符优先级

        System.out.println("a + b =" + (a + b));

        System.out.println("a * b=" + a * b);

    }
}