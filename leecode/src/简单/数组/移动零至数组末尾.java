package 简单.数组;

/**
 * @author: Albers
 * @date: 2021/4/22
 * @description:
 */
public class 移动零至数组末尾 {
    public static void main(String[] args) {
        moveZeroes(new int[]{1,0,1,0,0,2,12});
    }
/**
* @Description: 数组越界
* @Param: [nums]
* @return: void
* @Author: albers
* @Date: 2021/4/22
*/
    public static void moveZeroes(int[] nums) {
        int pointer = 0;
        for (int i = 1; i < nums.length; i++) {
            if (pointer>nums.length){
                break;
            }
            if (nums[pointer] != 0 || nums[i] != 0) {
                if (nums[pointer] == 0) {
                    nums[pointer] = nums[i];
                    nums[i] = 0;
                }
                pointer++;
            } else {
                if (nums[i] == 0) {
                    for (int i1 = i; i1 < nums.length; i1++) {
                        if (nums[i1] != 0) {
                            nums[pointer] = nums[i1];
                            nums[i1] = 0;
                            pointer++;
                            continue;
                        }
                    }

                }
            }
        }
    }

/** 
* @Description: 先遍历一边把不为0的先提前，然后将后面全设为0 
* @Param: [nums] 
* @return: void 
* @Author: albers
* @Date: 2021/4/22 
*/ 
    public static void moveZeroes2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0){
                nums[index++] = nums[i];
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }

}
