public class Example {
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
    }
}


