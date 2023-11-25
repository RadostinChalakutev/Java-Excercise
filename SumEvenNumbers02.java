import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers02 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);


        int[]numbers;
        numbers= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum=0;
        for (int i = 0; i < numbers.length ; i++) {
            int number=numbers[i];
            if (number%2==0){
                sum+=number;
            }

        }
        System.out.println(sum);

    }
}
