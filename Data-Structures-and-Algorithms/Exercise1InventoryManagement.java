import java.util.HashMap;

class Product {
    int id;
    String name;
    int quantity;
    double price;

    Product(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    void display() {
        System.out.println(id + " " + name + " " + quantity + " " + price);
    }
}

public class Exercise1InventoryManagement {

    public static void main(String[] args) {

        HashMap<Integer, Product> inventory = new HashMap<>();

        inventory.put(1, new Product(1, "Laptop", 10, 50000));
        inventory.put(2, new Product(2, "Mouse", 20, 500));

        inventory.put(2, new Product(2, "Mouse", 30, 600));

        inventory.remove(1);

        for(Product p : inventory.values()) {
            p.display();
        }
    }
}
