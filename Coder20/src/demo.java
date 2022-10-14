public class demo {
    public static void main(String[] args) {
        line();
        space_line("*", " ");
        space_line(" ", "*");
        line();
        // -------------------------------
//        36 / 3 = 12
        demo.min_rhombus_up_and_down();
        demo.min_rhombus_middle("*");
        demo.min_rhombus_up_and_down();
        demo.min_rhombus_middle("~");
        demo.min_rhombus_middle("|");// 正方形
        demo.min_rhombus_middle("~");
        demo.min_rhombus_up_and_down();
        demo.min_rhombus_middle("*");
        demo.min_rhombus_up_and_down();

        line();
        space_line(" ", "*");
        space_line("*", " ");
        line();

    }

    public static void min_rhombus_up_and_down() {
        // 小菱形 上
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("");
            }
//            System.out.print("-^*");
            System.out.print("-");
            System.out.print("^");
            System.out.print("*");
//            System.out.print("^- ");
            System.out.print("^");
            System.out.print("-");
            System.out.print(" ");
        }
        System.out.println("");
    }

    public static void min_rhombus_middle(String fuhao) {
        // 小菱形 中
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(fuhao);
            }
            System.out.print(" ");
        }
        System.out.println("");
    }

    public static void line() {
        for (int i = 0; i < 36; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void space_line(String fuhao_first, String fuhao_second) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(fuhao_first);
                }
                for (int k = 0; k < 3; k++) {
                    System.out.print(fuhao_second);
                }

            }
            System.out.println("");
        }
    }
}

