    package P04Methods;

    import java.util.Scanner;

    public class RepeatString07 {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            String input=scanner.nextLine();
            int times=Integer.parseInt(scanner.nextLine());
            getString(input,times);

        }
        public static void getString(String text,int n){
           StringBuilder result=new StringBuilder();
            for (int i = 0; i <n ; i++) {
                result.append(text);

            }
            System.out.println(result);

        }
    }
