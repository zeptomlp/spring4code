package 简单.树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author: Albers
 * @date: 2021/5/6
 * @description:
 */
public class 二叉树的层序遍历 {
    public static void main(String[] args) {
        //levelOrder(new TreeNode(3, new TreeNode(9, null, null), new TreeNode(20, new TreeNode(15, null, null), new TreeNode(17, null, null))));
        levelOrder(new TreeNode(1, new TreeNode(2, new TreeNode(4, null, null), null), new TreeNode(3, null, new TreeNode(5, null, null))));
    }

    /**
     * @Description: 仅实现层序遍历未返回
     * @Param: [root]
     * @return: java.util.List<java.util.List < java.lang.Integer>>
     * @Author: albers
     * @Date: 2021/5/12
     */
    public void test(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            root = queue.pop();
            System.out.println("root.val = " + root.val);
            if (root.left != null) {
                queue.add(root.left);
            }
            if (root.right != null) {
                queue.add(root.right);
            }
        }
    }
//   1
//   / \
//  2  3
// /\  /\
//4      5

    /**
     * @Description: 差一点儿
     * @Param: [root]
     * @return: java.util.List<java.util.List < java.lang.Integer>>
     * @Author: albers
     * @Date: 2021/5/12
     */
    public static List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        while (!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            result.add(list);
        }
        return result;
    }


}
