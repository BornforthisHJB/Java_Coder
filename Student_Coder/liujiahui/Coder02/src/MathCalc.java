/*计算加减乘除的程序（例程）MathCalc
* - 字面值：（literal value）写几就是几
* - 加减乘除运算符
* Q: 如何方便的计算类似 y = a * x + b * x * x + c * x * x * x */
public class MathCalc {
    public static void main(String[] args) {
        System.out.println("5+6");  // 双引号是个字符串 5 + 6
        System.out.println(5 + 6); // 11
        System.out.println(5 - 6); // -1
        System.out.println(5 * 6); // 30
        System.out.println(5 / 6.0); // 0.833333
        System.out.println(5 / 6);  //???
        System.out.println((1 + 2 - 3) * 4 / 5.0); //???
        System.out.println((1 + 2 + 3) * 4 / 5.0); //???
    }
}
