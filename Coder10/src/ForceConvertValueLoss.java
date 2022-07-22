public class ForceConvertValueLoss {
    public static void main(String[] args) {
        int intVal = 99;
        long longVal = 5555555555555L;
        // long: 101 0000 1101 1000 0000 1110 1010 0101 1000 1110 0011
        // int:
        /* 1 字节（byte） = 8 位（bit）
         * 比如：long 是 8 byte，int 是 4 byte
         * 你说好巧不巧，后面 4 个 byte 的开头不恰巧就是 1，也就成了负数。*/
        intVal = (int) longVal;
        System.out.println(intVal);

        float floatVal = 11.32f;
        double doubleVal = 1234567890.123456;
        floatVal = (float) doubleVal;
        System.out.println(floatVal);
        System.out.println(doubleVal);
    }
}
