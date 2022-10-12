import java.util.Scanner;

/**
 * @author AI悦创
 * @version 1.0
 */
// 无判断实现指定菱形
public class part3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int layer;
        do {
            System.out.print("请输入菱形层数(奇数):");
            layer = scanner.nextInt();
        } while (layer%2 == 0);
        System.out.print("请输入每行菱形个数:");
        int number = scanner.nextInt();
        for (int i = 1; i < layer/2 + 2; i++) {
            for (int j = 0; j < number; j++) {
                for (int k = 0; k < 1; k++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < layer/2 +1-i; k++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < 2*i-1; k++) {
                    System.out.print("*");
                }
                for (int k = 0; k < layer-i; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for (int i = layer/2 + 1; i > 1 ; i--) {
            for (int j = 0; j < number; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < layer/2 +1-i; k++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < 2*i-3; k++) {
                    System.out.print("*");
                }
                for (int k = 0; k < layer-i+1; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
