public class climbingStairs {
    public int climbStairs(int n) {
        if (n<=0)return 0;
        else if (n==1) return 1;
        else if (n==2) return 2;
        int total = 0;
        int one = 1;
        int two = 2;
        //4: 3 + 2
        for (int i = 3 ; i <= n; i++) {
            total = one + two;
            two = one;
            one = total;
        }
        //inefficient dp way
        /*int[] dp = new int[n + 1];
        dp[0] = 0; dp[1] = 1; dp[2] = 2;
        for (int i = 3; i < n + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }*/

        return total;

        /*
        * alternatively:
        * allways = 0
        * one_before = 1;
        * two_before = 2;
        *
        * for loop [3 -> end of list] allways + one before + two before; reset one and two before
        *
        * why?? bc: for any random number you pick, you can - 1 to the number before and -2 from 2 numbers before
        *
        * this is the branching that you picked up on: from one node, you can reach backwards to two numbers
        * (in this case, the branching downwards is going backwards)*/
        // wrong recursive solution
        //if (n <= 0) return 0;
        //return 1 + climbStairs(n-1) + climbStairs(n - 2);
    }
}