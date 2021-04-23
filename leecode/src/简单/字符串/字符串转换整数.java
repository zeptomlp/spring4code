package 简单.字符串;

/**
 * @author: Albers
 * @date: 2021/4/23
 * @description:
 */
// TODO: 2021/4/23 没做出来 
public class 字符串转换整数 {
    public static void main(String[] args) {
//       System.out.println(myAtoi("42"));
//        System.out.println(myAtoi("   -42"));
//        System.out.println(myAtoi("4193 with words"));
//       System.out.println(myAtoi("words and 987"));
//        System.out.println(myAtoi("-91283472332"));
        System.out.println(myAtoi("+-42"));
    }

    public static int myAtoi(String s) {
        int is = 0;
        int rel = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='.') {
                break;
            }
            if ( (s.charAt(i)=='-'||s.charAt(i)=='+')&&is != 0){
                return 0;
            }
            if (s.charAt(i)!=' ') {
                if (is!=1&&rel==0){
                    if (Character.isLetter(s.charAt(i))||s.charAt(i)=='0') {
                        return 0;
                    }
                    if ( s.charAt(i)=='-'){
                        is = 1;
                    }if ( s.charAt(i)=='+'){
                        is = 2;
                    }
                }

                if (Character.isDigit(s.charAt(i))) {
                    if (rel>Integer.MAX_VALUE/10|| rel>Integer.MAX_VALUE/10-s.charAt(i)+'0'){
                        return is==0?  Integer.MAX_VALUE:Integer.MIN_VALUE;

                    }
                    rel = rel*10 +s.charAt(i)-'0';
                }
            }
        }
        if (is==1){
            rel = -rel;
        }
        return rel;
    }
}
