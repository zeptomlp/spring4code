package 简单;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author: Albers
 * @date: 2021/4/21
 * @description:
 */
public class 删除排序数组中的重复项 {
    public static void main(String[] args) {
        removeDuplicates(new int[]{1,1,1,1,2});
    }
    /** 
    * @Description: 使用指针 
    * @Param: [nums] 
    * @return: int 
    * @Author: albers
    * @Date: 2021/4/21 
    */ 
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int left = 0;
        for (int right = 1; right < nums.length; right++) {
            if (nums[left] != nums[right]) {
                nums[++left] = nums[right];
            }
        }
        return ++left;
    }
}
