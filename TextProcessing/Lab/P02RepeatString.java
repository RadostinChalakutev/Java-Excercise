package TextProcessing.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P02RepeatString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        String[]words= scanner.nextLine().split(" ");
        StringBuilder result=new StringBuilder();

        for (String word:words){
            int count =word.length();
            for (int i = 0; i <n ; i++) {
                result.append(word);

            }
        }
       String endResult=result.toString();
        System.out.println(endResult);

    }
}
