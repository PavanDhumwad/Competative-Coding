package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Permutation
{
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> result = new ArrayList<>();
        generatePermutation(nums, result, 0, nums.length-1);
        System.out.println(result);;
    }
    private static void generatePermutation(int[] nums, List<List<Integer>> result, int l, int r)
    {
        if (l == r)
        {
            ArrayList<Integer> inst = new ArrayList<>();
            for(int i=0; i<nums.length; i++)
                inst.add(nums[i]);
            result.add(inst);
        }
        else
        {
            for (int i = l; i <= r; i++)
            {
                swap(nums,l,i);
                generatePermutation(nums, result, l+1, r);
                swap(nums,l,i);
            }
        }
    }
    private static void swap(int nums[], int l, int i)
    {
        int temp = nums[l];
        nums[l] = nums[i];
        nums[i] = temp;
    }
}
