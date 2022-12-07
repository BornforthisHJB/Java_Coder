/**
 * @ClassName: demo
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/11/24 09:11
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class demo {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            // 1....9
            // 1
            // 2
            // 3
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "x" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
