import java.util.*;
public class zigZagConversion {
    public String convert(String s, int numRows) {
        String ans = "";
        if (s == null || s.length() == 0 || numRows == 0)
            return ans;
        ArrayList<String> arrlist = new ArrayList<>(); int count = 0; boolean up = true;
        for (int i = 0; i < numRows; i++) {
            arrlist.add("");
        }
        for (int i = 0; i < s.length(); i++) {
            //arrlist.add( arrlist.get(count).concat(Character.toString));
            arrlist.set(count,arrlist.get(count)+(s.charAt(i)));
            if (up) {
                count++;
                if (count == 3) {
                    up = false;
                }
            } else {
                count--;
                if (count == 0) {
                    up = true;
                }
            }
        }
        for (int i = 0; i < numRows; i++) {
            ans = ans.concat(arrlist.get(i));
        }
        return ans;
    }
}
