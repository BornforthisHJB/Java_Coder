/**
 * @ClassName: CalcDivBreak
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/12/12 10:51
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class CalcDivBreak {
    public static void main(String[] args) {
        int dividend = 100;
        int divisor = 3;

        int foundCount = 0;
        int toBeFound = 5;
        for (int i = 0; i < 100; i++) {
            if (dividend % divisor == 0) {
                System.out.println(dividend + "可以整除" + divisor + "。商为" + dividend / divisor);
                foundCount = foundCount + 1;
            }
            dividend = dividend + 1;
            if (foundCount >= toBeFound) {
                System.out.println("已经找到" + toBeFound + "个数，循环退出。");
                break;
            }
        }
    }
}
