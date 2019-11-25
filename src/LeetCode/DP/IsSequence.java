package LeetCode.DP;

public class IsSequence {
    public static void main(String[] args) {
        String text = "axc";
        String pattern = "ahbgdc";
        System.out.println(pattern.substring(0,pattern.length()-1));
        int textLen = text.length();
        int patternLen = pattern.length();
        System.out.println(isSubSequence(text, pattern, textLen, patternLen));
    }

    private static boolean isSubSequence(String text, String pattern, int textLen, int patternLen)
    {
        if(patternLen == 0)
            return true;
        if(textLen == 0)
            return false;
        if(text.charAt(textLen-1)==pattern.charAt(patternLen-1))
            isSubSequence(text,pattern,textLen-1,patternLen-1);
        return isSubSequence(text,pattern,textLen-1,patternLen);
    }

}
