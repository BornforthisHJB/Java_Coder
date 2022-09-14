public class BitCalc {
    public static void main(String[] args) {
//        F -> 15 -> 1111
//        F == 15 == 1111
//        1111 1000
        int a = 0xF8;
//        1111 0100
        int b = 0xF4;
        // 1111 1111
        int c = 0xFF;

        System.out.println(a & b); // 1111 0000
        System.out.println(a | b); // 1111 1100
        System.out.println(a ^ b); // 0000 1100 // 12
        System.out.println(~c);  // 0000 0000

    }
}
