public class rhombus {
    public static void main(String[] args) {
        // 菱形编写
        // 1
        for (int i = 0; i < 18 - 1; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < 1; i++) {
            System.out.println("*");
        }
        // 2
        for (int i = 0; i < 18 - 2; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < 3; i++) {
            System.out.print("*");
        }
        System.out.println("");

        // 3
        for (int i = 0; i < 18 - 3; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("*");
        }
        System.out.println("");

        // 4
        for (int i = 0; i < 18 - 4; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < 7; i++) {
            System.out.print("*");
        }
        System.out.println("");

        // 5
        for (int i = 0; i < 18 - 5; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < 9; i++) {
            System.out.print("*");
        }
        System.out.println("");

    }
}
