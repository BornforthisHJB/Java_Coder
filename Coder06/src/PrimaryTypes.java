public class PrimaryTypes {
    public static void main(String[] args) {
        byte byteVar = 99;
//        byte byteVar = 128;  // 超出 byte 范围
        System.out.println(byteVar);

        short shorVar = -30000;
        System.out.println(shorVar);

        int intVar = 300000;
        System.out.println(intVar);

        long longVar = 99;

//        long bingLongVar = 9999999999;  // 缺省是 int，需要在末尾添加 L
        long bingLongVar = 9999999999L;  // 缺省是 int，需要在末尾添加 L
//        long bingLongVar = 9999999999l;  // 不推荐小 l，比如：11111111l,你能发现哪个是 1 哪个是 l 么？
        System.out.println(bingLongVar);

        float floatVar = 100.1f; // 缺省是 double 需要在后面添加 f/F
//        float floatVar = 100.1; // 缺省是 double 需要在后面添加 f/F
        System.out.println(floatVar);
        /*
        * 解析：缺省是 double，也就是说浮点数会被自动识别为 double；
        * 但是你前面的变量被声明为 float 这样就和系统相冲突啦，就需要标明数字类型*/

        double doubleVar = 100.1;
        System.out.println(doubleVar);

        boolean condition = true;
        boolean fcondition = false;
        System.out.println(condition);

        char ch = 'A';
        System.out.println(ch);

        float floatVar1 = 100.1111111111f;
        System.out.println("floatVar1:>>>" + floatVar1);
        double dobleVar1 = 100.1111111111;
        System.out.println("dobleVar1:>>>" + dobleVar1);
    }
}
