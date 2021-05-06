import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class validParentheses {
    public boolean isValid(String s) {
        if (s==null || s.length()==0)return true;
        Stack<Character> stack = new Stack<>();
        Set<Character> set = new HashSet<>(); set.add('(');set.add('{');set.add('[');
        char curr; char popped;
        for (int i = 0; i < s.length(); i++) {
            curr = s.charAt(i);
            if (set.contains(curr))
                stack.push(curr);
            else {
                if (stack.size()==0) return false;
                popped = stack.pop();
                if (!(curr==')'&&popped=='(')&&!(curr=='}'&&popped=='{')&&!(curr==']'&&popped=='['))
                    return false;
            }
        }
        return stack.size()==0;
    }
}
