package LeetCode.Array;

/*
XOR(a,a) = 0
XOR(o,a) = a
 */
public class SingleNumber {
    public static void main(String[] args) {
        int a[] = {7, 1, 5, 7, 1};
        System.out.println("Unique Number is  = " + findSingleNumber(a));
    }

    private static int findSingleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }
}