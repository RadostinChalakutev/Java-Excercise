package Methods;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        double grade=Double.parseDouble(scanner.nextLine());
        scanTheGrade(grade);

    }
    public static void scanTheGrade(double grade){

        if(grade<3){
            System.out.println("Fail");
        }else if(grade>=3.00&&grade<=3.49){
            System.out.println("Poor");
        }else if(grade>=3.50&&grade<=4.49){
            System.out.println("Good");
        }else if(grade>=4.50&&grade<=5.49){
            System.out.println("Very good");
        }else {
            System.out.println("Excellent");
        }
    }
}
