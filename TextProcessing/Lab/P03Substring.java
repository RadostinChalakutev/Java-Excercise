package TextProcessing.Lab;

import java.util.Scanner;

public class P03Substring {
    public static void main(String[] args) {
        Scanner scanner =new Scanner (System.in);
        String searchable=scanner.nextLine();//това, което търсим
        String area=scanner.nextLine();//searching area
        int index=area.indexOf(searchable);
        while(index!=-1){
            area=area.replace(searchable,"");
            index=area.indexOf(searchable);

        }
        System.out.println(area);

    }
}
