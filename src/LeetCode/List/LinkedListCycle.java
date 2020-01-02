package LeetCode.List;

import util.SLL.SLLNode;

public class LinkedListCycle
{
    public static void main(String[] args) {
        SLLNode head = new SLLNode(1);
        head.next= new SLLNode(2);
        head.next.next = new SLLNode(3);
        System.out.println("Is cycle exists? "+isCycleExists(head));
    }

    private static boolean isCycleExists(SLLNode head)
    {
        if(head == null || head.next == null)
            return false;
        SLLNode slow = head;
        SLLNode fast = head.next.next;
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
                return true;
        }
        return false;
    }
}
