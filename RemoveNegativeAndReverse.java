import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativeAndReverse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numbers= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        for (int i = 0; i <numbers.size() ; i++) {
            int currentNumber=numbers.get(i);

            if(currentNumber<0){
                numbers.remove(i);
            }

        }
        Collections.reverse(numbers);

        for (int i = 0; i <numbers.size() ; i++) {
            System.out.printf("%d ",numbers.get(i));
        }
    }
}
