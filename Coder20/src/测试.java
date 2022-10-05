public class 测试 {
    public static void main(String[] args) {
//        int size = 9;
//        for (int i = 0; i < size / 2 + 1; i++) {
//            for (int j = size / 2 + 1; j > i + 1; j--) {
//                System.out.print(" "); // 输出左上角位置的空白
//            }
//            for (int j = 0; j < 2 * i + 1; j++) {
//
//                System.out.print("*"); // 输出菱形上半部边缘
//
//            }
//            System.out.println(); // 换行
//        }
//        for (int i = size / 2 + 1; i < size; i++) {
//            for (int j = 0; j < i - size / 2; j++) {
//                System.out.print(" "); // 输出菱形左下角空白
//            }
//            for (int j = 0; j < 2 * size - 1 - 2 * i; j++) {
//
//                System.out.print("*"); // 输出菱形下半部边缘
//
//            }
//            System.out.println(); // 换行
//        }
//        for (int i = 0; i < 4; i++) {
//            for (int a = 0; a < 4; a++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
        int size = 4;
        boolean isfirstorend = false;
        int i;
        int j;
        //图形上部分
        for (i = 0; i < size / 2 + 1; i++) {
            isfirstorend = false;
            for (j = 0; j < size / 2 - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (j = 0; j < 2 * i - 1; j++) {
                System.out.print(" ");
                isfirstorend = true;
            }
            if (isfirstorend) {// 判断是否是第一行
                System.out.print("*");
            }
            System.out.println();
        }
        //图形下部分
        for (i = 0; i < size / 2; i++) {
            isfirstorend = false;
            for (j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (j = 0; j < 2 * (size / 2 - i - 1) - 1; j++) {
                System.out.print(" ");
                isfirstorend = true;
            }
            if (isfirstorend) {// 判断是否是最后一行
                System.out.print("*");
            }
            System.out.println();
        }
    }
}




