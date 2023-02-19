/**
 * @ClassName: ArrayToString
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2023/1/15 16:10
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */

import java.util.Arrays;

public class ArrayToString {
    public static void main(String[] args) {
        int[] ns = new int[10];

        for (int i = 0; i < ns.length; i++) {
            ns[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(ns));

        int[] ns2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

    }
}
