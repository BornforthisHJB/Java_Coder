public class IncreaseDecrease {
    public static void main(String[] args) {
        int a = 1;
        System.out.println("a++=" + a++);  // a++=1
        System.out.println("a=" + a);   // a=2
        /*等价于：
         * int a = 1;
         * System.out.println("a++=" + a);
         * a = a + 1; // or a += 1;
         * System.out.println("a=" + a);
         * */


        int b = 10;
        System.out.println("b--=" + b--);  // b--=10
        System.out.println("b=" + b);  // b=9

    }
}