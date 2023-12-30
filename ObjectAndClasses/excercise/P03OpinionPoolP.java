package ObjectAndClasses.excercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class P03OpinionPoolP {

    public static class Pool{
        String name;
        String age;
        public Pool(String name,String age){
            this.name=name;
            this.age=age;
        }

        public String getName() {
            return name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Pool> names = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String name = input.split(" ")[0];
            int age = Integer.parseInt(input.split(" ")[1]);
            Pool pool = new Pool(name, String.valueOf(age));

            if (age > 30) {
                names.add(pool);
            }
        }
        for (Pool pool:names){
            System.out.println(pool.getName()+" - "+pool.getAge());
        }
    }
}
