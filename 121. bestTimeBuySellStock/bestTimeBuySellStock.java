public class bestTimeBuySellStock {
    public int maxProfit(int[] prices) {
        //THIS ONE WORKS: fidn the contiguous min and max value
        int min = Integer.MAX_VALUE, max = 0;
        for (int price: prices) {
            min = Math.min(min, price); //which is smaller, current min or current price
            max = Math.max(price - min, max); //which is bigger, current value - current min or prexisting max
        }
        return max;
        
        /*int answer = 0; int maxProf = 0;
        if (prices == null || prices.length == 0)
            return answer;
        if (prices.length == 1)
            return 1;
        for (int i = 0; i < prices.length; i++) {
            //for each day, generate all combos and see if profit is > maxProf
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] - prices[i] > maxProf) {
                    maxProf = prices[j] - prices[i];
                    answer = j + 1;
                }
            }
        }
        return answer;*/
    }

    public int maxProfitDP(int[] prices) {
        int answer = 0;
        if (prices == null || prices.length == 0)
            return answer;
        if (prices.length == 1)
            return 1;
        //max profit will always be the max number - the min number
        //in the array, assuming that max follows min
        //so as you go along, pick up the max and min numbers
        //that are contiguous
        int min = prices[0]; int max = prices[1]; int maxProf = max-min;
        int currprice;
        for (int i = 2; i < prices.length; i++) {
            currprice = prices[i] - min;
            min = min < prices[i] ? min : prices[i];
            if (maxProf < currprice) {
                maxProf = currprice;
                answer =i+1;
            }
        }

        return answer;
    }
}
