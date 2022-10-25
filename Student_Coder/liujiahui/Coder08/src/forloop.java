public class forloop {
    public static void main(String[] args) {
//        for (初始语句; 循环条件的表达式; 循环体后语句) {
//            for 循环体;
//        }
        int divided = 100;
        int divisor = 3;

        int foundCount = 0;
        int toBeFound = 5;
        for (int i = 0; i < 100; i++) {
            if (divided % divisor == 0) {
                System.out.println(divided + "可以整除" + divisor + "。商为" + divided / divisor);
                foundCount++;
            }
            divided++;

            if (foundCount >= toBeFound) {
                System.out.println("已经找到" + toBeFound + "个数,循环退出。");
                break;
            }
        }
        System.out.println("总共找到" + foundCount + "个可以整除" + divisor + "的数。");
    }
}
