public class CompareOprt {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 15;
//        int c = 10;

        byte a = 10;
        byte b = 15;
        byte c = 10;

        System.out.println(a > b); // false
        System.out.println(a >= b); // false
        System.out.println(a < b); // true
        System.out.println(a <= b); // true
        System.out.println(a != b); // true

        System.out.println(a != c); // false
        System.out.println(a >= c); // true
        System.out.println(a <= c); // true
        System.out.println(a == b); // false
        System.out.println(a == c); // true

    }
}
