import java.awt.*;
import java.util.*;
import java.util.List;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numberOfProducts=Integer.parseInt(scanner.nextLine());
        List<String>products=new ArrayList<>();
        String currentProduct;

        for (int i = 0; i <numberOfProducts ; i++) {
            currentProduct=scanner.nextLine();
            products.add(currentProduct);
        }
        Collections.sort(products);
        for (int i = 0; i <products.size() ; i++) {
            System.out.printf("%d.%s%n",i+1,products.get(i));
        }
    }
}
