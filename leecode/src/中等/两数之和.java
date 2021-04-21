package 中等;

class 两数之和 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }


        public static void main(String[] args) {

        }

        /**
         * @Description:维护一个变量i，即进位，轮询1l2使之相加
         * @Param: [l1, l2, i]
         * @return: 两数之和.Solution.ListNode
         * @Author: albers
         * @Date: 2021/4/21
         */
        public  ListNode math(ListNode l1, ListNode l2, int i) {
            if (null == l1 && null == l2) {
                return i == 0 ? null : new ListNode(i);
            }
            if (null != l1){
                i+=l1.val;
                l1=l1.next;
            } if (null != l2){
                i+=l2.val;
                l1=l2.next;
            }
            return new ListNode(i%10,math(l1,l2,i/10));
        }

        public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
            ListNode rel = new ListNode(0);
            ListNode cursor = rel;
            int index = 0;
            while (l1 != null || l2 != null || index != 0) {
                int l1Val = l1 != null ? l1.val : 0;
                int l2Val = l2 != null ? l2.val : 0;
                int sumVal = l1Val + l2Val + index;
                index = sumVal / 10;
                ListNode sumNode = new ListNode(sumVal % 10);
                cursor.next = sumNode;
                cursor = sumNode;

                if (l1 != null) l1 = l1.next;
                if (l2 != null) l2 = l2.next;
            }
            return rel.next;
        }

    }
}