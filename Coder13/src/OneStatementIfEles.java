public class OneStatementIfEles {
    public static void main(String[] args) {

        int a = 10;

        System.out.println("省略大括号");
        if (a > 0)
            System.out.println("a大于0");
        else
            System.out.printf("a小于等于0");

        System.out.println("比较大小的完整的写法");
        if (a > 0) {
            System.out.println("a大于0");
        } else {
            if (a == 0) {
                System.out.println("a等于0");
            } else {
                System.out.println("a小于0");
            }
        }
        /*
        * 1、对于 Java 来说，这个是一个整体，也就是一句代码。所以可以省略最外面的花括号
        * if (a == 0) {
                System.out.println("a等于0");
            } else {
                System.out.println("a小于0");
            }
            *
            * 2、else 最后也只有一行代码，所以也可以省略花括号，效果如下未注释的代码： */

        System.out.println("比较大小的省略所有大括号的方法");
        if (a > 0)
            System.out.println("a大于0");
        else if (a == 0)
            System.out.println("a等于0");
        else
            System.out.println("a小于0");


        System.out.println("比较大小的代码块有多个语句的最优写法");
        if (a > 0) {
            System.out.println("a大于0");
            System.out.printf("买" + a + "个肉包子");
        } else if (a == 0) {
            System.out.println("a等于0");
            System.out.printf("不买肉包子了！");
        } else {
            System.out.println("a小于0");
            System.out.println("肉包子吃多了！");
        }
    }
}
