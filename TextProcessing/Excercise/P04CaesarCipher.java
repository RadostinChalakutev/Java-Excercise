package TextProcessing.Excercise;

import java.util.Scanner;

public class P04CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text=scanner.nextLine();
        StringBuilder encryptedText=new StringBuilder();

        for (char symbol:text.toCharArray()) {
            char current=(char)(symbol+3);
            encryptedText.append(current);

        }
        System.out.println(encryptedText);


    }
}
