public class BitOprtNotChangeVariableValue {
    public static void main(String[] args) {
        int a = 0x400;  // 0100 0000 0000 // 1024
        int b = 0xF4;
        int c = 0xFF;

        System.out.println(a >> 2);  // 256
        System.out.println(~a);  // -1025
        /* 原码：0100 0000 0000
        *  反码：0011 1111 1111
        *  补码：0100 0000 0000
        *  取反：1011 1111 1111 逐位取反，包括符位
        *  补码减1：1011 1111 1110
        *  再取反：1100 0000 0001 -> 取反后的二进制是负数 -> -1025
        */

        System.out.println(a | 0x8);
        /* 原码：*/

        System.out.println(a);  // 1024
    }
}