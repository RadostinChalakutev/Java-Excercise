package ObjectAndClasses;


import java.util.Random;
import java.util.Scanner;

public class RandomizeWords01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        String input=scanner.nextLine();
        String[]words=input.split(" ");

        for (int i = 0; i < words.length ; i++) {
            int indexX= random.nextInt(words.length);
            int indexY=random.nextInt(words.length);
            String oldWordX=words[indexX];
            words[indexX]=words[indexY];
            words[indexY]=oldWordX;

        }
        System.out.println(String.join(System.lineSeparator(),words));
    }
}
