public class longestRepCharRepl {
    public int characterReplacement(String s, int k) {
        int answer = 0;
        if (s == null || k == 0) return 0;
        if (s.length() == 1) return 1;
        return charRep(s.substring(1), k, 1, s.charAt(0), 1);
    }

    public int charRep(String s, int k, int largest, char prevChar, int chain) {
        if (s.length() == 0) return largest;
        if (prevChar == s.charAt(0)) {
            largest = chain + 1 > largest ? chain + 1 : largest;
            if (s.length() > 1) {
                largest = Math.max(largest, charRep(s.substring(1), k, largest, prevChar, chain + 1));
            }
        } else {
            if (s.length() > 1) {
                largest = charRep(s.substring(1), k, largest, s.charAt(0), 1);
                if (k > 0) {
                    largest = Math.max(charRep(s.substring(1), k - 1, largest > chain+1 ? largest : chain + 1, prevChar, chain+1),
                            largest);
                }
            }
        }
        return largest;
    }
}
