import java.util.ArrayList;
import java.util.HashMap;

public class Knapsack {
	public static void main(String[] args) {
		ArrayList<HashMap<String, Object>> items = new ArrayList<>();

		HashMap<String, Object> item1 = new HashMap<>();
		item1.put("name", "うまか棒");
		item1.put("cost", 10);
		item1.put("cal", 10);
		items.add(item1);

		HashMap<String, Object> item2 = new HashMap<>();
		item2.put("name", "チョコボー");
		item2.put("cost", 30);
		item2.put("cal", 35);
		items.add(item2);

		HashMap<String, Object> item3 = new HashMap<>();
		item3.put("name", "らんてくんグミ");
		item3.put("cost", 60);
		item3.put("cal", 75);
		items.add(item3);

		HashMap<String, Object> item4 = new HashMap<>();
		item4.put("name", "シカクキャラメル");
		item4.put("cost", 70);
		item4.put("cal", 100);
		items.add(item4);

		HashMap<String, Object> item5 = new HashMap<>();
		item5.put("name", "カラインゴ");
		item5.put("cost", 100);
		item5.put("cal", 120);
		items.add(item5);

		int budget = 100;

		// カロリー用配列：最大枠を100(100の場合配列は0~99なので+1)の配列を作成
		int[] dpCal = new int[budget + 1];

		// お菓子の組み合わせ用配列
		ArrayList<ArrayList<String>> dpCombo = new ArrayList<>();
		for (int i = 0; i <= budget; i++) {
			dpCombo.add(new ArrayList<>());
		}

		// 値段ごとの最適なお菓子の組み合わせを計算
		for (int cost = 0; cost <= budget; cost++) {
			for (HashMap<String, Object> item : items) {
				if ((int) item.get("cost") > cost) {
					continue;
				}

				int prevCal = dpCal[cost - (int) item.get("cost")];
				ArrayList<String> prevList = dpCombo.get(cost - (int) item.get("cost"));

				int potentialCal = prevCal + (int) item.get("cal");
				if (potentialCal > dpCal[cost]) {
					dpCal[cost] = potentialCal;
					ArrayList<String> newCombo = new ArrayList<>(prevList);
					newCombo.add((String) item.get("name"));
					dpCombo.set(cost, newCombo);
				}
			}
		}

		int maxCal = dpCal[budget];
		ArrayList<String> combo = dpCombo.get(budget);
		System.out.println("予算" + budget + "円で得られる最大カロリーは" + maxCal + "kcal です");

		HashMap<String, Integer> counts = new HashMap<>();
		for (String name : combo) {
			counts.put(name, counts.getOrDefault(name, 0)+ 1);
		}

		System.out.println("購入すべきおやつの組み合わせ ");
		for (HashMap.Entry<String, Integer> entry : counts.entrySet()) {
			System.out.println(" " + entry.getKey() + " x " + entry.getValue());
		}
	}
}
