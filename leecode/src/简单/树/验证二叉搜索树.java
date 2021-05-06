package 简单.树;

import java.util.Stack;

/**
 * @author: Albers
 * @date: 2021/4/28
 * @description:
 */
public class 验证二叉搜索树 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        boolean validBST = isValidBST(treeNode);
        System.out.println("validBST = " + validBST);
    }

    /**
     * @Description: 轮询方法
     * @Param: [root]
     * @return: boolean
     * @Author: albers
     * @Date: 2021/4/29
     */
    public static boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public  static boolean isValidBST(TreeNode root, long minVal, long maxVal) {
        if (root == null) {
            return true;
        }
        if (root.val >= maxVal || root.val <= minVal) {
            return false;
        }
        return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
    }



}
