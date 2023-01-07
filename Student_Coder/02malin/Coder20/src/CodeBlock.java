/**
 * @ClassName: CodeBlock
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2023/1/6 08:09
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class CodeBlock {
    public static void main(String[] args) {
        int outer = 100;

        {
            int inner = 10;  // this Variable 生存周期只存在这个代码块中
            System.out.println("outer 变量的值是" + outer + "。inner 变量的值是" + inner + "。");
//            int outer = 100;
        }
        int inner = 100;
        int a1 = 1;
        {
            int a2 = a1 + 1;
            {
                int a3 = 10000;
            }
//            a3 = 100;
        }
    }
}
