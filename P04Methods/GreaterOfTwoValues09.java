package P04Methods;

import java.util.Scanner;

public class GreaterOfTwoValues09 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String typeOfData=scanner.nextLine();
        switch (typeOfData){
            case "int":
                int firstInt=Integer.parseInt(scanner.nextLine());
                int secondInt=Integer.parseInt(scanner.nextLine());
                System.out.println(getMaxInteger(firstInt,secondInt));
                break;
            case "char":
                char firstChar=scanner.nextLine().charAt(0);
                char secondChar=scanner.nextLine().charAt(0);
                System.out.println(getMaxChar(firstChar,secondChar));
                break;
            case "string":
                String firstString =scanner.nextLine();
                String secondString=scanner.nextLine();
                System.out.println(getMaxString(firstString,secondString));
                break;
        }

    }
    public static int getMaxInteger(int first,int second){
        if(first>second){
            return first;
        }else {
            return second;
        }
    }
    public static char getMaxChar(char first,char second){
        if (first > second) {
            return first;
        }else {
            return second;
        }
    }
    public static  String getMaxString(String first,String second){
        if(first.compareTo(second)>0){
            return first;
        }else {
            return second;
        }
    }
}
