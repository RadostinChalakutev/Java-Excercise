package TextProcessing.Excercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01ValidUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*    • Has a length of between 3 and 16 characters.
    • It contains only letters, numbers, hyphens, and underscores.

         */
        String input = scanner.nextLine();
        String[]inputArr=input.split(", ");


        for(String currentUsername:inputArr) {
            if (isValid(currentUsername)) {
                System.out.println(currentUsername);
            }
        }
    }

    public static boolean isValid(String currentUsername) {
        if (currentUsername.length() <3 || currentUsername.length() > 16) {
            return false;
        }
        for (char symbol : currentUsername.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                return false;
            }
        }
        return true;
    }
}