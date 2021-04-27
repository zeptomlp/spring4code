package 简单.链表;

/**
 * @author: Albers
 * @date: 2021/4/27
 * @description:
 */
public class 合并两个有序链表 {
    public static void main(String[] args) {
        ListNode listNode = mergeTwoLists(new ListNode(1, new ListNode(2, new ListNode(3))), new ListNode(3, new ListNode(4, new ListNode(5))));
        System.out.println("listNode = " + listNode);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 != null && l2 == null) {
            return l1;
        }
        if (l1 == null && l2 != null) {
            return l2;
        }

        if (l1.val < l2.val) {
            listNode = l1;
            listNode.next = mergeTwoLists(l1.next, l2);
        } else {
            listNode = l2;
            listNode.next = mergeTwoLists(l1, l2.next);
        }
        return listNode;
    }

    public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 != null && l2 == null) {
            return l1;
        }
        if (l1 == null && l2 != null) {
            return l2;
        }

        ListNode head = l1.val < l2.val ? l1 : l2;
        ListNode cur1 = head == l1 ? l1 : l2;
        ListNode cur2 = head == l1 ? l1 : l2;
        ListNode pre = null;//cur1前一个元素
        ListNode next = null;//cur2的后一个元素
        while (cur1 != null && cur2 != null) {
            //第一次进来肯定走这里
            if (cur1.val <= cur2.val) {
                pre = cur1;
                cur1 = cur1.next;
            } else {
                next = cur2.next;
                pre.next = cur2;
                cur2.next = cur1;
                pre = cur2;
                cur2 = next;
            }
        }
        pre.next = cur1 == null ? cur2 : cur1;
        return head;

    }

}
