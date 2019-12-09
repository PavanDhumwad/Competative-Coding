package util.SLL;

public class PrintSLL
{
    public static void printSLL(SLLNode head)
    {
        while (head!=null)
        {
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
}
