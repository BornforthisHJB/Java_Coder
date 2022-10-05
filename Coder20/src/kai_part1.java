public class kai_part1 {
    public static void main(String[] args) {
        String S_T = "*";

        for (int i = 0; i < 36; i++) {
            System.out.print(S_T);
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
            System.out.print(S_T);
        }
        System.out.println("");

        // 菱形
        for (int i = 0; i < 5; i++) {
            // 5 层  i<5
            for (int j = 0; j < 1; j++) {
                System.out.print(" ");  // 一行一行的拆封解决
            }
            for (int j = 0; j < 3; j++) {
                dsj(i);
            }
            System.out.println("");
        }
        // 正方形
        for (int rows = 0; rows < 4; rows++) {
            for (int i = 0; i < 3; i++) {
                for (int a = 0; a < 10; a++) {
                    System.out.print("*");
                }
                for (int b = 0; b < 2; b++) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        // 结尾

//        for (int rows = 4; rows > 0; rows--) {
//            for (int j = 0; j < 14; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < 4 - rows; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < 2 * rows - 1; k++) {
//                System.out.print(S_T);
//            }
//            System.out.println("");
//        }

//        for (int i = 0; i < 36; i++) {
//            System.out.print(S_T);
//        }
//        System.out.println("");
//
//
//        for (int j = 0; j < 2; j++) {
//            for (int rows = 0; rows < 6; rows++) {
//                for (int i = 0; i < 3; i++) {
//                    System.out.print(" ");
//                }
//                for (int i = 0; i < 3; i++) {
//                    System.out.print(S_T);
//                }
//            }
//            System.out.println("");
//        }
//
//        for (int j = 0; j < 2; j++) {
//            for (int rows = 0; rows < 6; rows++) {
//                for (int i = 0; i < 3; i++) {
//                    System.out.print(S_T);
//                }
//                for (int i = 0; i < 3; i++) {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println("");
//        }
//
//        for (int i = 0; i < 36; i++) {
//            System.out.print(S_T);
//        }
//        System.out.println("");

    }

    public static void dsj(int i) {
        for (int j = 0; j < 5 - i; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < 2 * i + 1; j++) {
            System.out.print("*");
        }
        for (int j = 0; j < 6 - 1; j++) {
            System.out.print(" ");
        }
    }
}
