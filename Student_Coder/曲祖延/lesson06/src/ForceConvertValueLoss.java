public class ForceConvertValueLoss {
    public static void main(String[] args) {
        int intVal = 99;
        long longVal = 5555555555555L;
        intVal = (int) longVal;
        System.out.println(intVal);
        /*
        * long 101 0000 1101 1000 0000 1110 1010 0101 1000 1110 0011
        * 1 字节（byte） = 8 位（bit）
        * 比如：long 是 8 byte ，int 4 byte
        * 你说好巧不巧，后面 4 个 byte 的开头不恰巧就是 1，也就成了负数。
        * */
        char ch = 'a';
        char upper_char = (char) (ch - 32);
        System.out.println(upper_char);

        char P = (char) (81 - 1);
        System.out.println(P);




    }
}
