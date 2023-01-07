/**
 * @ClassName: demo
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2022/12/17 08:29
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
// 菱形，下节课讲

import java.util.Scanner;

/*
 * 不停的实现用户加法
 * 除非用户输入 break */
public class demo {
    public static void main(String[] args) {
        int i = 0;
        int even_total = 0;
        int odd_total = 0;
        while (i < 100) {
            if (i % 2 == 0) {
                even_total = even_total + i;
                i++;
            } else {
                odd_total = odd_total + i;
                i++;
            }
        }
        System.out.println("even_total:" + even_total);
        System.out.println("odd_total:" + odd_total);
    }
}

