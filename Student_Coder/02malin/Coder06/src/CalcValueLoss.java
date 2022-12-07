/**
 * @ClassName: CalcValueLoss
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/11/27 10:51
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class CalcValueLoss {
    public static void main(String[] args) {
        int intVal = 2000000000;
        System.out.println(intVal + intVal);
        /*1 int = 4 byte
        * 1 byte = 8 bit
        * 2^31 = 4294967296
        * In [6]: 2 ** 31 > 2000000000 * 2
          Out[6]: False
        * int + int 得到的就是 int 无论你有没有溢出「int + long = long」
        * */
    }
}
