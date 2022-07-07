public class BitOprtNotChangeVariableValue {
    public static void main(String[] args) {
        int a = 0x400;  // 0100 0000 0000 // 1024
        int b = 0xF4;
        int c = 0xFF;

        System.out.println(a >> 2);  // 256
        System.out.println(~a);  // -1025
        /* 原码：0100 0000 0000
        * 反码：1011 1111 1111
        * 补码：1100 0000 0000
        * 逐位取反，包括符位
        * 1000 0011 1111 1111
        * 1000 0100 0000 0000
        * 取反后的二进制是负数，所以要以补码的形式存放，所以将其转换成补码：*/

        System.out.println(a | 0x8);

        System.out.println(a);  // 1024
    }
}