public class CalcDivFor {
    public static void main(String[] args) {
        int divided = 100;
        int divisor = 3;
//        增加新功能，输出最多10个可以整除的数
        int found = 0;
        for (int i = 0; i < 100 && found < 10; i++, found++) {
            if (divided % divisor == 0) {
                System.out.println(divided + "可以整除" + divisor + "。商为" + divided / divisor);
//                found++;
            }
            divided++;
        }
    }
}
