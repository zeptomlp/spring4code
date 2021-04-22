package 简单.字符串;

/**
 * @author: Albers
 * @date: 2021/4/22
 * @description:
 */
public class 反转字符串 {
    public static void main(String[] args) {

    }

    /**
     * @Description: 对称jiaohuan
     * @Param: [s]
     * @return: void
     * @Author: albers
     * @Date: 2021/4/22
     */
    public static void reverseString(char[] s) {

        int length = s.length;
        char temp;
        for (int i = 0; i < length / 2; i++) {
            temp = s[i];
            s[i] = s[length - 1 - i];
            s[length - 1 - i] = temp;
        }
    }

}
