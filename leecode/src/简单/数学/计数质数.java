package 简单.数学;

/**
 * @author: Albers
 * @date: 2021/5/27
 * @description:
 */
/** 
* @Description: 没完成 
* @Param:  
* @return:  
* @Author: albers
* @Date: 2021/5/27 
*/ 
public class 计数质数 {
    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
    public static int countPrimes(int n) {
        int a = 0;
        for (int i = 1; i <= n; i++) {
            int k = (int) Math.sqrt(i);
            for (int j = 2; i <= k; i++) {
                if (i % j != 0) {
                  a++;
                }
            }
        }
        return a;
    }
}
