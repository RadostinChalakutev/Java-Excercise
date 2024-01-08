package Maps.Excercise;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class P02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String command=scanner.nextLine();
        LinkedHashMap<String, Integer> resoruces=new LinkedHashMap();


        while(!command.equals("stop")){
            int resource=Integer.parseInt(scanner.nextLine());
            if (!resoruces.containsKey(command)){
                resoruces.put(command,resource);
            }else{
                int newValue=resoruces.get(command);
                resoruces.put(command,newValue+resource);
            }

            command=scanner.nextLine();

        }
        for (Map.Entry<String, Integer> integerEntry : resoruces.entrySet()) {
            System.out.println(integerEntry.getKey()+" -> "+integerEntry.getValue());
        }

     }
}
