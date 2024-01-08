package Maps.Excercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String,String> validator=new LinkedHashMap<>();

        for (int i = 0; i <n ; i++) {
            String input=scanner.nextLine();
            String[]token=input.split(" ");
            String command=token[0];
            String key=token[1];


            if (command.equals("register")){
                String value=token[2];
                if (!validator.containsKey(key)){

                    validator.put(key,value);
                    System.out.printf("%s registered %s successfully%n",key,value);
                }else if (validator.containsValue(value)){
                    System.out.printf("ERROR: already registered with plate number %s%n",value);
                }
            }else {
                if (!validator.containsKey(key)){
                    System.out.printf("ERROR: user %s not found%n",key);
                }else{
                    validator.remove(key);
                System.out.printf("%s unregistered successfully%n",key);
                }

            }

        }
        for (Map.Entry<String, String> entry : validator.entrySet()) {
            System.out.println(entry.getKey()+" => "+entry.getValue());
        }


    }
}
