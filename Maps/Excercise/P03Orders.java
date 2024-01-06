package Maps.Excercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Double> products = new LinkedHashMap<>();
        String product = scanner.nextLine();
        while (!product.equals("buy")) {
            String[] token = product.split(" ");
            String name = token[0];
            double price = Double.parseDouble(token[1]);
            double quantity = Double.parseDouble(token[2]);
            double total = price * quantity;
            products.put(name, total);

        product=scanner.nextLine();
        }
        for (Map.Entry<String,Double>entry: products.entrySet()){
            System.out.printf("%s -> %.2f",entry.getKey(),entry.getValue());
        }
    }
}
