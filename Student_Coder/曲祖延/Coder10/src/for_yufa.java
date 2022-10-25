public class for_yufa {
    public static void main(String[] args) {
//        for (初始语句; 循环条件表达式; 循环体后的语句){
//            for 循环体;
//        }
        /* 循环输出如下结果：
        i的值是：0
        i的值是：1
        i的值是：2
        i的值是：3
        i的值是：4
        i的值是：5
        i的值是：6
        i的值是：7
        i的值是：8
        i的值是：9
        */
//        for (int i = 0; i < 10; i++) {
//            System.out.println("i 的值是：" + i);
//        }
//        char ch = '我';
//        int startNum = ch;
//        for (int i = 0; i < 26; i++) {
//            int newNum = startNum + i;
//            System.out.println(newNum + "\t" + ((char) newNum));
//        }
        char ch = '我';
        int startNum = ch;
        for (int i = 0; i < 26; i++) {
//            int newNum = startNum + i;
            System.out.println(startNum + "\t" + ((char) startNum++));
        }
    }
}
