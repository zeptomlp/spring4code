package 中等;

import com.sun.org.glassfish.gmbal.Description;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: Albers
 * @date: 2021/4/21
 * @description:给定一个字符串，请你找出其中不含有重复字符的最长子串的长度。
 */
//aaaasfewfwe
public class 无重复字符的最长子串 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }

    /**
     * @Description: 无滑窗方法
     * @Param: [s]
     * @return: int
     * @Author: albers
     * @Date: 2021/4/21
     */
    public static int lengthOfLongestSubstring(String s) {
        if (s.equals("")) { return 0; }
        int pointer = 0;
        int pointer2 = 0;
        char[] chars = s.toCharArray();
        HashSet<String> set = new HashSet<>();
        for (char aChar : chars) {
            for (int i = pointer2; i < chars.length; i++) {
                if (set.contains(String.valueOf(chars[i]))) {
                    if (set.size() > pointer) {
                        pointer = set.size();
                    }
                    set.clear();
                    pointer2++;
                    break;
                } else {
                    set.add(String.valueOf(chars[i]));
                }
            }
            if (set.size() > pointer) {
                pointer = set.size();
            }
        }
        return pointer;
    }

   public int lengthOfLongestSubstring3(String s) {
       if (s.equals("")) { return 0; }
       int pointer = 0;
       int pointer2 = 0;
       HashSet<String> set = new HashSet<>();
        int n = s.length();
       for (int m = 0; m < n; m++) {
           for (int i = pointer2; i < n; i++) {
               if (set.contains(String.valueOf(s.charAt(i)))) {
                   if (set.size() > pointer) {
                       pointer = set.size();
                   }
                   set.clear();
                   pointer2++;
                   break;
               } else {
                   set.add(String.valueOf(s.charAt(i)));
               }
           }
           if (set.size() > pointer) {
               pointer = set.size();
           }
       }
        return pointer;
    }
    /** 
    * @Description: 大佬算法 看不懂
    * @Param: [s] 
    * @return: int 
    * @Author: albers
    * @Date: 2021/4/21 
    */ 
   public int lengthOfLongestSubstring2(String s) {
       int[] last = new int[128];
       int res = 0;
       int start = 0;
       for(int i = 0; i < s.length(); i++) {
           int index = s.charAt(i);
           start = Math.max(start, last[index]);
           res   = Math.max(res, i - start + 1);
           last[index] = i+1;
       }
       return res;
    }

}
