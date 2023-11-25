import java.util.Arrays;
import java.util.Scanner;

public class CondenseArraytoNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] numberArr= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[]condensedArr=new int[numberArr.length-1];


        for (int i = 0; i <numberArr.length ; i++) {
            if(numberArr.length==1){
                break;
            }
            if(i==numberArr.length-1){
                int[]condensedNew=new int[condensedArr.length-1];
                i=-1;
                numberArr=condensedArr;
                condensedArr=condensedNew;
            }else{
                condensedArr[i]=numberArr[i]+numberArr[i+1];

            }
        }
        System.out.println(numberArr[0]);
    }
}
