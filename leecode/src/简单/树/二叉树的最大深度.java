package 简单.树;

/**
 * @author: Albers
 * @date: 2021/4/28
 * @description:
 */
public class 二叉树的最大深度 {
/*
*   3
   / \
  9  20
    /  \
   15   7
* */

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3,new TreeNode(9),new TreeNode(20,new TreeNode(15),new TreeNode(7)));
        maxDepth(treeNode);
    }
/**
* @Description: 递归求最深
* @Param: [root]
* @return: int
* @Author: albers
* @Date: 2021/4/28
*/
    public static int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

}
