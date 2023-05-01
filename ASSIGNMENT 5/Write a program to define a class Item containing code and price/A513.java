
import java.util.Scanner;

class Item {
    String code;
    float price;

    Item(String code, float price) {
        this.code = code;
        this.price = price;
    }

    void display() {
        System.out.printf("%-10s %.2f%n", code, price);
    }

    static float getTotalPrice(Item[] items) {
        float total = 0;
        for (Item item : items) {
            total += item.price;
        }
        return total;
    }
}

class ItemList extends Item {
    ItemList(String code, float price) {
        super(code, price);
    }

    static void displayTable(Item[] items) {
        System.out.println("Code      Price");
        System.out.println("---------------");
        for (Item item : items) {
            item.display();
        }
        System.out.println("---------------");
        System.out.printf("Total:    %.2f%n", getTotalPrice(items));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item[] items = new Item[5];
        for (int i = 0; i < 5; i++) {
            System.out.printf("Enter code and price for item %d: ", i+1);
            String code = sc.next();
            float price = sc.nextFloat();
            items[i] = new ItemList(code, price);
        }
        displayTable(items);
    }
}
