package 简单.链表;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author: Albers
 * @date: 2021/4/27
 * @description:
 */
public class 反转链表 {


    public static void main(String[] args) {
        ListNode result = new ListNode(1, new  ListNode(2, new  ListNode(3, new  ListNode(4, new ListNode(5)))));
        reverseList(result);
    }
    public static ListNode reverseList(ListNode head) {
        //新建返回链表   0-null
        ListNode listNode = new ListNode(0);
        //赋值
        ListNode newNode = head;
        //遍历赋值
        while (newNode!=null){
            //下次循环新值
            ListNode copyNode = newNode.next;
            //拼接赋值给返回值
            newNode.next = listNode.next;
            listNode.next = newNode;
            newNode =copyNode;
        }
        return listNode.next;
    }

}
