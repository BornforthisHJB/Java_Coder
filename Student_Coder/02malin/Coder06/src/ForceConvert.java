/**
 * @ClassName: ForceConvert
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/11/27 10:34
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class ForceConvert {
    public static void main(String[] args) {
        int intVal = 99;
        long longVal = 19999;
        intVal = (int) longVal;
        System.out.println(intVal);

        float floatVar = 11.32f;
        double doubleVar = 3344556.789;
        floatVar = (float) doubleVar;
    }
}
