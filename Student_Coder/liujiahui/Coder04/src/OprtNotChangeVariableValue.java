/*
 * @ClassName: OprtNotChangeVariableValue
 * @Description: TODO
 * @Author: AI悦创
 * @Date: 2022/10/5 19:04
 * @Version: V1.0
 * @Blog: https://www.bornforthis.cn
 */
public class OprtNotChangeVariableValue {
    public static void main(String[] args) {
        int a = 100;
        System.out.println(a + 1);  // 101
        System.out.println(a);  // 100 显然 a 的值没有被修改

        a = a + 6;
        System.out.println(a); // 106
        /*
        * 代码运行是先右边再左边
        * */
    }
}
