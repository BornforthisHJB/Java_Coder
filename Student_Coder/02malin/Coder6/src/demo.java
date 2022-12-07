/**
 * @ClassName: demo
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/11/23 23:20
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class demo {
    public static void main(String[] args) {
        // 0x400 to binary 0100 0000 0000
        int a = 0x400;
        System.out.println(a);  // 1024
        System.out.println(a >> 1); // 0100 0000 0000 >> 1 -> 0010 0000 0000
        System.out.println(a >> 2); // 0100 0000 0000 >> 1 -> 0001 0000 0000
        System.out.println(a >> 3);  // 0100 0000 0000

        System.out.println(a << 1);  // 0100 0000 0000 << 0000 1000 0000 0000
        System.out.println(a << 2);
        System.out.println(a << 3);

        int b = -0x400;
        System.out.println(b);
        System.out.println(b >> 2);
        System.out.println(b >> 3);
        /*-1024
        * 原码：1100 0000 0000
        * 反码：1011 1111 1111
        * 补码：1100 0000 0000
        * 右移：1010 0000 0000*/
    }
}
