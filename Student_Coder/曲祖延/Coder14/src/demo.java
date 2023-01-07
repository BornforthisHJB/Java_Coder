/**
 * @ClassName: demo
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2023/1/6 16:11
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
import java.util.Random;
public class demo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
//            System.out.println(Math.random() + 1);
            // 符号在 [min, max] 的随机数
//            int num = 5 + (int) (Math.random() * (10 - 5 + 1));
//            int num = 5 + (int) (Math.random() * (5 + 1));
//            int num = 5 + (int) (Math.random() * (5));
//            System.out.println(num);

            Random rand = new Random();
//            int n1 = rand.nextInt(100);
//            System.out.println("n1:>>>" + n1);
            int n2 = rand.nextInt(27) + 82;
            System.out.println("n2:>>>" + n2);
        }
    }
}
