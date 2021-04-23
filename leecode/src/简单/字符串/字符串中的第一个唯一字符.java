package 简单.字符串;

/**
 * @author: Albers
 * @date: 2021/4/22
 * @description:
 */
public class 字符串中的第一个唯一字符 {
    public static void main(String[] args) {
        System.out.println(firstUniqChar2("leetcode"));
        System.out.println(firstUniqChar2("aabb"));
        System.out.println(firstUniqChar2("loveleetcode"));
    }

    public static int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        int j = 0;
        int count = 0;
        for (int i = 0; i < chars.length; i++) {

            while (j<chars.length){
                if (chars[i]==chars[j]&&i!=j) {
                    count++;
                    break;
                }
                j++;
            }
            j=0;
            if (count ==0){
                return i;
            }
            count = 0;
        }
        return -1;
    }
    public static int firstUniqChar2(String s) {
        char[] chars = s.toCharArray();
        int[] ints = new int[26];
        for (int i = 0; i < chars.length; i++) {
            ints[chars[i]-'a']++;
        }
        for (int i = 0; i < chars.length; i++) {
            if ((ints[chars[i] - 'a'] == 1)){
                return i;
            }
        }
        return -1;
    }
}
