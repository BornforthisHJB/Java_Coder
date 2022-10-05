public class Example2 {
    public static void main(String[] args) {
        // 第一行
        for (int i = 0; i < 36; i++) {
            System.out.print("*");
        }
        System.out.println("");  // 换行

        // 第二、三行 显而易见使用循环嵌套
        for (int j = 0; j < 2; j++) {
            for (int index = 0; index < 6; index++) {
                for (int i = 0; i < 3; i++) {
                    System.out.print("*");
                }
                for (int i = 0; i < 3; i++) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        // 第四、五行
        for (int j = 0; j < 2; j++) {
            for (int index = 0; index < 6; index++) {
                for (int i = 0; i < 3; i++) {
                    System.out.print(" ");
                }
                for (int i = 0; i < 3; i++) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        // 第六行
        for (int i = 0; i < 36; i++) {
            System.out.print("*");
        }
        System.out.println("");  // 换行

        // 菱形编写
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.print("1");
            }
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("2");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
