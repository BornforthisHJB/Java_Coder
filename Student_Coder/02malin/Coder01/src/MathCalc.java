public class MathCalc {
    // Java 就是一个一个类
    // 单行注释
    // 计算加减乘除
    // 基本数据类型——int
    // 关键字（key word）和标示符（Identifier）
    // 用变量解决问题
    /*
        计算加减乘除的程序「MathCalc.java」
        - 字面值（literal value）写几就是几
        - 加减乘除运算符
        如何方便的计算类似 y=a*x+b*x*x+c*x*x*x 这样的公式?
        */
    /*NoteBook：
     * psvm: public static void main(String[] args)
     * sout: System.out.println();
     * control + Alt + L: 代码格式化、代码规范化、代码美化*/
    public static void main(String[] args) {
//        System.out.println("Hello aiyuechuang.");
        System.out.println("5+6"); // 双引号是个字符串 5 + 6
        System.out.println(5 + 6); // 11
        System.out.println(5 - 6); // -1
        System.out.println(5 * 6);
        System.out.println(5 / 6.0);
        System.out.println((1 + 2 - 3) * 4 / 5.0); // 0.0
        System.out.println((1 + 2 + 3) * 4 / 5.0); // 4.8
        System.out.println(2 * 5 + 2 * 5 * 5 + 3 * 5 * 5 * 5);
    }
}
