package LeetCode.DayChallenge;

import java.util.HashMap;

public class FirstUniqueCharacterString
{
    public static void main(String[] args) {
        String S = "lel";
        HashMap<Character, Integer> map = new  HashMap<>();
        for(int i=0; i<S.length(); i++)
            map.put(S.charAt(i), map.getOrDefault(S.charAt(i), 0)+1);
        for(int i=0; i<S.length(); i++)
        {
            if(S.charAt(i)==1)
                System.out.println("Index "+i);
        }
        System.out.println("Index -1");
    }
}
