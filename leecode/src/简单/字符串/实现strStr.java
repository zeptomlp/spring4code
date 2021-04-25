package 简单.字符串;

/**
 * @author: Albers
 * @date: 2021/4/25
 * @description:
 */
public class 实现strStr {
    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
        System.out.println(strStr("aaaa", "bb"));
        System.out.println(strStr("", ""));
        System.out.println(strStr("wocwoaoni", "wo"));
        System.out.println(strStr("a", ""));
        System.out.println(strStr("mississippi", "issip"));
        System.out.println(strStr("mississippi","issi"));
    }
    public static int strStr(String haystack, String needle) {
        if ("".equals(haystack) && "".equals(needle)) {
            return 0;
        }
        if (needle.length()==0 ){
            return 0;
        }
        if (haystack.length()==0 ){
            return -1;
        }
        int needlelength = 0;
        int began = 0;
        for (int i = 0; i < haystack.length();) {
            if (haystack.charAt(i) == needle.charAt(needlelength)) {
                needlelength++;
                i++;
            }else {
                needlelength=0;
                i = ++began;
            }
            if (needlelength ==needle.length() ){
                return i-needlelength;
            }
        }
        return -1;
    }
}
