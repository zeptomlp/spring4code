package 简单.树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: Albers
 * @date: 2021/5/6
 * @description:
 */
public class 对称二叉树 {
    /**
     * @Description: 递归解决
     * @Param: [root]
     * @return: boolean
     * @Author: albers
     * @Date: 2021/5/6
     */
    public static boolean isSymmetric(TreeNode root) {
        if (null == root) {
            return true;
        }
        return isSymmetricnext(root.left, root.right);
    }

    public static boolean isSymmetricnext(TreeNode left, TreeNode right) {
        if (null == right && null == left) {
            return true;
        }
        if (null == right || null == left || left.val != right.val) {
            return false;
        }
        //左边左节点跟右边右节点比较,左边右节点跟右边左节点比较
        return isSymmetricnext(left.left, right.right) && isSymmetricnext(left.right, right.left);

    }

    /**
    * @Description:非递归可以用队列解决,记住出入顺序
    * @Param:
    * @return:
    * @Author: albers
    * @Date: 2021/5/6
    */
}
