/**
 * @ClassName: BitCalc
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/11/16 23:55
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class BitCalc {
    public static void main(String[] args) {
        /*
         * TODO: 按位并（AND）：&
         * TODO:  按位或（OR）:|
         * TODO: 按位异或（XOR）：^
         * TODO: 按位取反：～
         * */
        /*
         * 1 int = 4 byte
         * 1 byte = 8 bit
         * 4 * 8 = 32
         * 0000 0000 0000 0000 0000 0000 0000 0000
         * 32 dec to bin:<<< 0000 0000 0000 0000 0000 0000 0010 0000
         * TODO: 1101 1111*/
        // F -> 15 -> 1111
        // bin: 1111 1000
        int a = 0xF8;
        // bin: 1111 0100
        int b = 0xF4;
        // bin: 1111 1111
        int c = 0xFF;
        System.out.println(a & b);
        /*
        * a 1111 1000
        * b 1111 0100
        * & 1111 0000 「都为1」真*/
        System.out.println(a | b);
        /*
         * a 1111 1000
         * b 1111 0100
         * | 1111 1100*/
        System.out.println(a ^ b);
        /*
         * a 1111 1000
         * b 1111 0100
         * ^ 0000 1100*/
        System.out.println(~c);
        /*
         * b  1111 0100
         * ~b 0000 1011*/
        int l = 106;
        System.out.println(l >> 1); // right
        System.out.println(l << 1); // left
    }
    /*按工作经验来说：Java 中的按位运算是比较少的。但是，我们要知道有这样一种操作。
    * 这样之后遇到，你就不会一脸懵逼！
    * 在这里，我不推荐你在日后的工作中有使用 位 运算符的倾向，当你想到，这个问题可以使用位运算符解决的时候，
    * 你再想想有没有更好的，更让人容易理解的方法。当然，如果真没有的话就算了。
    * */


}
