


public class ifelse {
    public static void main(String[] args) {
        int a = 35;
        int b = 35;
        int c = 10;

        System.out.println("a=" + a + ". b=" + b + ". c=" + c);

        if (a == b && b == c) {
            // a, b 和 c 等大
            System.out.println("a, b, c 是等大的，为：" + a);
        } else {
            if (a > b) {
                if (a > c) {
                    System.out.println("a 是最大的：" + a);
                } else {
                    if (a == c) {
                        System.out.println("a 和 c 是等大的：" + a);
                    } else {
                        System.out.println("c 是最大的：" + c);
                    }
                }
            } else {
                // a <= b
                if (b > c) {
                    if (b == a) {
                        System.out.println("a 和 b 是等大的数：" + a);
                    } else {
                        System.out.println("b 是最大的数。");
                    }
                } else {
                    // 自己写
                    if (b == c) {
                        System.out.println("b 和 c 等大");
                    } else {
                        System.out.println("c 是最大的。");
                    }
                }
            }
        }


    }
}