package LeetCode.Array;

public class MoveZeroes
{
    public static void main(String[] args) {
        int a[] = {0,1,0,3,12};
        placeZeroAtEnd(a);
        for(int i=0; i<a.length; i++)
            System.out.print(a[i]+"  ");
    }

    private static void placeZeroAtEnd(int[] nums)
    {
        int i,j=0;
        for(i=0; i<nums.length; i++)
        {
            if(nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for (i=j; i<nums.length; i++)
            nums[i] = 0;
    }
}
