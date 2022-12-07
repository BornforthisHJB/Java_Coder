public class LiteralNumber {
    public static void main(String[] args) {
        /*
            字面值的八进制和十六进制
            按位运算符
            位移运算符
            位运算符不会改变原变量的值
            位运算符用处
        */
        // 以 0 开头的整数为八进制
        // 05 就是十进制的 5
        // 011 就是十进制的 9
        // 0x开头的整数为十六进制
        // 0、1、2、3、4、5、6、7、8、9、A、B、C、D、E、F;
        // 0xF
        // 0x11 17
        int a = 05;
        int b = 011;
        int c = 1;
        int y = c + b;
        int z = 0xF;
        int v = 0x11;

        System.out.println(a);
        System.out.println(b);
        System.out.println(0111);
        System.out.println(y);
        System.out.println(z);
        System.out.println(v);

    }
}
