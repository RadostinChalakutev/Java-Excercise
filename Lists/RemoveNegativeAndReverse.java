package Lists;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativeAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        int currentNumber;
        numbers.removeIf(n -> n < 0);
        Collections.reverse(numbers);


        if (numbers.isEmpty()) {
            System.out.println("empty");
        } else {
            for (int i = 0; i < numbers.size(); i++) {
                System.out.printf("%d ", numbers.get(i));
            }

        }
    }
}

