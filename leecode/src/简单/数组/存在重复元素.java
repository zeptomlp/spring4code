package 简单.数组;

import java.util.HashSet;

/**
 * @author: Albers
 * @date: 2021/4/21
 * @description:
 */
public class 存在重复元素 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> ints = new HashSet<>();
        for (int num : nums) {
            if (ints.contains(num)) {
                return true;
            }
            ints.add(num);
        }
        return true;
    }
}
