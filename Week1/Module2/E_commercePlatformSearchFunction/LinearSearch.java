package Week1.Module2.E_commercePlatformSearchFunction;

public class LinearSearch {
    public static Product search(Product[] products, int targetId) {
        int comparisons = 1;
        for(int i = 0; i < products.length; i++) {
            System.out.println("Linear Search found after "+ comparisons +" comparisons");
            if(products[i].productId == targetId) {
                return products[i];
            }comparisons++;
        }
        return null;
    }
}