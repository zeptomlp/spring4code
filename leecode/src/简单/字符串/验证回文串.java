package 简单.字符串;

import com.sun.deploy.util.StringUtils;

import java.util.Locale;

/**
 * @author: Albers
 * @date: 2021/4/23
 * @description:
 */
public class 验证回文串 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(".,"));
    }

    public static boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (!Character.isLetterOrDigit(s.charAt(left))&&left < right) {
                left++;
            }
            while (!Character.isLetterOrDigit(s.charAt(right))&&left < right) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(right)) != Character.toLowerCase(s.charAt(left))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
