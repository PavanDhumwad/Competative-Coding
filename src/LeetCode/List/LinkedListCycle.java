package LeetCode.List;

import util.SLL.SLLNode;

public class LinkedListCycle
{
    public static void main(String[] args) {
        SLLNode head = new SLLNode(1);
        head.next= new SLLNode(2);
        head.next.next = new SLLNode(3);
        head.next.next.next= new SLLNode(4);
        head.next.next.next.next = new SLLNode(5);
        head.next.next.next.next.next = head.next.next;
        System.out.println("Is cycle exists? "+isCycleExists(head));
    }

    private static boolean isCycleExists(SLLNode head)
    {
        if(head == null || head.next == null)
            return false;
        SLLNode slow = head.next;
        SLLNode fast = head.next.next;
        while(fast != null && fast.next != null)
        {
            if(fast == slow)
                return true;
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }
}
