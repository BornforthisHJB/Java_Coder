/**
 * @ClassName: AutoConvert
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/11/24 00:58
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class AutoConvert {
    public static void main(String[] args) {
        int a = 99;
        double b = 5.0;
        float c = 1.0f;

        System.out.println(a / 5.0);
//        double > int
//        double > float > long > int > short > byte
        int v = 100;
        long n = v;
        System.out.println(n);

        long o = 10;
        int l = (int) o;
        System.out.println(l);
    }
}
