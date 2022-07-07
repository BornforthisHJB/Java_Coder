public class demo {
    public static void main(String[] args) {
//        boolean a = true;
//        System.out.println((10/0 > 1) & true);  // 如果第一个判断就是错误的，后面是否错误还是正确已然没有继续判断的意义了。
//        System.out.println((10/0 > 1) && a);
//        System.out.println(false && 10/0 > 1);  // false, 没有报错，显然 Java 没有后面的代码进行运行
        System.out.println(false & 10/0 > 1); // 报错了，Java 对后面的代码也进行了运行
        /*报错内容：
        * Exception in thread "main" java.lang.ArithmeticException: / by zero
	at demo.main(demo.java:7)*/
    }
}
