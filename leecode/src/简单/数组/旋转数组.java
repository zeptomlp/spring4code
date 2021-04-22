package 简单.数组;

import java.util.Arrays;

/**
 * @author: Albers
 * @date: 2021/4/21
 * @description:
 */
public class 旋转数组 {
    public static void main(String[] args) {
//1234567
//7123456
        rotate(new int[]{1,2,3,4,5,6,7},3);
    }

    public static void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];
        System.arraycopy(nums, 0, temp, 0, nums.length);//就是数组深拷贝
        for (int i = 0; i < nums.length; i++) {
            nums[(i + k) % nums.length] = temp[i];
        }
    }
    public static void rotate2(int[] nums, int k) {
        k = k % nums.length;
        int[] rightpart = Arrays.copyOfRange(nums, nums.length - k, nums.length);
        System.arraycopy(nums, 0, nums, k, nums.length - k);
        System.arraycopy(rightpart, 0, nums, 0, k);
    }
}
