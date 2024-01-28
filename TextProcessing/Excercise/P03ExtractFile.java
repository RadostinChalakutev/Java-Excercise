package TextProcessing.Excercise;

import java.util.Scanner;

public class P03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[]filePath=scanner.nextLine().split("\\\\");
        String extension=filePath[3];
        String[] nameArr=extension.split("\\.");
        String name=nameArr[0];
        String extensionName=nameArr[1];
        System.out.println("File name: "+name);
        System.out.println("File extension: "+extensionName);
    }
}
