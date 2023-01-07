/**
 * @ClassName: PrintChars
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2023/1/4 12:30
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class PrintChars {
    public static void main(String[] args) {
        char ch = 'A';
        int startNum = ch;
        int i = 0;
        while (i < 26){
            int newNum = startNum + i;
            System.out.println(newNum + "\t" + ((char) newNum));
//            i++;
            i = i + 1;
        }
    }
}