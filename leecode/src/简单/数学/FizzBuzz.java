package 简单.数学;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Albers
 * @date: 2021/5/27
 * @description:
 */
public class FizzBuzz {
    public static void main(String[] args) {
        List<String> strings = fizzBuzz(15);
        for (String s : strings) {
            System.out.println(s);
        }
    }

    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        String a = null;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                if (i % 3 == 0) {
                    a = "Fizz";
                }
                if (i % 5 == 0) {
                    a = "Buzz";
                }
                if (i % 3 == 0 && i % 5 == 0) {
                    a = "FizzBuzz";
                }
            }else {
                a = String.valueOf(i);
            }
            list.add(a);
        }
        return list;
    }
}
