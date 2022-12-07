/**
 * @ClassName: BitCalc
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/11/3 01:23
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class BitCalc {
    public static void main(String[] args) {
//        1 int = 4 byte
//        1 byte = 8 bit
//        0000 0000 0000 0000 0000 0000 0000 0000
//        32 dec to bin:>>> 100000
//        0000 0000 0000 0000 0000 0000 0010 0000
//        取反: 0010 0000 >> 1 1101 1111
        int a = 0xF8;
        int b = 0xF4;
        int c = 0xFF;
        // 0 1111 1111
        // 1 0000 0000
        System.out.println(c);
        System.out.println(~c);
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
    }
}
