package P04Methods;

import java.util.Scanner;

public class SignOfIntegerNumbers01 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        printSigns(number);
    }
    public static void  printSigns(int input){
        if(input>0){
            System.out.printf("The number %d is positive.",input);
        }else if(input==0){
            System.out.println("The number 0 is zero.");
        }else{
            System.out.printf("The number %d is negative.",input);
        }
    }
}
