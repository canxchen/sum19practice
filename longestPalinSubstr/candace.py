class Solution:
    def longestPalindrome(self, s: str) -> str:
        if len(str) == 0:
            return ""
        if len(str) == 1:
            return str
        longestlen = 0
        longest = ""
        for idx, char in str:
            if (idx - 1 >= 0) and (idx + 1 < len(str)):
                # can cehck both sides
            if (idx - 1 >= 0):
                if (str[idx-1] == str[idx]) and (longestlen == 0):
                    return str[idx - 1 : idx + 1]
            if 