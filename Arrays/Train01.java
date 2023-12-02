package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> vagons= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        int maxCapacity=Integer.parseInt(scanner.nextLine());
        String input=scanner.nextLine();
        int currentNumber;

        while(!input.equals("end")){
            String command=input.split(" ")[0];//Add

            if(command.equals("Add")){
                int number=Integer.parseInt(input.split(" ")[1]);//some number
                vagons.add(number);
            }else{
                int number=Integer.parseInt(command);
                for (int i = 0; i <vagons.size() ; i++) {
                    currentNumber=vagons.get(i);

                    if (currentNumber+number<=maxCapacity){
                        vagons.set(i,currentNumber+number);
                        break;
                    }

                }
            }
            input=scanner.nextLine();
        }
        for (int i = 0; i <vagons.size() ; i++) {
            System.out.print(vagons.get(i)+" ");
        }

    }
}
