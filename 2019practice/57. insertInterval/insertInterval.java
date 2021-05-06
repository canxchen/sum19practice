import java.util.*;
public class insertInterval {

    public static void main(String []args){
        int[][] in = {{1,3},{6,9}};
        int[] newInt = {2,5};
        int[][] ans = insert(in,newInt);

        for (int[] arr : ans) {
            System.out.println(arr[0] + " " + arr[1]);
        }
        System.out.println("Hello World");
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals == null || intervals.length == 0 || newInterval == null || newInterval.length == 0) return null;
        ArrayList<int[]> arrlist = new ArrayList<>();
        int i = 0;
        while (i < intervals.length && intervals[i][0] <= newInterval[0] ) {
            arrlist.add(intervals[i]);
            i++;
        }
        int first = i - 1;
        if (first == -1) {
            first = 0;
            arrlist.add(intervals[first]);
        }
        intervals[first][0] = Math.min(intervals[first][0], newInterval[0]);
        while (i < intervals.length && intervals[i][0] <= newInterval[1] ) {
            i++;
        }
        int last = i == 0 ? 0 : i-1;
        intervals[first][1] = Math.max(newInterval[1],intervals[last][1]);
        while (i < intervals.length) {
            arrlist.add(intervals[i]);
            i++;
        }
        //binary search approach
        /*
        int first = -1; int last = intervals.length;
        int left = 0; int right = intervals.length - 1; int mid = (left + right) / 2;
        while (left != right && left >= 0 && right < intervals.length) {
            if (intervals[mid][0] >= newInterval[0] && intervals[mid][1] <= newInterval[0]) {
                first = mid;
            } else if ( intervals[mid][1] < newInterval[0]) {
                //go right, go bigger: biggest_curr < smallest_newInterval
                left = mid;
                mid = (left + right) / 2;
            } else {
                //go left
                right = mid;
                mid = (left + right) / 2;
            }
        }

        //find last, should be the bigger number
        left = 0; right = intervals.length - 1; mid = (left + right) / 2;
        while (left != right && left >= 0 && right < intervals.length) {
            if (intervals[mid][0] >= newInterval[0] && intervals[mid][1] <= left) {
                last = mid;
            } else if (intervals[mid][1] < newInterval[1]) {
                //go right, go bigger: biggest_curr < biggest_newInterval
                left = mid;
                mid = (left + right) / 2;
            } else {
                //go left
                right = mid;
                mid = (left + right) / 2;
            }
        }*/

        //int[][] answer = new int[intervals.length][];
        return (int[][]) arrlist.toArray();
    }
}
