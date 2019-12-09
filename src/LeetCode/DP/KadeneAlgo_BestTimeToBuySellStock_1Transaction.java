package LeetCode.DP;

/*
For max. profit->Current element - min element > max_diff

Application of Kadene Algorithm-
We just generate in memory difference between consecutive elements.
Then max. proift -> Largest Sum of Contiguous Subarray

 */
public class KadeneAlgo_BestTimeToBuySellStock_1Transaction
{
    public static void main(String[] args) {
        int a[] = {7,1,5,3,6,4};
        int n = a.length;
        System.out.println("Max profit = "+maxProfit(a, n));
        System.out.println("Max profit (Application of Kadene Algorithm)  = "+maxProfitUsingKadeneAlgorithm(a, n));

    }
    static int maxProfit(int[] arr, int n) {
        if (arr.length <= 1)
            return 0;
        int max_diff = arr[1] - arr[0];
        int min_element = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - min_element > max_diff)
                max_diff = arr[i] - min_element;
            if (arr[i] < min_element)
                min_element = arr[i];
        }
        if (max_diff < 0)
            return 0;
        return max_diff;
    }

    static int maxProfitUsingKadeneAlgorithm(int a[], int n)
    {
        int max_so_far = Integer.MIN_VALUE;
        int curr_max = 0;
        for (int i = 1; i < a.length; i++)
        {
            int diff = a[i] - a[i-1];
            curr_max = Math.max(diff, curr_max + diff);
            max_so_far = Math.max(max_so_far, curr_max);
        }
        if(max_so_far<0)
            return 0;
        return max_so_far;
    }
}
