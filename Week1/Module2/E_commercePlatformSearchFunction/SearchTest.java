package Week1.Module2.E_commercePlatformSearchFunction;

public class SearchTest {
    public static void main(String[] args) {

        Product[] products = {
                new Product(101,"Laptop","Electronics"),
                new Product(102,"Phone", "Electronics"),
                new Product(103,"Mouse", "Accessories"),
                new Product(104,"Keyboard","Accessories")};
        Product result =
                LinearSearch.search(products,103);

        if(result != null)
            System.out.println(result.productName);
        else
            System.out.println("Product not found");

        result =BinarySearch.search(products,103);

        if(result != null)
            System.out.println(result.productName);
        else
            System.out.println("Product not found");
    }
}