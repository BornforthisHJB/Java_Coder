/**
 * @ClassName: demo
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/11/13 22:33
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class demo {
    public static void main(String[] args) {
//        char ch = 'a';
//        System.out.println(ch);
//        int intCh = ch;
//        System.out.println(intCh);
//        int num = 97;
//        char num_to_char = (char) num;
//        System.out.println(num_to_char);
        /*int 是 4 byte ，long 是 8 byte
         * 所以对于计算机来说：虽然不合适，但是 long 可以包容 int 这个 4 byte，
         * 三体称为：降维打击*/
        int intVar = 99;
        long longVar = intVar;
        long longVar2 = intVar + 1;
        System.out.println(longVar2);

        float floatVar = 11.32f;
        double doubleVar = floatVar;
        double doubleVar2 = floatVar * 2;
        System.out.println(doubleVar2);

        doubleVar = longVar;
        doubleVar = intVar;

        floatVar = intVar;
        floatVar = longVar;

        char ch = 'A';
        int chNum = ch;
        int chNumCalc = ch + 10;
        System.out.println(ch);
        System.out.println(chNum);
        System.out.println(chNumCalc);

        int a = 99;
        double b = 5;
        System.out.println(a / b);


        char ch1 = 'a' + 1;
        System.out.println(ch1);
        System.out.println('a' + 1);



    }
}
