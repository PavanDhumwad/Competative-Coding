package LeetCode.DP;
/*
Q-> In series of house, find max. amt you can loot w/o robbing adjacent house.
                                    OR
    In array find max sum such that no two elements are adjacent
                                    OR
    In array find sub array such that no two elements in sub-array are adjacent

Ans->  You have 2 choice for each house
		1. You can chose. When you choose you add loot amt
		2. You won't chose

 */
public class HouseRobber
{
    public static void main(String[] args) {
        int cost[] = {2,7,9,3,1};//{ 2,4,3,8,10 };
        int n = cost.length;
        System.out.println("Max Looted amt (using Recurssion)= "+maxLootAmtRecurrsion(cost, n-1));
        System.out.println("Max Looted amt (using DP with extra space)= "+maxLootAmtDP(cost, n));
        System.out.println("Max Looted amt (using DP w/o extra space)= "+maxLootAmtDPNoExtraSpace(cost, n));
    }

    private static int maxLootAmtDPNoExtraSpace(int[] cost, int n) //O(n) O(1)
    {
        int i, previous = cost[0];
        int adjacent = Math.max(cost[0],cost[1]);
        for(i=2; i<n; i++)
        {
            int temp = adjacent;
            adjacent = Math.max(cost[i]+previous,/*You choose*/
                    adjacent/*You won't choose*/);
            previous = temp;
        }
        return adjacent;
    }

    private static int maxLootAmtDP(int[] cost, int n) //O(n), O(n)
    {
        if(n==0)
            return 0;
        if(n==1)
            return cost[0];
        int[] dp = new int[n];
        dp[0] = cost[0];
        dp[1] = Math.max(cost[0],cost[1]);
        int i;

        for(i=2; i<n; i++)
        {
            dp[i] = Math.max(cost[i]+dp[i-2],/*You choose*/
                                dp[i-1]/* You don't choose*/);
        }
        return dp[i-1];

    }

    private static int maxLootAmtRecurrsion(int[] cost, int n) //O(n^2)
    {
        if(n<0)
            return 0;
        return Math.max(cost[n]+maxLootAmtRecurrsion(cost,n-2)/*You choose*/,
                        maxLootAmtRecurrsion(cost,n-1)/* You don't choose*/);
    }
}
