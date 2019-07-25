import java.util.*;

public class courseSchedule {
    HashMap<Integer,Integer> seen = new HashMap<>();
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean ans = true;
        for (int i = 0; i < prerequisites.length; i++) {
            seen.put(prerequisites[i][0],prerequisites[i][1]);
            for (int j = i+1; j < prerequisites.length; j++) {
                if ( ( seen.get(prerequisites[j][0]) != null && seen.get(prerequisites[j][0]) == prerequisites[j][1] )
                        || ( seen.get(prerequisites[j][1]) != null && seen.get(prerequisites[j][1]) == prerequisites[j][0] ) ) {
                    return false;
                }
            }
            //for every node, check to see if it goes back to itself
        }
        return ans;
    }
}
