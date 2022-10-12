public class PrimaryTypes {
    public static void main(String[] args) {
        byte byteVar = 99;
//        byteVar = 127;
        System.out.println(byteVar);
//        int 的范围：

        short shorVar = -30000;
        System.out.println(shorVar);

        int intVar = 30000;
        System.out.println(intVar);

        long longVar = 999;
        System.out.println(longVar);

        long longlongVar = 9999999999L;  // 缺省 default
        System.out.println(longlongVar);

        float floatVar = 100.1f;
        System.out.println(floatVar);

        double doubleVar = 100.1;
        System.out.println(doubleVar);

        boolean condition = true;
        boolean fcondition = false;
        System.out.println(condition);

        char ch = 'A';
        System.out.println(ch);

        float floatVar1 = 100.111111111111111f;
        System.out.println("floatVar1:>>>" + floatVar1);
        double doubleVar1 = 100.111111111111111;
        System.out.println("doubleVar1:>>>" + doubleVar1);

        String s = "aiyuechuang";
        System.out.println(s);
    }
}
