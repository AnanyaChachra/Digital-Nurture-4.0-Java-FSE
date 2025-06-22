import java.util.Arrays;

public class ECommerceSearch {

    static class Product {
        int id;
        String name, category;

        Product(int id, String name, String category) {
            this.id = id;
            this.name = name;
            this.category = category;
        }

        public String toString() {
            return "[" + id + ", " + name + ", " + category + "]";
        }
    }

    static Product linearSearch(Product[] products, String name) {
        for (Product p : products)
            if (p.name.equalsIgnoreCase(name))
                return p;
        return null;
    }

    static Product binarySearch(Product[] products, String name) {
        Arrays.sort(products, (a, b) -> a.name.compareToIgnoreCase(b.name));
        int low = 0, high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = name.compareToIgnoreCase(products[mid].name);

            if (cmp == 0) return products[mid];
            else if (cmp < 0) high = mid - 1;
            else low = mid + 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shampoo", "Personal Care"),
            new Product(103, "Smartphone", "Electronics"),
            new Product(104, "Book", "Education"),
            new Product(105, "Shoes", "Fashion")
        };

        String searchName = "Smartphone";

        Product result1 = linearSearch(products, searchName);
        Product result2 = binarySearch(products, searchName);

        System.out.println("Linear: " + (result1 != null ? result1 : "Not found"));
        System.out.println("Binary: " + (result2 != null ? result2 : "Not found"));
    }
}
