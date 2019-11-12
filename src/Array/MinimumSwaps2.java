package Array;

import javafx.util.Pair;
import java.io.IOException;
import java.util.*;

public class MinimumSwaps2
{
    static int minimumSwaps(int[] arr)
    {
        ArrayList<Pair<Integer,Integer>> arrPos = new ArrayList<>();
        int i, j, len = arr.length;
        for(i = 0; i < len; i++)
        {
            arrPos.add(new Pair<>(arr[i],i));
        }
        arrPos.sort(new Comparator<Pair<Integer, Integer>>()
        {
            @Override
            public int compare(Pair<Integer, Integer> o1,
                               Pair<Integer, Integer> o2)
            {
                if (o1.getKey() > o2.getKey())
                    return 1;

                else if (o1.getKey().equals(o2.getKey()))
                    return 0;

                else
                    return -1;
            }
        });
        System.out.println(arrPos);
        Boolean[] visited = new Boolean[len];
        Arrays.fill(visited,false);
        int minSwap = 0, cycleLength;

        for(i=0;i<len;i++)
        {
            if(visited[i] || arrPos.get(i).getValue() == i)
                continue;
            j = i;
            cycleLength = 0;
            while(!visited[j])
            {
                visited[j] = true;
                cycleLength++;
                j = arrPos.get(j).getValue();
            }
            if(cycleLength > 0)
                minSwap+= (cycleLength - 1);
        }
        return minSwap;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        //String[] arrItems = scanner.nextLine().split(" ");
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            //int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = scanner.nextInt();//arrItem;
        }
        int res = minimumSwaps(arr);
        System.out.println(res);

        /*bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();*/

        scanner.close();
    }
}
