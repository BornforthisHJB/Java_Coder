import java.util.Scanner;

public class AutoConvert {
    public static void main(String[] args) {
        /*int 是 4 byte，long 是 8 byte，所以对于计算机来说，
        虽然不合适，但是 long 可以包容 int 这个 4 byte 所以可以自动转换。
        下面几个代码都是一样的，就是要告诉你 Java 会自动帮我们把数据从低精度
        转到高精度——隐性转换*/
//        int intVal = 99;
//        long longVal = intVal;
//        long longVal2 = intVal + 1;
//        System.out.println(longVal2);
//
//        float floatVal = 11.32f;
//        double doubleVal = floatVal;
//        double doubleVal2 = floatVal * 2;
//        System.out.println(doubleVal2);
//
//        doubleVal = longVal;
//        doubleVal = intVal;
//
//        floatVal = intVal;
//        floatVal = longVal;
        Scanner inVar = new Scanner(System.in);  // 实例化
        String s = inVar.nextLine();  // 获取字符串
        System.out.println(s);
        int num = inVar.nextInt();
        System.out.println(num);
//        char ch = 'T';
//        int chNum = ch;
////        int chNumCalc = ch + 10;
//        System.out.println(ch);
//        System.out.println(chNum);
//        char cc = (char) (ch + 1);
//        System.out.println(cc);

//        int a = 99;
////        int b = 5;
//        double b = 5;
//        System.out.println(a / b);
    }
}