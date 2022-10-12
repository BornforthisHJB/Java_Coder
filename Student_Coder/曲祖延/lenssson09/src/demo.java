public class demo {
    public static void main(String[] args) {
//        demo lx = new demo();
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
//        36 / 3 = 12
//        lx.min_rhombus_up();
        demo.min_rhombus_up();
        demo.min_rhombus_middle();
        demo.min_rhombus_down();


    }

    public static void min_rhombus_up() {
        // 小菱形 上
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.print("   ");
        }
        System.out.println("");
    }

    public static void min_rhombus_middle() {
        // 小菱形 中
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.print(" ");
        }
        System.out.println("");
    }

    public static void min_rhombus_down() {
        // 小菱形 下
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.print("   ");
        }
    }
}

