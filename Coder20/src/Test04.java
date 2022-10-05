public class Test04 {

    public static void main(String[] args) {

        //正三角

        for (int i = 0; i < 10; i++) {

            for (int i1 = 0; i1 < 10 - 1 - i; i1++) {

                System.out.print(" ");

            }

            for (int i1 = 0; i1 < 2 * i + 1; i1++) {

                System.out.print("*");

            }

            //打印完一遍换行

            System.out.println();

        }

        //倒三角

        for (int i = 0; i < 10; i++) {

            for (int i1 = 0; i1 < i; i1++) {

                System.out.print(" ");

            }

            for (int i1 = 0; i1 < 19 - 2 * i; i1++) {

                System.out.print("*");

            }

            System.out.println();

        }

    }

}