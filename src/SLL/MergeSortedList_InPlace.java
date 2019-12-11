package SLL;

import util.SLL.SLLNode;

import static util.SLL.PrintSLL.printSLL;

public class MergeSortedList_InPlace
{
    public static void main(String[] args) {
        SLLNode list1 = new SLLNode(1);
        list1.next = new SLLNode(2);
        SLLNode list2 = new SLLNode(3);
        list2.next = new SLLNode(4);
        SLLNode mergeList = mergeList(list1,list2);
        printSLL(mergeList);
    }

    private static SLLNode mergeList(SLLNode l1, SLLNode l2)
    {
        SLLNode headNode = new SLLNode(-989);
        SLLNode curr = headNode;
        while(l1!=null && l2!=null)
        {
            if(l1.data<l2.data)
            {
                curr.next = l1;
                curr = l1;
                l1 = l1.next;
            }
            else
            {
                curr.next = l2;
                curr = l2;
                l2 = l2.next;
            }
        }
        if(l2 == null)
            curr.next = l1;
        else
            curr.next = l2;

        return headNode.next;
    }
}
