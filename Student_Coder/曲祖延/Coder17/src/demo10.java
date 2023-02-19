/**
 * @ClassName: demo10
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2023/1/13 15:43
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class demo10 {
    public static void main(String[] args) {
        int[] intArray = new int[10]; // 声明，长度为 10 int 数组

        intArray[0] = 19;
        intArray[1] = 190;
        intArray[2] = 18;
        intArray[3] = 180;
        intArray[4] = 16;
        intArray[5] = 44;
        intArray[6] = 11;
        intArray[7] = 22;
        intArray[8] = 21;
        intArray[9] = 91;

        for (int i = 0; i < 10; i++) {
            intArray[i] = i + 100;
            System.out.println(intArray[i]);

        }



    }
}
