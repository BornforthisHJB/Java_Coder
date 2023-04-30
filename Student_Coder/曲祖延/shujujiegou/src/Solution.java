/**
 * @ClassName: demo
 * @Description: TODO
 * @Author: AndersonHJB
 * @date: 2023/3/2 22:50
 * @Version: V1.0
 * @Blog: https://bornforthis.cn
 */
public class Solution {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        // 初始化递推数组
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        // 递推求解
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        // 返回结果
        return dp[n];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 3;
        int result = solution.climbStairs(n);
        System.out.println("走 " + n + " 个台阶的方法数为：" + result);
    }
}


/*
代码注释：

第 2-6 行，定义了一个名为 Solution 的类，包含了一个名为 climbStairs 的方法，接受一个整数 n 作为参数，返回一个整数类型的结果。
第 7 行，判断当 n=1 时，只有 1 种走法，直接返回 1。
第 8 行，判断当 n=2 时，有 2 种走法，直接返回 2。
第 11 行，初始化一个长度为 n+1 的递推数组 dp，dp[i] 表示走到第 i 个台阶的方法数。
第 12-13 行，初始化 dp[1] 和 dp[2]。
第 16-18 行，使用循环递推 dp 数组，从 i=3 开始循环到 n，根据递推公式 dp[i] = dp[i-1] + dp[i-2] 计算 dp[i] 的值。
第 21 行，返回 dp[n] 作为结果。
时间复杂度：循环求解 dp 数组的时间复杂度为 O(n)，因此总的时间复杂度为 O(n)。

空间复杂度：需要使用一个长度为 n+1 的递推数组 dp，因此空间复杂度为 O(n)。
*/

