package 简单.字符串;

/**
 * @author: Albers
 * @date: 2021/4/22
 * @description:
 */
public class 整数反转 {
    public static void main(String[] args) {
        System.out.println(reverse2(1534236469));
    }
    /**
    * @Description: 会溢出
    * @Param: [x]
    * @return: int
    * @Author: albers
    * @Date: 2021/4/22
    */
    public static int reverse(int x) {
        int abs = Math.abs(x);
        char[] chars = String.valueOf(abs).toCharArray();
        int length = chars.length;
        char temp;
        for (int i = 0; i < length / 2; i++) {
            temp = chars[i];
            chars[i] = chars[length - 1 - i];
            chars[length - 1 - i] = temp;
        }

        StringBuffer buffer = new StringBuffer();
        if (x<0){
            buffer.append("-");
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[0]==0&i==0){
                continue;
            }
            buffer.append(chars[i]);
        }

       return (int) Long.parseLong(buffer.toString());
    }
    /**
     * @Description: 会
     * @Param: [x]
     * @return: int
     * @Author: albers
     * @Date: 2021/4/22
     */
    public static int reverse2(int x) {
        int res = 0;
        while (x != 0) {
            int t = x % 10;
            int newRes = res * 10 + t;
            //如果数字溢出，直接返回0
            if ((newRes - t) / 10 != res) {
                return 0;
            }
            res = newRes;
            x = x / 10;
        }
        return res;
    }
    public static int reverse3(int x) {
        int result = 0 ;
        while (x!=0){
            int i = x % 10;
            int n = result * 10 + i;
            if ((n - i) /10!=result){
                return  0;
            }
            result = n;
            x = x/10;

        }
        return result;
    }
}
