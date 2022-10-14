/**
 * @ClassName: Carpet_redesign
 * @Description: TODO
 * @Author: Zuyan Qu
 * @date: 2022/10/10 22:10
 * @Version: V1.0
 */
public class Carpet_redesign {
    public static void main(String[] args) {
//        demo lx = new demo();
        line();
        space_line("*", " ");
        space_line(" ", "*");
        line();
//        for (int i = 0; i < 36; i++) {
//            System.out.print("*");
//        }
//        System.out.println("");

//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 6; j++) {
//                for (int k = 0; k < 3; k++) {
//                    System.out.print("*");
//                }
//                for (int k = 0; k < 3; k++) {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println("");
//        }

//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 6; j++) {
//                for (int k = 0; k < 3; k++) {
//                    System.out.print(" ");
//                }
//                for (int k = 0; k < 3; k++) {
//                    System.out.print("*");
//                }
//
//            }
//            System.out.println("");
//        }
//        for (int i = 0; i < 36; i++) {
//            System.out.print("*");
//        }
//        System.out.println("");
        line();
        // -------------------------------
//        36 / 3 = 12
//        lx.min_rhombus_up();
        Carpet_redesign.min_rhomhus_up_and_down();
        Carpet_redesign.min_rhomhus_middle("*");
        Carpet_redesign.min_rhomhus_up_and_down();
        Carpet_redesign.min_rhomhus_middle("~");// rectangle
        Carpet_redesign.min_rhomhus_middle("|");// it makes this shape more look like a square
        Carpet_redesign.min_rhomhus_middle("~");//it makes this shape more look like a square
        Carpet_redesign.min_rhomhus_up_and_down();
        Carpet_redesign.min_rhomhus_middle("*");
        Carpet_redesign.min_rhomhus_up_and_down();


    }

    public static void min_rhomhus_up_and_down() {
        // 小菱形 上
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("");
            }
            System.out.print("-^*");//smile!
            System.out.print("^- ");//smile!
        }
        System.out.println("");
    }

    public static void min_rhomhus_middle(String character) {
        // 小菱形 中
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(character);
            }
            System.out.print(" ");
        }
        System.out.println("");
    }

    //    public static void min_rhomhus_down() {
//        // 小菱形 下
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < 2; j++) {
//                System.out.print("");
//            }
//            System.out.print("--*");
//            System.out.print("-- ");
//        }
//    }
    public static void line() {
        for (int i = 0; i < 36; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void space_line(String character_first, String character_second) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(character_first);
                }
                for (int k = 0; k < 3; k++) {
                    System.out.print(character_second);
                }

            }
            System.out.println("");
        }
    }

}


