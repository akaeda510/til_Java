public class KnapsackTest {
	public static int knapsack(int[] costs, int[] calories, int budget) {
		// コードを記載

		// 購入できる予算
		int[] dpCal = new int[budget + 1];
		// お菓子の組み合わせ配列
		for (int cost = 1; cost <= budget; cost++) {
			for (int i = 0; i < costs.length; i++) {
				if (cost >= costs[i]) {
					dpCal[cost] = Math.max(dpCal[cost], dpCal[cost - costs[i]] + calories[i]);
				}
			}
		}
		return dpCal[budget];

		// 模範回答
		// int[] dp = new int[budget + 1];
		//
		// for (int cost = 0; cost <= budget; cost++) {
		// 	for (int i = 0; i < costs.length; i++) {
		// 		if (costs[i] > cost) {
		// 			continue;
		// 		}
		// 		int potentialCal = dp[cost - costs[i]] + calories[i];
		// 		if (potentialCal > dp[cost]) {
		// 			dp[cost] = potentialCal;
		// 		}
		// 	}
		// }
		// return dp[budget];
	}

	public static void main(String[] args) {
		int[] costs = {10, 30, 60, 70, 100};
		int[] calories = {10, 35, 75, 100, 120};
		System.out.println(knapsack(costs, calories, 100)); 
	}
}
