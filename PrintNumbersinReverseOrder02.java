import java.util.Scanner;

public class PrintNumbersinReverseOrder02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());//броя на числата, които ще четем
        int[]numbers=new int[n];

        for (int i = 0; i <n ; i++) {
            int number=Integer.parseInt(scanner.nextLine());
            numbers[i]=number;
            
        }
        for (int i = numbers.length-1; i >=0; i--) {//принтираме масива от числа в обратен ред
            System.out.print(numbers[i]+" ");
            
        }


    }
}
