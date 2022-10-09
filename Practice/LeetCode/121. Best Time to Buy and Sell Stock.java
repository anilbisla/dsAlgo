class Solution {
    public int maxProfit(int[] prices) {
		int minSoFar = Integer.MAX_VALUE;
		int maxProfit = 0;

		for (int i = 0; i < prices.length; i++) {
			minSoFar = Math.min(minSoFar, prices[i]);
			int currProfit = prices[i] - minSoFar;

			maxProfit = Math.max(maxProfit, currProfit);
		}
		return maxProfit;
	}
}