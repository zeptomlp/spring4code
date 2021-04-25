package 简单.字符串;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author: Albers
 * @date: 2021/4/23
 * @description:
 */
// TODO: 2021/4/23 没做出来 
public class 字符串转换整数 {
    public static void main(String[] args) {
        System.out.println(myAtoi2("42"));
        System.out.println(myAtoi2("   -42"));
        System.out.println(myAtoi2("4193 with words"));
        System.out.println(myAtoi2("words and 987"));
        System.out.println(myAtoi2("-91283472332"));
        System.out.println(myAtoi2("+-42"));
        System.out.println(myAtoi2("+42"));
        System.out.println(myAtoi2("0.42"));
        System.out.println(myAtoi2(" 0000000000012345678"));
        System.out.println(myAtoi2("00000-42a1234"));
        System.out.println(myAtoi2("  -0012a42"));
    }

    /**
     * @Description: 这个方法搞不定了，隔了一天不知道自己写的什么屎代码
     * @Param: [s]
     * @return: int
     * @Author: albers
     * @Date: 2021/4/25
     */
    public static int myAtoi(String s) {
        int is = 0;
        int rel = 0;
        int iszimu = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                break;
            }
            //第一位是字母
            if (Character.isLetter(s.charAt(i)) && rel == 0 && is == 0) {
                break;
            }
            if ((s.charAt(i) == '-' || s.charAt(i) == '+') && is != 0) {
                break;
            }
            if (s.charAt(i) != ' ') {
                if (is != 1 || is != 2) {
                    if (Character.isLetter(s.charAt(i)) && rel != 0) {
                        return 0;
                    }
                    if (s.charAt(i) == '-') {
                        is = 1;
                        continue;
                    }
                    if (s.charAt(i) == '+') {
                        is = 2;
                        continue;
                    }
                }

                if (Character.isDigit(s.charAt(i))) {
                    if (rel > Integer.MAX_VALUE / 10 || rel > Integer.MAX_VALUE / 10 - s.charAt(i) + '0') {
                        return is == 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

                    }
                    rel = rel * 10 + s.charAt(i) - '0';
                }
            }
        }
        if (is == 1) {
            rel = -rel;
        }
        return rel;
    }

    public static int myAtoi2(String s) {
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }
        int index = 0;
        int res = 0;
        int sign = 1;//正负数
        int length = s.length();

        if (s.charAt(index) == '-' || s.charAt(index) == '+') {
            sign = s.charAt(index++) == '+' ? 1 : -1;
        }
        for (; index < length; ++index) {

            int digit = s.charAt(index) - '0';
        //不是数字直接返回
            if (digit < 0 || digit > 9) {
                break;
            }
            //越界处理
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            } else {
                res = res * 10 + digit;
            }
        }
        return sign * res;

    }


}
