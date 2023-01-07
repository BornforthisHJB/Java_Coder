/**
 * @ClassName: forloop
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/12/12 09:48
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class forloop {
    public static void main(String[] args) {
        char ch = 'A';
        for (int i = 0; i < 26; i++) {
//            System.out.println(ch++);
            System.out.println((char) (ch + i));
        }

    }
}
