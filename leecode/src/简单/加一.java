package 简单;

/**
 * @author: Albers
 * @date: 2021/4/21
 * @description:
 */
public class 加一 {
    public static void main(String[] args) {
        System.out.println(plusOne(new int[]{9, 9, 9, 9, 9}));
    }
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int temp[] = new int[digits.length + 1];
        temp[0] = 1;
        return temp;

    }
}
