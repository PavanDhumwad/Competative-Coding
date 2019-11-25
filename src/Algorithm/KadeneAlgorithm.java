package Algorithm;

/*
Largest Sum of Contiguous Subarray
Start & End index of Sum
 */
public class KadeneAlgorithm
{
    static int maxSubArraySum(int a[], int size)
    {
        int max_so_far = a[0];
        int curr_max = a[0];
        boolean startIndex = false;
        int start, end;
        start = end = 0;

        for (int i = 1; i < size; i++)
        {
            curr_max = Math.max(a[i] , curr_max + a[i]);
            if(curr_max > max_so_far) //max_so_far = Math.max(max_so_far, curr_max);
            {
                max_so_far = curr_max;
                if(!startIndex)
                {
                    start = i;
                    startIndex = true;
                }
                else
                    end = i;
            }

        }
        System.out.println("Start index(included) " +start);
        System.out.println("End index(included) "+end);
        return max_so_far;
    }
    public static void main(String[] args) {
        int a[] = {-2,4,-1,5,-7};//{ -2, -3, 4, -1, -2, 1, 5, -3 };
        int n = a.length;
        System.out.println("Max sum = "+maxSubArraySum(a, n));
    }
}
