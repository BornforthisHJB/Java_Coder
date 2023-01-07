/**
 * @ClassName: CodeBlock
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/12/15 09:20
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class CodeBlock {
    public static void main(String[] args) {
        int outer = 100;
        {
            int inner = 10;  // 变量的生存周期
            System.out.println("outer变量的值是" + outer + "。inner变量的值是" + inner + "。");
        }
        int a1 = 1;
        {
            int a2 = a1 + 1;
            int inner = 100;
        }
//        System.out.println(a2);
    }
}