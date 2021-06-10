package 简单.动态规划;

/**
 * @author: Albers
 * @date: 2021/5/26
 * @description:
 */
public class 打家劫舍 {

    public static int rob(int[] nums) {
        int length = nums.length;
        if (nums == null || length == 0) {
            return 0;
        }

        int[][] dp = new int[length][2];
        dp[0][0] = 0;
        dp[0][1] = nums[0];
        for (int i = 1; i < length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
            dp[i][1] = dp[i - 1][0] + nums[i];
        }
        return Math.max(dp[length - 1][0], dp[length - 1][1]);
    }
    public static void main(String[] args) {
        System.out.println(rob2(new int[]{2, 1, 1, 2}));
    }
    public static int rob2(int[] nums) {
        //边界条件判断
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int no = 0;
        int yes = nums[0];
        //从第二家开始
        for (int i =1; i < nums.length; i++) {
            int a = Math.max(no,yes);
            yes = no +nums[i];
            no = a;
        }
       return Math.max(no,yes);
    }

}
