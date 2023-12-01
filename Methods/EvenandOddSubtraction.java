package Methods;

import java.util.Arrays;
    import java.util.Scanner;

    public class EvenandOddSubtraction {
        public static void main(String[] args) {
            Scanner scanner =new Scanner(System.in);
            int[] numbers=Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int oddSum=0;
            int evenSum=0;
            for (int i = 0; i < numbers.length ; i++) {
                int currentNumber=numbers[i];
                if (currentNumber%2==0){
                    evenSum+=currentNumber;

                }else{
                    oddSum+=currentNumber;
                }
            }
            System.out.println(evenSum-oddSum);
        }
    }
