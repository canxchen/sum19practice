import java.util.*;
public class longestSubstrNoRep {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        int[] dp = new int[s.length()];
        Set seen = new HashSet();
        seen.add(s.charAt(0));
        dp[0] = 1;
        int largest = 1;
        for (int i = 1; i < dp.length; i++) {
            if (seen.contains(s.charAt(i))) {
                dp[i] = 1;
                largest = largest > dp[i-1] ? largest : dp[i-1];
                seen.clear();
                //clear substring, INCLUDE CURRENT CHARACTER AS SEEN
                seen.add(s.charAt(i));
            } else {
                dp[i] = dp[i-1] + 1;
                seen.add(s.charAt(i));
            }
        }
        return largest;
    }
}
