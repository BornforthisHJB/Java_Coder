public class Chart26 {
    public static void main(String[] args) {
        char ch = 'A';
        int startNum = ch;
        System.out.println(startNum + "\t" + ((char) ch++));
        System.out.println(startNum + "\t" + ((char) ch++));
//        System.out.println(startNum + "\t" + ch++); // 背调「背景调查」
    }
}
