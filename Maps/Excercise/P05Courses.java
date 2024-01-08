package Maps.Excercise;

import java.util.*;

public class P05Courses {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String command=scanner.nextLine();
        LinkedHashMap<String, List<String>>data=new LinkedHashMap<>();
        while(!command.equals("end")){
            String key=command.split(" : ")[0];
            String value=command.split(" : ")[1];
            if(!data.containsKey(key)){
                data.put(key,new ArrayList<>());
            }
            data.get(key).add(value);

            command=scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : data.entrySet()) {
            System.out.println(entry.getKey()+": "+entry.getValue().size());
            entry.getValue().forEach(key-> System.out.println("-- "+key));
        }

    }
}
