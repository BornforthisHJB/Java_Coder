/**
 * @ClassName: BitOprtNotChangeVariableValue
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/11/24 00:16
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class BitOprtNotChangeVariableValue {
    public static void main(String[] args) {
        int a = 0x400;
        int b = 0xF4;
        int c = 0xFF;
        System.out.println(a >> 2); // 256
        System.out.println(~a); // -1025 1011 1111 1111

        System.out.println(a | 0x8);

    }
}
