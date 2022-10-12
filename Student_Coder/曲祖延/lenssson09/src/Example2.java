/**
 * @ClassName: Example2
 * @Description: TODO
 * @Author: AI悦创
 * @Date: 2022/10/10 23:27
 * @Version: V1.0
 * @Blog: https://www.bornforthis.cn
 */
public class Example2 {
    public static void main(String[] args) {
        for (int i = 0; i < 36; i++) {
            System.out.print("*");
        }
        System.out.println("");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print("*");
                }
                for (int k = 0; k < 3; k++) {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < 3; k++) {
                    System.out.print("*");
                }

            }
            System.out.println("");
        }
        for (int i = 0; i < 36; i++) {
            System.out.print("*");
        }
        System.out.println("");
        // -------------------------------

        for (int index = 0; index < 2; index++) {
            // 2 // 36 / 3 = 12
//        for (int j = 0; j < 12; j++) {
            for (int j = 0; j < 6; j++) {
                // 1
                for (int i = 0; i < 2; i++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.print("   ");
            }
            // 4
            System.out.println("");

            // 6
//        for (int j = 0; j < 12; j++) {
            for (int j = 0; j < 6; j++) {
                // 5
                for (int i = 0; i < 5; i++) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }

            // 7 ---------------------------
            System.out.println("");

//        for (int j = 0; j < 12; j++) {
            for (int j = 0; j < 6; j++) {
                // 1
                for (int i = 0; i < 2; i++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.print("   ");
            }
            System.out.println("");
        }
    }
}



