public class demo {
    public static void main(String[] args) {
        char ch = 'a';
        int intCh = ch;
        System.out.println(ch);
        System.out.println(intCh);

//        int a = 97;
//        char ch1 = a; // java: 不兼容的类型: 从int转换到char可能会有损失
        char ch1 = 'a' + 1;
        System.out.println(ch1);
        System.out.println('a' + 1);

    }
}
