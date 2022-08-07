public class CalcDivFor {
    public static void main(String[] args) {
        int divided = 100;
        int divisor = 3;

        int found = 0;
        for (int i = 0; i < 100 && found < 10; i++) {
            if (divided % divisor == 0) {
                System.out.println(divided + "可以整除" + divisor + "。商为" + divided / divisor);
                found++;  // 前 ++ 和 后 ++ 影响都不大，前 ++ 与 后 ++，其实是在运行的那行才会体现区别
//                ++found;
            }
            divided++;
        }


    }
}