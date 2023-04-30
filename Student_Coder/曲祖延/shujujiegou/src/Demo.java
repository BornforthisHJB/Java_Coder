/**
 * @ClassName: demo
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2023/3/2 23:24
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class Demo {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }









    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 3;
        int result = solution.climbStairs(n);
        System.out.println("走 " + n + " 个台阶的方法数为：" + result);
    }







}
