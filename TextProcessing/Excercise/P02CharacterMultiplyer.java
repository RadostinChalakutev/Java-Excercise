package TextProcessing.Excercise;

import java.util.Scanner;

public class P02CharacterMultiplyer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] argumentArr = scanner.nextLine().split(" ");
        String firstArgument = argumentArr[0];
        String secondArgument = argumentArr[1];
        int minLength = Math.min(firstArgument.length(), secondArgument.length());
        int maxLength = Math.max(firstArgument.length(), secondArgument.length());
        int sum = 0;


        for (int i = 0; i < minLength; i++) {
            sum += firstArgument.charAt(i) * secondArgument.charAt(i);

        }
        if (minLength == maxLength) {
            System.out.println(sum);
            return;
        }
        sum=string1(firstArgument,secondArgument,maxLength,minLength,sum);
        System.out.println(sum);


    }

    public static int string1(String first, String second, int maxLength, int minLength, int sum) {
            if (maxLength==first.length()){
                for (int i = minLength; i <first.length() ; i++) {
                    sum+=first.charAt(i);
                }
            }else {
                for (int i = minLength; i <second.length() ; i++) {
                    sum+=second.charAt(i);
                }
            }
            return sum;
    }
}

