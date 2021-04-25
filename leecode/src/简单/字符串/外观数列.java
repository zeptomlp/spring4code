package 简单.字符串;

/**
 * @author: Albers
 * @date: 2021/4/25
 * @description: 1
 * 11
 * 21
 * 1211
 * 111221
 */
public class 外观数列 {
    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
    /**
     * @Description: 递归未实现
     * @Param: [n]
     * @return: java.lang.String
     * @Author: albers
     * @Date: 2021/4/25
     */
//    public static String countAndSay(int n) {
//        if (n == 1) {
//            return "1";
//        }
//        String s = countAndSay(n, "1");
//        return s;
//    }
//
//    public static String countAndSay(int n, String str) {
//        //结果集
//        StringBuffer buffer = new StringBuffer();
//        int count = 1;
//        for (int i = 0; i < str.length(); i++) {
//            //123123
//            if (i + 1 < str.length()) {
//                if (str.charAt(i) ==str.charAt(i+1)) {
//                    i++;
//                    count++;
//                }  else {
//                    count =1;
//                }
//            }
//             buffer.append(count).append(str.charAt(i));
//
//        }
//        str = buffer.toString();
//        if (n-1 != 0) {
//            return countAndSay(--n, str);
//        }
//    }

    public static String countAndSay(int n) {
        //初始
        StringBuffer res = new StringBuffer("1");
        StringBuffer prev;
        int count;
        char say;
        for (int i = 1; i < n; i++) {
            prev = res;
            res = new StringBuffer();
            count = 1;
            say = prev.charAt(0);
            for (int j = 1, len = prev.length(); j < len; j++) {
                if (prev.charAt(j) != say) {
                    res.append(count).append(say);
                    count = 1;
                    say = prev.charAt(j);
                } else {
                    count++;
                }
            }
            res.append(count).append(say);
        }
        return res.toString();
    }




}
