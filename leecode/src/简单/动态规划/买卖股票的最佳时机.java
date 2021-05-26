package 简单.动态规划;

/**
 * @author: Albers
 * @date: 2021/5/20
 * @description:
 */
public class 买卖股票的最佳时机 {

    public static void main(String[] args) {
        int[] ints = {7, 1, 5, 3, 6, 4};
        maxProfit2(ints);
    }
    public static int maxProfit(int[] prices) {
        if (prices.length==0) {
            return 0;
        }
        int max= 0;
        int min =prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (min < prices[i]) {
                max = (prices[i] - min) > max ? prices[i] - min : max;
            } else {
                min = prices[i];
            }
        }
        return max;
    }
    public static int maxProfit2(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int length = prices.length;
        int[][] dp = new int[length][2];
        //边界条件
        dp[0][0]= 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < length; i++) {
            //递推公式
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], -prices[i]);
        }
        //毋庸置疑，最后肯定是手里没持有股票利润才会最大，也就是卖出去了
        return dp[length - 1][0];
    }

}
