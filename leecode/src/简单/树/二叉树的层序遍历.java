package 简单.树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: Albers
 * @date: 2021/5/6
 * @description:
 */
public class 二叉树的层序遍历 {
    public static void main(String[] args) {
        levelOrder(new TreeNode(3, new TreeNode(9, new TreeNode(11, null, null), new TreeNode(12, null, null)), new TreeNode(20, new TreeNode(15, null, null), new TreeNode(17, null, null))));
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        if (null == root) {
            return list;
        }
        // TODO: 2021/5/6 未完成 
        int count = 0;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            root = queue.pop();
            list2.add(root.val);

            System.out.println("root.val = " + root.val);
            if (root.left != null) {
                queue.add(root.left);
            }
            if (root.right != null) {
                queue.add(root.right);
            }

            if (count == 0) {
                list.add(list2);
                list2.clear();
                count = queue.size();
            } else {
                count--;
            }

        }
        return list;
    }


}
