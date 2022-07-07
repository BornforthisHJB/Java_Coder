public class BooleanOprt {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
//        我们也可以用比较出的结果来运算
//        boolean a = 1 < 2;
//        boolean b = 1 > 2;

        System.out.println(a && b);  // false
        System.out.println(a & b);  // false
        System.out.println(a || b);  // true
        System.out.println(a | b);  // true

        System.out.println(a || (10 / 0 > 1));
        /*对于或来说，后面这个值是 true 还是 false 是个不重要的，因为根据 or 运算规则，
        * 只要你有一个是 true 它的结果就会是 true。所以 java 对 oror 运算做出了一个优化，
        * 前面这个值已经能决定这个 or 逻辑运算的结果了，无论后面是啥，它都会是 true，那java 就
        * 不会对后面的表达式进行运算了。*/
        System.out.println(a | (10 / 0 > 1));
        /*单个的 or 就是告诉 java 你不要对我进行这层优化，你还要去算这个表达式后面是什么。
        * 虽然，它对结果没有影响，
        * 但是你还要去算它。虽然最终结果是看不出来，所以这个部分代码我故意引出一个错误，
        * 这样我们就知道这个表达式有没有执行，所以会出现如下报错：*/
        /*Exception in thread "main" java.lang.ArithmeticException: / by zero
	at BooleanOprt.main(BooleanOprt.java:15)*/

    }
}
