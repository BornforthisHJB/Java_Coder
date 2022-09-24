public class ForceConvert2 {
    public static void main(String[] args) {
        int intVal = 2147483647;
        long longVal = 19999999999L;
        intVal = (int) longVal; // 我知道，但是你继续做你，我同意了，我批准了

        float floatVal = 11.32f;
        double doubleVal = 9.223372037E18;
        floatVal = (float) doubleVal;
        System.out.println(floatVal);
        /*
        * 1 int = 4 byte
        * 1 byte = 8 bit
        * 32, 其中一位是符号位 char 类型无符号位
        * 2 ** 31 - 1
        * 2,147,483,648
        * 1 double = 8 byte
        * 1 byte = 8bit
        * 64 63*/
        int a = 65;
        char b = (char) a;
        System.out.println(b);
    }
}
