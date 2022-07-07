public class BitShift {
    public static void main(String[] args) {
        // 0x400 to binary 0100 0000 0000
        int a = 0x400;
        System.out.println(a);  // 1024
        System.out.println(a >> 1); // 0100 0000 0000 >> 1 -> 0010 0000 0000 to decimalism 512【1024/2】
        System.out.println(a >> 2); // 0100 0000 0000 >> 2 -> 0001 0000 0000 to decimalism 256【1024/4】

        System.out.println(a << 1); // 0100 0000 0000 << 1 -> 1000 0000 0000 to decimalism 2048【1024*2】
        System.out.println(a << 2); // 0100 0000 0000 << 2 -> 0001 0000 0000 0000 to decimalism 4096【1024*4】

        System.out.println(a >>> 1); // 0100 0000 0000 >> 1 -> 0010 0000 0000 to decimalism 512【1024/2】
        System.out.println(a >>> 2); // 0100 0000 0000 >> 2 -> 0001 0000 0000 to decimalism 256【1024/4】

        int b = -0x400;
        System.out.println(b);  // -1024
        System.out.println(b >> 1);
        /* -1024
         * 原码：1100 0000 0000
         * 反码：1011 1111 1111
         * 补码：1100 0000 0000
         * 右移：1010 0000 0000
         * 10 0000 0000 to decimalism 512 result >> -512
         */
        System.out.println(b >> 2);
        /* 补码：1100 0000 0000
         * 右移2：1001 0000 0000 to decimalism -256*/
        System.out.println(b << 1);
        /* 补码：0000 1100 0000 0000
         * 左移1：0001 1000 0000 0000 to decimalism -2048*/
        System.out.println(b << 2);
        /* 补码：0000 1100 0000 0000
         *  左移2：0011 0000 0000 0000 to decimalism -4096*/
        System.out.println(b >>> 1);  // 了解即可
        System.out.println(b >>> 2);


    }
}
