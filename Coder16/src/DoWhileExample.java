public class DoWhileExample {
    public static void main(String[] args) {
        do {
            System.out.println("会执行一次");
        } while (false);

        // 在条件为假的情况下，for 语句或 while 语句都不会执行
        for (int i = 0; i > 90; i++) {
            System.out.println("一次都不会执行");
        }
    }
}
