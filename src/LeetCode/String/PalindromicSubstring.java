package LeetCode.String;

public class PalindromicSubstring
{
    static int count = 0;
    public static void main(String[] args) {
        String str = "aaa";
        System.out.println("No. of Substring which are palindrome "+countAllPallindrome(str));
    }

    public static int countAllPallindrome(String str)
    {

        if (str == null || str.length() == 0) return 0;
        for(int i=0; i<str.length(); i++)
        {
            isSubstringPalindrome(i,i,str);
            isSubstringPalindrome(i,i+1, str);
        }
        return count;
    }

    private static void isSubstringPalindrome(int low, int high, String str) {
        while(low >= 0 && high < str.length() && str.charAt(low) == str.charAt(high))
        {
            count++; low--; high++;
        }
    }
}
