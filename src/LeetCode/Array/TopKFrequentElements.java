package LeetCode.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TopKFrequentElements
{
    public static void main(String[] args) {
        int[] arr = {1};
        int k = 1;
        System.out.println("Top "+k+" FrequentElements - "+topKFrequentElements(arr, k));
    }

    private static List<Integer> topKFrequentElements(int[] nums, int k)
    {
        List<Integer>[] list = new List[nums.length+1];
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for (int key: nums)
            freqMap.put(key,freqMap.getOrDefault(key,0)+1);
        for (int key: freqMap.keySet())
        {
            int frequency = freqMap.get(key);
            if (list[frequency]==null)
                list[frequency] = new ArrayList<>();
            list[frequency].add(key);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = nums.length; i>=0 && result.size()<k; i--) {
            if (list[i] != null)
                result.addAll(list[i]);
        }
        return result;
    }
}
