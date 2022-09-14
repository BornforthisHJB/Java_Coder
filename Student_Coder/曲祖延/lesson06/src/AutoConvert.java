public class AutoConvert {
    public static void main(String[] args) {

        /*1. https://bornforthis.cn/posts/29.html
        字母
        * 编写自动类型转换：
        * 1。 大写转小写
        2。 小写转大写
        3。 char 类型 to int
        */
        char ch = 'a';
        char upper_char =  (char) (ch - 32); // 强制转换语法，功能是小写转大写
//        (类型) 表达式
        System.out.println(upper_char);

        char ch2 = 'A';
        char lower_char =  (char) (ch2 + 32); // 强制转换语法，功能是大写转小写
//        (类型) 表达式
        System.out.println(lower_char);

//        char ch = 'A';
//        char ch2 = (char) (ch + 32);
//        System.out.println(ch2);
//        char ch = 'A';
//        int chNum = ch;
//        int chNumCalc = ch + 10;
//        System.out.println(ch);
//        System.out.println(chNum);
//
//        int a = 99;
////      int b = 5;
//        double b = 5;
//        System.out.println(a / b);

    }
}