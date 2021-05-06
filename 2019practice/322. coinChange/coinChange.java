public class coinChange {
    public int coinChange(int[] coins, int amount) {
        if (coins == null || coins.length == 0 || amount <= 0) return 0;
        //i = coin_amount
        //dp[i] = min amount of coin exchanges for that value
        int[] dp = new int[amount + 1];
        //curr_min is the minimum number of coin exchanges without the current number included
        int curr_min = -1;
        for (int i = 1; i < dp.length; i++) {
            //if the current_number - current_coin is within range of the dp array
            //get the starting minimum value
            if (i - coins[0] >= 0)
                curr_min = dp[i - coins[0]];
            else {
                dp[i] = -1;
                continue;
            }
            for (int j = 1; j < coins.length; j++) {
                if (i - coins[j] >= 0) {
                    if (dp[i - coins[j]] != -1 && dp[i - coins[j]] < curr_min) {
                        curr_min = dp[i - coins[j]];
                    }
                } else if (i - coins[j] == 0) {
                    dp[i] = 1;
                } else {
                    dp[i] = dp[i]  == 1 ? 1 : -1;
                }
            }
            dp[i] = curr_min != -1 ? curr_min + 1 : -1;
        }
        return dp[amount];
    }
}
