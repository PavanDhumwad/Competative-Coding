package SLL;

import util.SLL.SLLNode;

public class TortoiseHareAlgo_FindMidElement
{
    public static void main(String[] args)
    {
        SLLNode head = new SLLNode(1);
        head.next= new SLLNode(2);
        head.next.next = new SLLNode(3);
        head.next.next.next = new SLLNode(4);
        head.next.next.next.next = new SLLNode(5);
        System.out.println("Mid element is "+findMidEle(head).data);
    }

    private static SLLNode findMidEle(SLLNode head)
    {
        SLLNode slow = head;
        SLLNode fast = slow.next;
        while (fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
