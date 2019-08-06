import java.util.List;

public class wordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        if (s==null||wordDict==null||s.length()==0||wordDict.size()==0) return false;
        //boolean array: is the string ending at the current index  able to be broken up
        boolean[] dp = new boolean[s.length() + 1];

        //base case: the empty string
        dp[0]=true;

        //for each letter of the string s (dp is just 1+d.length
        for (int i = 1; i < dp.length; i++) {

            //for all words
            for (String str : wordDict) {

                //if i > str.length OR if i-strlength >= 0
                //so, if the curr_position-str.length is within range
                if (str.length() <= i) {

                    //if the previous string is valid, and the string starting FROM that string
                    //and ending at current character matches the current word, yah good.
                    if (dp[i - str.length()] && str.equals(s.substring(i - str.length(), i))){
                        dp[i] = true;
                        break;
                    }
                }
            }
        }
        //return the boolean value of hte last character (represents whole string
        return dp[dp.length-1];
    }
    //this one timed out but it worked on all the smaller test cases
    /*public boolean helper(String s, List<String> wordDict, int min) {
        if (s.length() == 0) return true;
        if (s.length() < min) return false;

        for (String word : wordDict) {
            if (s.length() >= word.length()) {
                if (s.substring(0,word.length()).equals(word)) {
                    if (s.length()==word.length()) return true;
                    if (helper(s.substring(word.length()), wordDict, min)) return true;
                }
            }
        }
        return false;
    }*/
}
