package Maps.Excercise;

import java.util.*;

public class P01CountCharInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();
        Map<Character, Integer> count = new LinkedHashMap<>();
        for (char symbol : words.toCharArray()) {
            if (symbol == ' ') {
                continue;
            }
            if (count.containsKey(symbol)) {
                int currentCount = count.get(symbol);
                count.put(symbol, currentCount + 1);

            } else {
                count.put(symbol, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


    }
}
