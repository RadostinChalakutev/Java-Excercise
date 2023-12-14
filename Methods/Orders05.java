package Methods;

import java.util.Scanner;

public class Orders05 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String product=scanner.nextLine();
        int quantity=Integer.parseInt(scanner.nextLine());
        SumValues(product,quantity);


    }
    public static void SumValues(String product,int values){

        double price=0.0;

        switch (product){
            case "coffee":
                price=1.50*values;
                break;
            case "water":
                price=1.00*values;
                break;
            case "coke":
                price=1.40*values;
                break;
            case "snack":
                price=2.00*values;
                break;
        }

        System.out.printf("%.2f",price);
    }
}
