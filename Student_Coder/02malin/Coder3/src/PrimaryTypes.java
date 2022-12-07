/**
 * @ClassName: PrimaryTypes
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/11/5 22:18
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class PrimaryTypes {
    public static void main(String[] args) {
        // 1 byte = 8 bit
        // byte 1byte
        byte byteVar = 99;
        byteVar = 127;
        byteVar = -128;
//        byteVar = 128;
        System.out.println(byteVar);
        // 1 short = 2 byte
        // 值域：
        short shortVar = -30000;
        shortVar = -32768;
        System.out.println(shortVar);

//        1 int = 4 byte
        int intVar = 300000;
//        intVar =
        System.out.println(intVar);
        // 1 long = 8 byte;
        long longVar = 99999999999L;
        System.out.println(longVar);
        // 1 float = 4 byte
        float floatVar = 119.1f;  //
        System.out.println(floatVar);

        double doubleVar = 10.12222292929292929299229;
        System.out.println(doubleVar);


        boolean condition = true;
        boolean fcondition = false;
        System.out.println(condition);
        System.out.println(fcondition);

        char ch = 'A';
        System.out.println(ch);


        float floatVar1 = 100.1111111111f;
        System.out.println("floatVar1:>>>" + floatVar1);
        double dobleVar1 = 100.1111111111;
        System.out.println("dobleVar1:>>>" + dobleVar1);

    }
}
