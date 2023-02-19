/**
 * @ClassName: RandomNumber
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2023/1/12 15:42
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class RandomNumber {

    public static void main(String[] args) {
        double randNum = 0;

        // 要生成一个大于 0.5 的随机数，只有随机数大于了 0.5，循环才会退出
        while (randNum < 0.0) {
            // 使用 Java 中的 Math.random()，生成一个随机数
            randNum = Math.random();
            System.out.println(randNum);
        }
        System.out.println("生成大于 0.5 的随机数是" + randNum);
    }
}

