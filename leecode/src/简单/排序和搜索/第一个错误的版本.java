package 简单.排序和搜索;

/**
 * @author: Albers
 * @date: 2021/5/17
 * @description:
 */

//说白了就是通过二分法找  100  50   75  .。。。。。。
public class 第一个错误的版本 {
    public int firstBadVersion(int n) {
        int start = 1, end = n;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (!isBadVersion(mid)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    private boolean isBadVersion(int mid) {
        return false;
    }
}
