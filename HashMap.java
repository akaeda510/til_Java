import java.util.ArrayList;
import java.util.HashMap;

public class HashMap {
    public static void main(String[] args) {
        ArrayList<HashMap<String, Object>> products = new ArrayList<>();

        // 商品1
        HashMap<String, Object> product1 = new HashMap<>();
        product1.put("name", "ノート");
        product1.put("price", 200);
        product1.put("quantity", 3);
        products.add(product1);

        // 商品2
        HashMap<String, Object> product2 = new HashMap<>();
        product2.put("name", "ペン");
        product2.put("price", 150);
        product2.put("quantity", 5);
        products.add(product2);

        // 商品3
        HashMap<String, Object> product3 = new HashMap<>();
        product3.put("name", "消しゴム");
        product3.put("price", 100);
        product3.put("quantity", 2);
        products.add(product3);

        // 全商品を表示
        for (HashMap<String, Object> product : products) {
            System.out.println(product.get("name") + " "
                + product.get("price") + "円 × "
                + product.get("quantity") + "個");
        }
    }
}

