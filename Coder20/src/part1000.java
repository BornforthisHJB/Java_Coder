public class part1000 {

    public static void main(String[] args) {
        // ************************************
        for (int i = 0; i < 36; i++) {
            System.out.print("*");
        }
        System.out.println("");

        /*
         ***   ***   ***   ***   ***   ***
         ***   ***   ***   ***   ***   ***
         */
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

        /*
         ——>***   ***   ***   ***   ***   ***
         ——>***   ***   ***   ***   ***   ***
        */
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
        // ************************************
        for (int i = 0; i < 36; i++) {
            System.out.print("*");
        }
        System.out.println("");

        /*
          *           *           *
         ***         ***         ***
        *****       *****       *****
       *******     *******     *******
      *********   *********   *********
         */
        for (int i = 0; i < 5; i++) {
            // 5 层  i<5
            for (int j = 0; j < 1; j++) {
                System.out.print("j");  // 一行一行的拆封解决
            }
            for (int j = 0; j < 3; j++) {
                dsj(i);
            }
            System.out.println("");
        }

        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 3; j++) {
                xsj(i);
            }
            System.out.println("");
        }

        // 结尾
        for (int i = 0; i < 36; i++) {
            System.out.print("*");
        }
        System.out.println("");

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

        for (int i = 0; i < 36; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void xsj(int i) {
        for (int j = 0; j < 4 - i; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < 2 * i - 1; j++) {
            System.out.print("*");
        }
        for (int j = 0; j < 9 - i; j++) {
            System.out.print(" ");
        }
    }

    public static void dsj(int i) {
        for (int j = 0; j < 5 - i; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < 2 * i + 1; j++) {
            System.out.print("*");
        }
        for (int j = 0; j < 6 - i; j++) {
            System.out.print(" ");
        }
    }
}

