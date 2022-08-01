public class HelloQuickSand {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;

//        System.out.println(a & b);  // false
//        System.out.println(a && b);  // false
//
//        System.out.println(a | b);  // true
//        System.out.println(a || b);  // true

        System.out.println(a & (10 / 0) > 1);
    }
}
