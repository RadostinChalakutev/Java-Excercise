package ObjectAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial03 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        BigInteger resultBigNum=new BigInteger(String.valueOf(1));
        for (int i = 1; i <=number ; i++) {
            resultBigNum=resultBigNum.multiply(BigInteger.valueOf(i));

        }
        System.out.println(resultBigNum);


    }
   
    
}
