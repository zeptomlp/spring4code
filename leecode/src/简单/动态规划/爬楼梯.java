package 简单.动态规划;

/**
 * @author: Albers
 * @date: 2021/5/17
 * @description:
 */


/*
*
* f(n)=f(n-1)+f(n-2)
* 一次跳可跳m个台阶
*f(n) = 2f(n-1) - f(n-m-1)；(n>m)
*
* */
public class 爬楼梯 {
    public static void main(String[] args) {
        System.out.println(climbStairs(10));
        System.out.println(climbStairs2(10));
    }
    //
    public static int climbStairs(int n) {
            if(n <= 2) {
                return n;
            }
            /*

            12358...前两个相加等于第三个
            * one : 表示共有几种方法
            * teo:表示下一层方法数
            * */
            int one = 1, two = 2, idx = 1;
            while (idx != n) {
                int next = one;
                one = two;
                two = next + two;
                idx++;
            }
            return one;
    }
    /** 
    * @Description: 时间超限制
    * @Param: [n] 
    * @return: int 
    * @Author: albers
    * @Date: 2021/5/17 
    */ 
    public static int climbStairs2(int n) {
        if(n <= 2) {
            return n;
        }
        return climbStairs2(n-1)+climbStairs2(n-2);
    }
    //公式法
    public static int climbStairs3(int n) {
        double sqrt = Math.sqrt(5);
        return (int) ((Math.pow((1 + sqrt) / 2, n + 1) - Math.pow((1 - sqrt) / 2, n + 1)) / sqrt);

    }
}
