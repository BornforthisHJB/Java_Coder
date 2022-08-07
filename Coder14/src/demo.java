//public class demo {
//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("i的值是：" + i);
//        }
//    }
//}

public class demo {
    public static void main(String[] args) {
        int divided = 100;
        int divisor = 3;

        int found = 0;
//        下面这样写可以吗？
//        不行，逻辑出错，found 需要在可以取整的时候自增，现在这样编写，意味着不管能不能整除都可以自增
        for (int i = 0; i < 100 && found < 10; i++, found++) {
            if (divided % divisor == 0) {
                System.out.println(divided + "可以整除" + divisor + "。商为" + divided / divisor);
            }
            divided++;
        }


    }
}
