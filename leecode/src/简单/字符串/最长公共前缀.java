package 简单.字符串;

import com.sun.javafx.scene.control.skin.VirtualFlow;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author: Albers
 * @date: 2021/4/25
 * @description:
 */
public class 最长公共前缀 {
    /*
    * 输入：strs = ["flower","flow","flight"]
    输出："fl"
    输入：strs = ["dog","racecar","car"]
    输出：""
    解释：输入不存在公共前缀。
    * */
    public static void main(String[] args) {
        //System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"flower", "flower", "flower", "flower"}));
        //System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }

    /**
     * @Description: 死解法
     * @Param: [strs]
     * @return: java.lang.String
     * @Author: albers
     * @Date: 2021/4/26
     */
    public static String longestCommonPrefix(String[] strs) {
        HashMap<Integer, Character> one = new HashMap<>();
        HashMap<Integer, Character> two = new HashMap<>();

        int count = 0;
        int num = 1;
        for (String str : strs) {
            for (int i = 0; i < str.length(); i++) {
                if (count != 0) {
                    if (one.size() >= i + 1) {
                        if (one.get(i + 1).equals(str.charAt(i))) {
                            two.put(i + 1, str.charAt(i));
                        } else {
                            break;
                        }
                    }

                } else {
                    two.put(num++, str.charAt(i));
                }
            }
            count++;
            num = 1;
            one.clear();
            one.putAll(two);
            two.clear();
        }
        if (one.size() == 0) {
            return "";
        } else {
            StringBuffer buffer = new StringBuffer("");
            for (Integer integer : one.keySet()) {
                buffer.append(one.get(integer));
            }
            return buffer.toString();
        }
    }

    /**
     * @Description: 不断截取
     * @Param: [strs]
     * @return: java.lang.String
     * @Author: albers
     * @Date: 2021/4/26
     */
    public static String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String pre = strs[0];
        int i = 1;
        while (i < strs.length) {
            //不断的截取
            while (strs[i].indexOf(pre) != 0) {
                //不断减
                pre = pre.substring(0, pre.length() - 1);
            }
            i++;
        }
        return pre;
    }

    public static String longestCommonPrefix3(String[] strs) {
        if (strs.length == 0 || strs == null) {
            return "";
        }

        String str = strs[0];
        int i = 1;
        while (i < strs.length) {
            while (strs[i].indexOf(str) != 0) {
                str = str.substring(0, str.length() - 1);
            }
            i++;
        }
        return str;
    }

}
