package 简单.字符串;

/**
 * @author: Albers
 * @date: 2021/4/23
 * @description:
 */
public class 有效的字母异位词 {

    public static void main(String[] args) {
       // isAnagram("anagram" ,"nagaram");
        isAnagram("rct" ,"car");
    }
    public static boolean isAnagram(String s, String t) {
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        int[] integers = new int[26];
        for (int i = 0; i < sc.length; i++) {
            integers[sc[i]-'a']++;
        }
        for (int i = 0; i < tc.length; i++) {
            integers[tc[i]-'a']--;
        }
        for (int i = 0; i < integers.length; i++) {
            if (integers[i]!=0){
                return false;
            }
        }
        return true;
    }
    /** 
    * @Description: 与上方一样 
    * @Param: [s, t] 
    * @return: boolean 
    * @Author: albers
    * @Date: 2021/4/23 
    */ 
    public static boolean isAnagram2(String s, String t) {
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        int[] integers = new int[26];
        for (int i = 0; i < sc.length; i++) {
            integers[sc[i]-'a']++;
        }
        for (int i = 0; i < tc.length; i++) {
            if (--integers[tc[i]-'a']<0) {
                return false;
            }
        }
        for (int i = 0; i < integers.length; i++) {
            if (integers[i]!=0){
                return false;
            }
        }
        return true;
    }
}
