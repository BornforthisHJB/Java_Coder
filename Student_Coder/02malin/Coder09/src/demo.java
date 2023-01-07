/**
 * @ClassName: demo
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/12/15 08:27
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class demo {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) { // 2
            for (int j = 1; j < i + 1; j++) { // 1 2
//                System.out.print(i + "*" + j + "=" + (i * j) + "\t");
                System.out.print(j + "*" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
