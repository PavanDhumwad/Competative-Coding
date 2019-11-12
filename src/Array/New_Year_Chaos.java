package Array;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;

public class New_Year_Chaos
{
    static void minimumBribes(Integer[] q)
    {
        int i;
        for( i=0;i<q.length;i++)
        {
            if(q[i]-1-i >= 3)
            {
                System.out.println("Too chaotic");
                return;
            }
        }

        LinkedList<Integer> arr = new LinkedList<>();
        for (i=0;i<q.length;i++)
            arr.add(i+1);
        for (i=0 ; i<arr.size(); i++)
        {
            if(arr.get(i) != q[i])
            {
                arr.addAll(i,arr.subList(i,arr.size()));
            }
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            Integer[] q = new Integer[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
