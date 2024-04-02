class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
public class shoppingCart {
    public void addItem(String name, double price, int quantity, String type) {
        Item item = new Item(name, price);
        System.out.println(quantity + " " + type.toLowerCase() + " added to cart");
    }
    public void addItem(String name, double price, int quantity) {
        addItem(name, price, quantity, "Clothing");
    }

    public void addItem(String name, double price) {
        addItem(name, price, 1, "Groceries");
    }
    public void displayCart() {
        System.out.println("Items in the Cart:");

    }

    public static void main(String[] args) {
        shoppingCart cart = new shoppingCart();
        cart.addItem("Laptop", 999.99, 1, "Electronics");
        cart.addItem("T-shirt", 19.99, 2);
        cart.addItem("Apples", 1.99);
        cart.displayCart();
    }
}
