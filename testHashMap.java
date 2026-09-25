import java.util.HashMap;

public class testHashMap {
    public static int getTotalPrice(HashMap<String, Integer> priceMap) {
        // コードを記載
        int total = 0;
        
        for (String key : priceMap.keySet()) {
	  int price = priceMap.get(key);
          total += price;
        }
        return total;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> priceMap = new HashMap<>();
        priceMap.put("りんご", 150);
        priceMap.put("みかん", 100);
        priceMap.put("ぶどう", 300);
        System.out.println(getTotalPrice(priceMap));
    }
}
