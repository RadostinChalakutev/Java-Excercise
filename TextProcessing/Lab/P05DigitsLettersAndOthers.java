package TextProcessing.Lab;

import java.util.Scanner;

public class P05DigitsLettersAndOthers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        StringBuilder sbDigit=new StringBuilder();
        StringBuilder sbLetters=new StringBuilder();
        StringBuilder sbOthers=new StringBuilder();

        for (int i = 0; i <input.length() ; i++) {
            char currentChar=input.charAt(i);

            if (Character.isDigit(currentChar)){
                sbDigit.append(currentChar);
            }else if(Character.isLetter(currentChar)){
                sbLetters.append(currentChar);
            }else{
                sbOthers.append(currentChar);
            }
        }
        System.out.println(sbDigit);
        System.out.println(sbLetters);
        System.out.println(sbOthers);

    }
}
