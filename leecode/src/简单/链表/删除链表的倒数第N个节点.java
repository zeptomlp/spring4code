package 简单.链表;

/**
 * @author: Albers
 * @date: 2021/4/26
 * @description:
 */
public class 删除链表的倒数第N个节点 {


    public static void main(String[] args) {
        ListNode result = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        removeNthFromEnd(result, 2);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newHead = head;
        int last = length(head) - n;

        if (last == 0) {
            return head.next;
        }

        for (int i = 1; i < last; i++) {
            newHead = newHead.next;
        }

        newHead.next = newHead.next.next;
        return head;
    }
    private static int length(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }


}
