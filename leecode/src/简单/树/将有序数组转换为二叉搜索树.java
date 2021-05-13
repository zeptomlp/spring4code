package 简单.树;

/**
 * @author: Albers
 * @date: 2021/5/13
 * @description:
 */
public class 将有序数组转换为二叉搜索树 {

    public static void main(String[] args) {
        TreeNode treeNode = sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});
        System.out.println("123123123123");
    }
    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        TreeNode treeNode = sortedArrayToBSTmath(nums, 0, nums.length - 1);
        return treeNode;
    }

    public static TreeNode sortedArrayToBSTmath(int[] nums, int begin, int end) {
        if (begin > end) {
            return null;
        }
        int mid = (begin + end)/2;
        TreeNode treeNode = new TreeNode(nums[mid]);
        treeNode.left = sortedArrayToBSTmath(nums, begin, mid - 1);
        treeNode.right = sortedArrayToBSTmath(nums, mid + 1, end);
        return treeNode;
    }

}
