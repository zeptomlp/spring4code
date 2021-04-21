package 简单;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author: Albers
 * @date: 2021/4/21
 * @description:
 */
public class 两个数组的交集 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (!map.containsKey(nums1[i])){
                map.put(nums1[i],0);
            }
        }for (int i = 0; i < nums2.length; i++) {
            if (!map2.containsKey(nums1[i])){
                map2.put(nums1[i],0);
            }
        }
        for (Integer integer : map2.keySet()) {
            if (map.containsKey(integer)){
                list.add(integer);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
