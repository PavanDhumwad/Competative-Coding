package SLL;

import util.SLL.SLLNode;

public class FindLLCycle_FindNode
{
    public static void main(String[] args) {
        SLLNode head = new SLLNode(1);
        head.next= new SLLNode(2);
        head.next.next = new SLLNode(3);
        head.next.next.next= new SLLNode(4);
        head.next.next.next.next = new SLLNode(5);
        head.next.next.next.next.next = head.next.next;
        findCycleAndNode(head);
    }

    private static void findCycleAndNode(SLLNode head)
    {
        if(head == null || head.next == null)
            System.out.println("Cycle does not exists");
        SLLNode slow = head.next;
        SLLNode fast = head.next.next;
        while(fast != null && fast.next != null)
        {
            if(fast == slow)
                break;
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast != slow)
            System.out.println("Cycle does not exists");
        slow = head;
        while (slow != fast)
        {
            slow = slow.next;
            fast = fast.next;
        }
        System.out.println("Cycle exists and starts from node "+slow.data);
    }
}
