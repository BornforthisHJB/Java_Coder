/**
 * @ClassName: Sort
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2023/1/15 16:28
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] ns = new int[10];

        for (int i = 0; i < ns.length; i++) {
            ns[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(ns));
        System.out.println("——————————————————————");
        for (int i = 0; i < ns.length - 1; i++) {
            for (int j = 0; j < ns.length - i - 1; j++) {
                // 为什么要 -1？
                // TODO：因为 范围为：10，会生成 0～9，而算法中，j 需要 +1，so：当 j=9 时，j + 1 = 10。
                // System.out.print("i:" + i + "\t" + "j:" + j + "\t\t");
                if (ns[j] < ns[j + 1]) {
                    // 交换 ns[j] 和 ns[j+1]
                    int tmp = ns[j];
                    ns[j] = ns[j + 1];
                    ns[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(ns));
    }
}
