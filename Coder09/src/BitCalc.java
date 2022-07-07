public class BitCalc {
    public static void main(String[] args) {
        // F->15-> 1111
        // 二进制的 1111 1000
        int a = 0xF8;
        // 二进制的 1111 0100
        int b = 0xF4;
        // 二进制的 1111 1111
        int c = 0xFF;
        System.out.println(a & b); // 240
        System.out.println(a | b); // 252
        System.out.println(a ^ b); // 12
        System.out.println(~c); // -256
    }
}

/* 补充：
a	1111 1000
b	1111 0100
&	1111 0000
|	1111 1100
^	0000 1100
C	255 > 11111111
～	-255
*/