/**
 * @ClassName: StringVariable
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/11/28 08:33
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class StringVariable {
    public static void main(String[] args) {
        int a = 10;
        String str = "a 的值是";
        str = str + a;
        System.out.println(str);

        String s2 = "a 的值是";
        System.out.println(str + a);
        System.out.println(s2);
    }
}
