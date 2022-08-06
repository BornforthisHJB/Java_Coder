public class PrintChars {
    public static void main(String[] args) {
//        char ch = '我';
        char ch = 'A';
        int startNum = ch;
        for (int i = 0; i < 26; ++i) {
            System.out.println("i:" + i);
            int newNum = startNum + i;
            System.out.println(newNum + "\t" + ((char) newNum));
        }
    }
}