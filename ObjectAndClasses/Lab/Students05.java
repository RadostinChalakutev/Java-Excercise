package ObjectAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students05 {
    static class Students {
        String firstName;
        String secondName;
        String years;
        String town;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;

        }

        public String getSecondName() {
            return secondName;
        }

        public void setSecondName(String secondName) {
            this.secondName = secondName;

        }

        public String getYears() {
            return years;

        }

        public void setYears(String years) {
            this.years = years;
        }

        public String getTown() {
            return town;
        }

        public void setTown(String town) {
            this.town = town;

        }

    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String input=scanner.nextLine();
        List<Students> studentsList=new ArrayList<>();

        while(!input.equals("end")){

            String[]data=input.split(" ");

            String firstName=data[0];
            String secondName=data[1];
            String years=data[2];
            String town=data[3];

            Students student=new Students();
            student.setFirstName(firstName);
            student.setSecondName(secondName);
            student.setTown(town);
            student.setYears(years);
            studentsList.add(student);

            input=scanner.nextLine();
        }
        String filteredTown=scanner.nextLine();
        for (Students student:studentsList){
            if(student.getTown().equals(filteredTown)){
                System.out.printf("%s %s is %s years old%n",student.getFirstName(),student.getSecondName(),student.getYears());
            }
        }
    }
}
