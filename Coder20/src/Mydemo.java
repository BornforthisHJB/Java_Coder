public class Mydemo {
    public static void main(String[] args) {
        print(2); // 输出7行的菱形
    }

    public static void print(int size) {
//        size = 2;
        int i;
        int j;
        for (i = 0; i < size / 2 + 1; i++) {
            for (j = 0; j < size / 2 - i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < 2 * (i + 1) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 0; i < size / 2; i++) {
            for (j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < 2 * (size / 2 - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

