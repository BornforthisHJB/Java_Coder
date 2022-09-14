public class CodeBlock {
    public static void main(String[] args) {
        int outer = 100;

        {
            int inner = 10;
            System.out.println("outer变量的值是" + outer + "。inner变量的值是" + inner + "。");
            //  上面的 outer 用的就是代码快外部的变量。inner 同时也是代码块里面的变量，它也是肯定可以使用的。
        }
        // 如果我们在这行使用 inner，是显然不行的。我写在此行的下面:
        // System.out.println(inner);
        // 就是说 inner 这个变量，出了上面的代码块就消失了，不可见了。随着代码块结束，它的生命周期就结束了。
        // 所以说 inner 的可见性就是在代码的内部。
        // -----------------------------------
        int a1 = 1;
        {
            int a2 = a1 + 1;
            {
                int a3 = a2 + 1;
                System.out.println("a3 = " + a3);
            }  //  到这行代码块结束的时候，a3 的生命周期就已经结束了。也就是可以重新声明 a3 了。
            // int a3 = 100;
            {
                int a3 = a2 + 10;
                System.out.println("a3 = " + a3);
            }
            System.out.println("a2 = " + a2);
        }
    }
}
