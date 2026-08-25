class Solution {
    public ListNode middleNode(ListNode list) {
        ListNode slow=list;
        ListNode fast=list;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}