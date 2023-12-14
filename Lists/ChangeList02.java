package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer>numbers= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        String input=scanner.nextLine();

        while(!input.equals("end")){
            String command=input.split(" ")[0];
            switch (command){
                case "Delete":

                    int element=Integer.parseInt(input.split(" ")[1]);
                    numbers.removeAll(Arrays.asList(element));
                    break;
                case "Insert":
                    int number=Integer.parseInt(input.split(" ")[1]);
                    int position=Integer.parseInt(input.split(" ")[2]);
                    numbers.add(position,number);
                    break;

            }
            input=scanner.nextLine();
        }
        for (int i = 0; i <numbers.size() ; i++) {
            System.out.print(numbers.get(i)+" ");
        }
    }
}
