package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower08 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double number=Double.parseDouble(scanner.nextLine());
        double power=Double.parseDouble(scanner.nextLine());
        double result=getResult(number,power);
        System.out.println(new DecimalFormat("0.####").format(result));



    }
    public static double getResult(double number,double power){
        double result=1;
        for (int i = 0; i <power ; i++) {
            result=result*number;
        }
        return result;
    }
}
