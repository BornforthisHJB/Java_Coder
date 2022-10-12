/**
 * @ClassName: Hex
 * @Description: TODO
 * @Author: AI悦创
 * @date: 2022/10/5 10:25
 * @Version: V1.0
 */

import java.util.Scanner;

public class Hex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 0) {
            System.out.println(0);
            System.exit(0);
        }
        StringBuffer stb = new StringBuffer(8);
        char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (n != 0) {
            stb = stb.append(a[n % 16]);
            n /= 16;
        }
        System.out.println(stb.reverse().toString());
    }
}
