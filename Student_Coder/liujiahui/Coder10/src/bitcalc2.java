/**
 * @ClassName: bitcalc2
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/11/9 23:38
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class bitcalc2 {
    public static void main(String[] args) {
        int a = 0x400;
        System.out.println(a);  // 1024
        System.out.println(a >> 1); // 512
//        0100 0000 0000
//        0010 0000 0000 0
        System.out.println(a >> 2); // 256
        System.out.println(a >> 3); // 128
//        System.out.println(a <<);
        int b = -0x400;
        System.out.println(b);
        System.out.println(b >> 1);

    }
}
