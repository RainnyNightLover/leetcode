package tools;

public class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode genListNode(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        ListNode head = new ListNode(nums[0]);
        ListNode cur = head;
        for (int i = 0; i < nums.length; i++) {
            cur.next = new ListNode(nums[i]);
            cur = cur.next;
        }
        return head;
    }

    public void printListNode(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
