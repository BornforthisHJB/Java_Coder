public class IncreaseDecrease2 {
    public static void main(String[] args) {
        int a = 1;
        System.out.println("a++=" + a++);  // a++=1
        System.out.println("a=" + a);  // a=2
        a = 1;
        System.out.println("++a=" + (++a));  // ++a=2
//        System.out.println("++a=" + ++a);  // ++a=2
        System.out.println("a=" + a);  // a=2


        int b = 10;
        System.out.println("b--=" + b--);  // b--=10
        System.out.println("b=" + b);   // b=9

        b = 10;
        System.out.println("--b=" + --b);  // --b=9
        System.out.println("b=" + b);  // b=9
    }
}