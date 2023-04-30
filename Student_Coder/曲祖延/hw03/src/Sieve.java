/**
 * @ClassName: Sieve
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2023/3/23 22:10
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
import java.util.*;
/**
 * 输出指定数字范围内的所有素数
 * */
public class Sieve {
    /**
     * numbers：用于存储待筛选的数字
     * */
    private Queue<Integer> numbers;

    /**
     * primes: 用于存储待筛选的素数
     * */
    private final Queue<Integer> primes;

    /**
     * 构造函数
     * 初始化 numbers 和 primes
     * */
    public Sieve() {
        numbers = new LinkedList<>();
        primes = new LinkedList<>();
    }

    /**
     * 输出指定数字范围内的所有素数
     * @param n
     * */
    public void primesTo(int n) {
        // TODO: 当输入的数字小于 2 时，抛出异常
        if (n < 2) {
            throw new IllegalArgumentException("Input must be a number greater than 2.");
        }else {
            // TODO:将2到n之间的数字依次入numbers队列
            for (int i = 2; i <= n; i++) {
                numbers.offer(i);
            }
            // TODO:从numbers队列中取出第一个数字，即2，将其入primes队列
            int p = numbers.peek();
            //TODO: =====埃拉托斯特尼筛法 执行=====
            // TODO:当 p 的平方小于等于 n 时，执行循环
            while (p <= Math.sqrt(n)) {
                // 将 p 入 primes 队列
                primes.offer(p);
                // 引入一个新的队列 newNumbers，用于存储筛选后的数字
                Queue<Integer> newNumbers = new LinkedList<Integer>();
                // TODO: 从 numbers 队列中取出数字，如果该数字不能被 p 整除，则将其入 newNumbers 队列
                while (!numbers.isEmpty()) {
                    int num = numbers.poll();
                    if (num % p != 0) {
                        newNumbers.offer(num);
                    }
                }
                // 将 numbers 队列中的第一个数字，作为下一次循环的 p
                numbers = newNumbers;
                p = numbers.peek();
            }
            // =======埃拉托斯特尼筛法 结束=====
            // 将 numbers 队列中剩余的数字去除，知道队列为空
            primes.addAll(numbers);
            // 输出队列中的数字
            System.out.print("Primes up to " + n + " are: ");
            // 从 primes 队列中取出数字，直到队列为空
            while (!primes.isEmpty()) {
                System.out.print(primes.poll());
                if (!primes.isEmpty()) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter upper bound:");
        int n = scanner.nextInt();
        Sieve sieve = new Sieve();
        sieve.primesTo(n);
        scanner.close();
    }
}
