package com.company;
public class Main {
    public static void main(String[] args) {
        if (longestPalindrome("babad").equals("bab") || longestPalindrome("babad").equals("aba")) {
            System.out.println("longest palindrome on 'babad' worked!!");
        } else {
            System.out.println(longestPalindrome("babad"));
            System.out.println("testing longest palindrome on 'babad' failed");
        }
        if (longestPalindrome("cbbd").equals("bb")) {
            System.out.println("longest palindrome on cbbc worked!!");
        } else {
            System.out.println(longestPalindrome("cbbd"));
            System.out.println("testing longest palindrome on 'cbbd' failed");
        }
        if (longestPalindrome("bananas").equals("anana")) {
            System.out.println("longest palindrome on anana worked!!");
        } else {
            System.out.println(longestPalindrome("bananas"));
            System.out.println("testing longest palindrome on 'anana' failed");
        }
        if (longestPalindrome("nn").equals("nn")) {
            System.out.println("longest palindrome on nn worked!!");
        } else {
            System.out.println(longestPalindrome("nn"));
            System.out.println("testing longest palindrome on 'nn' failed");
        }
        if (longestPalindrome("abcdnn").equals("nn")) {
            System.out.println("longest palindrome on abcdnn worked!!");
        } else {
            System.out.println(longestPalindrome("abcdnn"));
            System.out.println("testing longest palindrome on 'abcdnn' failed");
        }
        if (longestPalindrome("abcdnnabcd").equals("nn")) {
            System.out.println("longest palindrome on abcdnnabcd worked!!");
        } else {
            System.out.println(longestPalindrome("abcdnnabcd"));
            System.out.println("testing longest palindrome on 'abcdnnabcd' failed");
        }
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0)
            return "";
        if (s.length() == 1)
            return s;
        String answer = ""; int currl, currr;
        for (int i = 1; i < s.length(); i++) {
            currl = i - 1; currr = i + 1;
            if ((currl >= 0 && s.charAt(i) == s.charAt(currl))
                    && (currr >= s.length() || s.charAt(i) != s.charAt(currr)) ) {
                if (currr - currl + 1 > answer.length()) {
                    answer=s.substring(currl,i+1);
                }
                currl = currl - 1;
            } else if ((currl > 0 && s.charAt(i) != s.charAt(currl))
                    && (currr < s.length() && s.charAt(i) == s.charAt(currr))) {
                if (currr - currl + 1 > answer.length()) {
                    answer = s.substring(i, currr + 1);
                }
                currr = currr + 1;
            }
            while (currl >= 0 && currr < s.length()) {
                if (s.charAt(currl) != s.charAt(currr))
                    break;
                if (currr - currl + 1 > answer.length())
                    answer = s.substring(currl, currr+1);
                currl = currl - 1;
                currr = currr + 1;
            }
        }
        return answer;
    }
}
