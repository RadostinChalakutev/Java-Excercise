package Methods;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        printTriangle(n);
        printSecondTriangle(n);


    }
    public static void printLine(int start,int end){
        for (int i = start; i <=end ; i++) {
            System.out.print(i+" ");

        }
        System.out.println();
        
    }
    public static void printTriangle(int number){
        for (int i = 0; i <=number ; i++) {
            printLine(1,i);
        }
    }
    public static void printSecondTriangle(int number){
        for (int i = number-1; i >=1 ; i--) {
            printLine(1,i);
        }
    }
}
