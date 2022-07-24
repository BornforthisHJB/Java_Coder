public class ComplexChar {
    public static void main(String[] args) {
        int a = 65;
        char cha = (char) a;

//        char zang = '\u01A7'; // u 后面跟随的数字是：十六进制，不是十进制
        char zang = '\u81e7'; // u 后面跟随的数字是：十六进制，不是十进制

        System.out.println(cha);

        System.out.println(zang);
    }
}
