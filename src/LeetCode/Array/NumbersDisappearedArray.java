package LeetCode.Array;

import java.util.ArrayList;

public class NumbersDisappearedArray
{
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        for (int i=0;i<nums.length;i++)
        {
            int absoluteVal = Math.abs(nums[i]);
            if(nums[absoluteVal-1] > 0)
                nums[absoluteVal-1] = -nums[absoluteVal-1];
        }
        ArrayList<Integer> missingNum = new ArrayList<>();
        for (int i=0;i<nums.length;i++)
        {
            if(nums[i] > 0) {
                missingNum.add(i+1);
            }
        }
        System.out.println(missingNum);

    }
}
