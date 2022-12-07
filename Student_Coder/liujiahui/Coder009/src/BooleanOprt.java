public class BooleanOprt {
    public static void main(String[] args) {
        // 我们也可以使用比较运算符生成的 boolean 来进行比较。
        boolean a = true; // 1 < 2
        boolean b = false; // 1 > 2

        // // && 且且 （andand）
        // & 且 （and）
        // // | 或或 （oror）
        // | 或 （or）


        System.out.println(a && b); // false
        System.out.println(a & b); // false
        System.out.println(a || b); // true
        System.out.println(a | b); // true

        System.out.println(a || (10 / 0 > 1)); // true
        // 这个 或或运算，Java 会对它进行一个优化。
        // 就是说：或或左边一旦是符合条件为真「也就是可以决定这个表达式为真」
        // 那么它就不会对后面的表达式进行运算了。
        System.out.println(a | (10 / 0 > 1)); // true
        // 单个或，就是说：不管现在条件是否成立，都要给我判断右边的情况「运算它们」。
        // 它对结果没有影响，所以上面我尝试引入一个错误，这样我们就能知道这个表达式到底有没有执行。
        // 10 / 0 > 1 本身就是一个错误的表达式
    }
}