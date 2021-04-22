package 简单.数组;

import sun.reflect.generics.tree.Tree;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author: Albers
 * @date: 2021/4/21
 * @description:
 */
public class 只出现一次的数字 {
    public static void main(String[] args) {
        System.out.println(singleNumber2(new int[]{4, 1, 2, 1, 2}));
    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (Integer integer : map.keySet()) {
            if (map.get(integer).equals(1)) {
                return integer;
            }
        }
        return 0;
    }
    /** 
    * @Description:
     * a^a=0；自己和自己异或等于0
     * a^0=a；任何数字和0异或还等于他自己
    * @Param: [nums] 
    * @return: int 
    * @Author: albers
    * @Date: 2021/4/21 
    */ 
    public static int singleNumber2(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }



}
