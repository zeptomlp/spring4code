package 简单.链表;

/**
 * @author: Albers
 * @date: 2021/4/26
 * @description:
 */
public class 删除链表中的节点 {
    //输入：head = [4,5,1,9], node = 5
    //输出：[4,1,9]
 public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
/** 
* @Description: 找替死鬼
* @Param: [node] 
* @return: void 
* @Author: albers
* @Date: 2021/4/26 
*/ 
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
