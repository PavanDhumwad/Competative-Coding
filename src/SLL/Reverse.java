package SLL;

import util.SLL.SLLNode;

import static util.SLL.PrintSLL.printSLL;

public class Reverse
{
    public static void main(String[] args) {
        SLLNode head = new SLLNode(1);
        head.next= new SLLNode(2);
        head.next.next = new SLLNode(3);
        head.next.next.next = new SLLNode(4);
        printSLL(head);
        SLLNode newHead = reverse(head);
        printSLL(newHead);
    }

    private static SLLNode reverse(SLLNode head)
    {
        SLLNode previous = null;
        SLLNode curr = head;
        SLLNode next = head;
        while (curr!=null)
        {
            next = curr.next;
            curr.next = previous;
            previous = curr;
            curr = next;
        }
        return previous;
    }
}
