package P04Methods;

import java.util.Scanner;

public class CalculateRectangleArea06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=Integer.parseInt(scanner.nextLine());
        int b=Integer.parseInt(scanner.nextLine());
        int area=getResult(a,b);

        System.out.println(area);
    }
    public static int getResult(int a, int b){
       return a*b;

    }
}
