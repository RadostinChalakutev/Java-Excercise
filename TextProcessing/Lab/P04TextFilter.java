package TextProcessing.Lab;

import java.util.Scanner;

public class P04TextFilter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] bannedText=scanner.nextLine().split(", ");
        String filteredText=scanner.nextLine();
        for (String bannedWord:bannedText){
            filteredText=filteredText.replace(bannedWord,repeatString(bannedWord.length()) );
        }
        System.out.println(filteredText);

    }
    public static String repeatString(int n){
        String result="";
        for (int i = 0; i <n ; i++) {
            result+="*";
        }
        return result;
    }
}
