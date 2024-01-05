package Maps.Lab;

import java.util.*;

public class P03OddOccurrence {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String[]newWord= scanner.nextLine().split(" ");
        LinkedHashMap<String,Integer>counts=new LinkedHashMap<>();

        for (String word:newWord){
            String wordToLowerCase=word.toLowerCase();
            if (counts.containsKey(wordToLowerCase)){
                counts.put(wordToLowerCase,counts.get(wordToLowerCase)+1);
                }else{
                counts.put(wordToLowerCase,1);
            }
        }
        ArrayList<String>odds=new ArrayList<>();
        for(var entry:counts.entrySet()){
            if (entry.getValue()%2==1){
                odds.add(entry.getKey());
            }
        }
        for (int i = 0; i < odds.size() ; i++) {
            System.out.print(odds.get(i));
            if ((i< odds.size()-1)){
                System.out.print(", ");
            }
        }
    }
}
