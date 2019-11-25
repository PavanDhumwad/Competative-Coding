package LeetCode.DP;

public class MinCostClimbingStairs
{
    public static void main(String[] args) {
        int cost[] = {2,4,1,5,7};//{ 2,4,3,8,10 };
        int n = cost.length;
        System.out.println("Min cost to climb = "+minCostClimbingStairs(cost, n));
    }

    private static int minCostClimbingStairs(int[] cost, int n)
    {
        for(int i=2; i<cost.length;i++)
        {
            cost[i] = cost[i] + (Math.min(cost[i-1],cost[i-2]));
        }
        return Math.min(cost[n-1],cost[n-2]);
    }
}
