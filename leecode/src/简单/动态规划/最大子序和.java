package 简单.动态规划;

/**
 * @author: Albers
 * @date: 2021/5/20
 * @description:
 */
public class 最大子序和 {
    public static void main(String[] args) {
        maxSubArray2(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
    }
/** 
* @Description: 暴力破解 
* @Param: [nums] 
* @return: int 
* @Author: albers
* @Date: 2021/5/21 
*/ 
    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int max = Integer.MIN_VALUE;
        int sum;
        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    public static int maxSubArray2(int[] nums) {
        int current = nums[0];
        int sum = nums[0];
        //我们考虑如果全是负数，那么返回最大的负数，如果最后的和为正，那么就使用扫描法
        for (int i = 1; i < nums.length; i++) {
            if (current < 0) {
                current = nums[i];//当前数小于0 肯定会舍去（否则将会影响接下来的和），换为下一个数
            } else {
                current += nums[i];//如果当前数不小于0，那么他会对接下来的和有积极影响
            }
            if (current > sum) {
                sum = current;//这里既实现了负数返回最大也实现了扫描法
            }
            //这里其实已经隐式的列举了所有可能，保留了所有可能的最大值
        }
        return sum;
    }
}
