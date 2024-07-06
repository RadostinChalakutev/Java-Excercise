package P03Arrays;

import java.util.Scanner;

public class ReverseArrayToString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[]reverseArr=scanner.nextLine().split(" ");

        for (int i = 0; i < reverseArr.length/2 ; i++) {
            String oldElement=reverseArr[i];
            reverseArr[i]=reverseArr[reverseArr.length-1-i];
            reverseArr[reverseArr.length-1-i]=oldElement;

        }
        for (int i = 0; i < reverseArr.length ; i++) {
            System.out.print(reverseArr[i]+" ");
        }

    }
}
