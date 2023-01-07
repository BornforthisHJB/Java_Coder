package test;

/**
 * @ClassName: test1
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/12/18 10:38
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class test1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            // Math.random() 0～1 之间的随机数
            System.out.println(1 + Math.random());
            System.out.println((1 + Math.random()) * 1000);
        }
    }
}
