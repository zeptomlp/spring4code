package 简单.链表;

import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author: Albers
 * @date: 2021/4/28
 * @description:
 */


public class 环形链表 {
    public static void main(String[] args) {
        ListNode result = new ListNode(3, new ListNode(2, new ListNode(0, new ListNode(3))));
        hasCycle(result);
    }

    /**
     * @Description: 放弃，思路不争取  包含一样数字!=环形链表
     * @Param: [head]
     * @return: boolean
     * @Author: albers
     * @Date: 2021/4/28
     */
    public static boolean 思路错误(ListNode head) {
        if (head == null) {
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        while (head != null) {
            if (null != head.next) {
                if (map.containsKey(head.next.val)) {
                    return true;
                }
            }
            map.put(head.val, 1);
            head = head.next;
        }
        return false;
    }

    /**
     * @Description: 放弃，超出时间限制
     * @Param: [head]
     * @return: boolean
     * @Author: albers
     * @Date: 2021/4/28
     */
    public static boolean 超出时间限制(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode judgeNode = head;
        while (head.next != null) {
            if (head.next == judgeNode) {
                return true;
            }
            head = head.next;
        }
        judgeNode = judgeNode.next;
        return 超出时间限制(judgeNode);
    }

    /**
     * @Description: 快慢指针
     * @Param: [head]
     * @return: boolean
     * @Author: albers
     * @Date: 2021/4/28
     */
    public static boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
    /**
    * @Description: 维持一思路存放到set集合里
    * @Param: [head]
    * @return: boolean
    * @Author: albers
    * @Date: 2021/4/28
    */
    public static boolean 存放到set集合(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }
}
