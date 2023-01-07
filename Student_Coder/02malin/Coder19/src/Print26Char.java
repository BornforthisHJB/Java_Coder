/**
 * @ClassName: Print26Char
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2023/1/5 07:52
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class Print26Char {
    public static void main(String[] args) {
        char ch = 'A';
//        System.out.println((int) ch);
        for (int i = 0; i < 26; i++) {
            System.out.println((int) ch + "\t" + (char) ch++);
        }
    }
}
