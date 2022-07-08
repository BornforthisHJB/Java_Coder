public class demo {
    public static void main(String[] args) {
        byte byteVar = 99;
//        byte byteVar = 127;
//        1 byte = 8 bit
//        2 ** 8 = 256 -> 128
        System.out.println(byteVar);

        short shortVar = -32768;
//        1 byte = 8 bit
//        shor 2 byte
//                int 4 byte
        // 16, 15
        System.out.println(shortVar);

        int intVar = 2147483647;

        System.out.println(intVar);

        long longVar = 9223372036854775807L;

        System.out.println(longVar);

        int a = 1;
        float b = 3.0f;
//        float floatVar = a / b;
        float floatVar = 1 / 3.0f;
        double doubleVar = 1 / 3.0;
        System.out.println(floatVar);
        System.out.println(doubleVar);
        boolean condition = true;
        boolean fcondition = false;
        System.out.println(condition);
        System.out.println(fcondition);
//
    }
}
