public class IfElaseNest {
    public static void main(String[] args) {
        int a = 10;
        int b = 99;
        int c = 990;

        System.out.println("a=" + a + ".b=" + b + ".c=" + c);
        if (a == b && b == c)
            // a, b 和 c 是等大的
            System.out.println("a, b 和 c 三个数等大。");
        else if (a > b) {
            if (a > c)
                System.out.println("a is max value" + a);
            else if (a == c)
                System.out.println("a and c ==" + a);
            else
                System.out.println("c 是最大的数。");


        } else if (b > c) {
            if (b == a)
                System.out.println("b and a is ==" + b);
            else
                System.out.println("b is max, value is:" + b);

        } else if (b == c)
            System.out.println("b and c ==" + b);
        else
            System.out.println("c is max, value is:" + c);

    }


}
