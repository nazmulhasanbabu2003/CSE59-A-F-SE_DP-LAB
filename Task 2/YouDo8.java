class Item{
    String name;
    double price;

    Item (String name,double price){
        this.name = name;
        this.price = price;
    }
}

class Order{
    Item item1;
    Item item2;

    Order (Item item1, Item item2){
        this.item1 = item1;
        this.item2 = item2;
    }

    void printBill(){
        double total = item1.price + item2.price;
        System.out.println(("Total bill: $" + total));
    }
}

public class Main8 {
    public static void main(String[] args) {
        // Create items
        Item mouse = new Item("Mouse", 20.0);
        Item keyboard = new Item("Keyboard", 45.0);

        // Create order
        Order myOrder = new Order(mouse, keyboard);

        // Print total bill
        myOrder.printBill();
    }
}
