package Algorithm;

public class MooreVotingAlgorithm
{
    public static void main(String[] args)
    {
        int a[] = {2,2,1,1,1,2,2};
        System.out.print("Most occurring ele(>n/2) "+mostOccurringEle(a));
    }

    private static int mostOccurringEle(int[] nums) {
        int mostOccurring = nums[0];
        int freq = 1;
        for (int i=1; i<nums.length; i++)
        {
            if(nums[i] == mostOccurring)
            {
                freq++;
            }
            else
                freq--;
            if(freq==0)
            {
                mostOccurring = nums[i];
                freq = 1;
            }
        }
        return mostOccurring;
    }

}
