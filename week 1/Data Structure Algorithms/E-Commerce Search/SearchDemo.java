import java.util.Arrays;
import java.util.Comparator;

public class SearchDemo {

    // Linear Search
    public static Product linearSearch(Product[] products, int id) {

        for (Product product : products) {

            if (product.getProductId() == id) {
                return product;
            }
        }

        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, int id) {

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            Product middleProduct = products[mid];

            if (middleProduct.getProductId() == id) {
                return middleProduct;
            }

            else if (middleProduct.getProductId() < id) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product p1 = new Product(105, "Keyboard", "Electronics");
        Product p2 = new Product(101, "Laptop", "Electronics");
        Product p3 = new Product(104, "Chair", "Furniture");
        Product p4 = new Product(103, "Mouse", "Electronics");
        Product p5 = new Product(102, "Table", "Furniture");

        Product[] products = {p1, p2, p3, p4, p5};

        System.out.println("Original Product List");

        for (Product product : products) {
            System.out.println(product);
        }

        System.out.println("\nLinear Search");

        Product result = linearSearch(products, 103);

        if (result != null) {
            System.out.println("Product Found");
            System.out.println(result);
        } else {
            System.out.println("Product Not Found");
        }

        // Sort array before Binary Search
        Arrays.sort(products, Comparator.comparingInt(Product::getProductId));

        System.out.println("\nSorted Product List");

        for (Product product : products) {
            System.out.println(product);
        }

        System.out.println("\nBinary Search");

        Product result2 = binarySearch(products, 103);

        if (result2 != null) {
            System.out.println("Product Found");
            System.out.println(result2);
        } else {
            System.out.println("Product Not Found");
        }
    }
}