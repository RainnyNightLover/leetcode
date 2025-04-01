package one_ten;

import tools.ListNode;

public class _02addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = l1;
        int valueNext = (l1.val + l2.val) / 10;
        int valueLocal = (l1.val + l2.val) % 10;
        int div;
        l1.val = valueLocal;
        /**
         当前的节点数据处理过了，每次向下执行，都是要尝试处理下一个节点的数据
         */
        while (null != l1.next && null != l2.next) {
            l1 = l1.next;
            l2 = l2.next;
            div = (l1.val + l2.val + valueNext) / 10;
            valueLocal = (l1.val + l2.val + valueNext) % 10;
            l1.val = valueLocal;
            valueNext = div;
        }
        if (null != l1.next) {
            while (null != l1.next) {
                l1 = l1.next;
                div = (l1.val + valueNext) / 10;
                valueLocal = (l1.val + valueNext) % 10;
                l1.val = valueLocal;
                valueNext = div;
            }
            if (valueNext > 0) {
                ListNode append = new ListNode();
                append.val = valueNext;
                l1.next = append;
            }
        }
        if (null != l2.next) {
            l1.next = l2.next;
            while (null != l1.next) {
                l1 = l1.next;
                div = (l1.val + valueNext) / 10;
                valueLocal = (l1.val + valueNext) % 10;
                l1.val = valueLocal;
                valueNext = div;
            }
            if (valueNext > 0) {
                ListNode append = new ListNode();
                append.val = valueNext;
                l1.next = append;
            }
        }
        if (null == l1.next && null == l2.next) {
            if (valueNext > 0) {
                ListNode append = new ListNode();
                append.val = valueNext;
                l1.next = append;
            }
        }
        return head;
    }


    public static void main(String[] args) {
    }

}
