public class CeShi {
    public static void main(String[] args) {
        CeShi ceshi = new CeShi();
//        for (int i = 0; i < 3; i++) {
//            ceshi.Print(2);
//        }
        String c = ceshi.Print(2);
        System.out.print(c);
//        System.out.print(c);
    }

    public String Print(int size) {
        int i;
        int j;
        String content = "";
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 1 - i; j++) {
//                System.out.print(" ");
                content += " ";
            }
            for (j = 0; j < 2 * (2 + 1) - 1; j++) {
//                System.out.print("*");
                content += "*";
            }
//            System.out.println();
            content += "\n";
        }
//        for (i = 0; i < size / 2; i++) {
//            for (j = 0; j < i + 1; j++) {
////                System.out.print(" ");
//                content += " ";
//            }
//            for (j = 0; j < 2 * (size / 2 - i) - 1; j++) {
////                System.out.print("*");
//                content += "*";
//            }
////            System.out.println();
////            content += "\n";
//        }
//        System.out.println("KAIKAI");
//        System.out.print(content);
        return content;
    }
}
