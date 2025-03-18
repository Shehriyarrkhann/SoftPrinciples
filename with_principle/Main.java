package lowcoupling;

// Import necessary classes
public class Main 
{
    public static void main(String[] args) 
    {
        // Using OnlineOrder

        OrderService onlineOrder = new OnlineOrder();
        Customer customer1 = new Customer(onlineOrder);
        customer1.buyItem("Laptop");

        // Using InStoreOrder

        OrderService inStoreOrder = new inStoreOrder();
        Customer customer2 = new Customer(inStoreOrder);
        customer2.buyItem("Smartphone");
    }
}
