package 简单;

/**
 * @author: Albers
 * @date: 2021/4/21
 * @description:
 */
public class 买卖股票的最佳时机 {
    public static void main(String[] args) {
        maxProfit(new int[]{7,1,5,3,6,4});
    }
    /**
     * @Description: 使用指针
     * @Param: [nums]
     * @return: int
     * @Author: albers
     * @Date: 2021/4/21
     */
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int left = 0;
        int count = 0;
        for (int right = 1; right < prices.length; right++,left++) {
            if (prices[left] < prices[right]){
                count+=prices[right]-prices[left];
            }
        }
        return count;
    }
}
