package 简单.链表;

import java.util.Stack;

/**
 * @author: Albers
 * @date: 2021/4/27
 * @description:
 */
public class 回文链表 {
    public static void main(String[] args) {
        boolean palindrome = isPalindrome(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(2, new ListNode(2))))));
        System.out.println("palindrome = " + palindrome);
    }


    /**
     * @Description: 可以实现，但是超时，没有 O(n) 时间复杂度和 O(1) 空间复杂度
     * @Param: [head]
     * @return: boolean
     * @Author: albers
     * @Date: 2021/4/27
     */
    public static boolean isPalindrome(ListNode head) {
        int length = listNodeLength(head);
        ListNode listNode = new ListNode();
        listNode = head;
        //记录第几个
        int num = 1;
        int count = length - 1;
        for (int index = 1; index <= length / 2; index++) {
            int m = num;
            while (index - m != 0) {
                m++;
                head = head.next;
            }
            int val1 = head.val;
            head = listNode;
            int j = count--;
            while (j-- != 0) {
                head = head.next;
            }
            int val2 = head.val;
            if (val2 != val1) {
                return false;
            }
            head = listNode;
        }
        return true;
    }

    public static int listNodeLength(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }





/**
* @Description: 快慢指针法   分成前后两部分，旋转一部分，然后比对   此效率最快
* @Param: [head]
* @return: boolean
* @Author: albers
* @Date: 2021/4/27
*/
    public static boolean isPalindrome2(ListNode head) {
        ListNode fast = head, slow = head;
        //通过快慢指针找到中点
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //如果fast不为空，说明链表的长度是奇数个
        if (fast != null) {
            slow = slow.next;
        }
        //反转后半部分链表
        slow = reverse(slow);

        fast = head;
        while (slow != null) {
            //然后比较，判断节点值是否相等
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    //反转链表
    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }




    /**
    * @Description: 使用stack
    * @Param:
    * @return:
    * @Author: albers
    * @Date: 2021/4/27
    */
    public static boolean isPalindrome3(ListNode head) {
        ListNode temp = head;
        Stack<Integer> stack = new Stack();
        while (temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }
        while (head != null) {
            if (head.val != stack.pop()) {
                return false;
            }
            head = head.next;
        }
        return true;
    }

}
