/**
 * @ClassName: demo
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2023/1/5 07:21
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
// 快速查询手册
// 越有钱，越哭穷
// 获取用户输入
import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  // 输入实例化
        String username = in.next(); // next 获取字符串
        System.out.println("用户名为:" + username);  // 输出用户名字

        int num = in.nextInt();
        System.out.println("我是整数:" + num);
    }
}
