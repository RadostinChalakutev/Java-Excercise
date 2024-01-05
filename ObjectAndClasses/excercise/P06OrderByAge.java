package ObjectAndClasses.excercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P06OrderByAge {
    public static class Person{
        String name;
        String ID;
        int age;
        public Person(String name, String ID, int age){
            this.name=name;
            this.ID=ID;
            this.age=age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getID() {
            return ID;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setID(String ID) {
            this.ID = ID;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        List<Person>personInformation=new ArrayList<>();

        while(!input.equals("End")){
            String[]token=input.split(" ");
            String name=token[0];
            String ID=token[1];
            int age=Integer.parseInt(token[2]);
            Person person=new Person(name,ID,age);
            personInformation.add(person);

            input=scanner.nextLine();
        }
            personInformation.sort(Comparator.comparing(Person::getAge));
        for (Person person:personInformation){
            System.out.printf("%s with ID: %S is %d years old.%n",person.getName(),person.getID(),person.getAge());
        }
    }
}
