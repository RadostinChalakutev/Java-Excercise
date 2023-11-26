import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasic {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numbers= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input=scanner.nextLine();//Add(команда) 3(число)
        while(!input.equals("end")){
            String[]token=input.split(" ");
            String command=token[0];
            if(command.contains("Add")){
                int numberToAdd=Integer.parseInt(token[1]);
                numbers.add(numberToAdd);
            } else if (command.contains("RemoveAt")) {
                int numberIndexRemoving=Integer.parseInt(token[1]);
                numbers.remove(numberIndexRemoving);
            }else if(command.contains("Remove")){
                int removedNumber=Integer.parseInt(token[1]);
                numbers.remove(Integer.valueOf(removedNumber));
            }else if(command.contains("Insert")){
                int numberToInsert=Integer.parseInt(token[1]);
                int indexToInsert=Integer.parseInt(token[2]);
                numbers.add(indexToInsert,numberToInsert);
            }
            input=scanner.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]",""));

    }
}
