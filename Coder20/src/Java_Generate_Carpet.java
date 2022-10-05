public class Java_Generate_Carpet {
    public static void main(String[] args) {
        /*
        @@@@@@@@@@@@@@@ @@@@@@@@@@@@@@@
        @@@   @@@   @@@ @@@   @@@   @@@
        *********** *********** *********
        *** *** *** *** *** *** *** *** ***
        */
        // 地毯图标修改变量
        String icon = "$";  // 你既然喜欢钻石，我给你满是 money 的你
        // ************************************
        for (int i = 0; i < 36; i++) {
            System.out.print(icon);
        }
        System.out.println("");

        /*
         ***   ***   ***   ***   ***   ***
         ***   ***   ***   ***   ***   ***
         */
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(icon);
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
                    System.out.print(icon);
                }

            }
            System.out.println("");
        }
        // ************************************
        for (int i = 0; i < 36; i++) {
            System.out.print(icon);
        }
        System.out.println("");
        // 正方形「数据不是正方形，但图形是正方形
        for (int rows = 0; rows < 4; rows++) {
            for (int i = 0; i < 3; i++) {
                for (int a = 0; a < 10; a++) {
                    System.out.print(icon);
                }
                for (int b = 0; b < 2; b++) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        /*
         *           *           *
        ***         ***         ***
       *****       *****       *****
      *******     *******     *******
     *********   *********   *********
         */
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

        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 3; j++) {
                xsj(i);
            }
            System.out.println("");
        }
        // 厦门正方形
        for (int rows = 0; rows < 4; rows++) {
            for (int i = 0; i < 3; i++) {
                for (int a = 0; a < 10; a++) {
                    System.out.print(icon);
                }
                for (int b = 0; b < 2; b++) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        // 结尾
        for (int i = 0; i < 36; i++) {
            System.out.print(icon);
        }
        System.out.println("");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < 3; k++) {
                    System.out.print(icon);
                }

            }
            System.out.println("");
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(icon);
                }
                for (int k = 0; k < 3; k++) {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }

        for (int i = 0; i < 36; i++) {
            System.out.print(icon);
        }
        System.out.println("");
    }

    public static void xsj(int i) {
        String xsj_ico = "*";
        for (int j = 0; j < 4 - i; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < 2 * i - 1; j++) {
            System.out.print(xsj_ico);
        }
        for (int j = 0; j < 9 - i; j++) {
            System.out.print(" ");
        }
    }

    public static void dsj(int i) {
        String dsj_ico = "*";
        for (int j = 0; j < 5 - i; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < 2 * i + 1; j++) {
            System.out.print(dsj_ico);
        }
        for (int j = 0; j < 6 - i; j++) {
            System.out.print(" ");
        }
    }
}
