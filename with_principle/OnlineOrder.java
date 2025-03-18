package lowcoupling;

// Implementation of OrderService for online orders
public class OnlineOrder implements  OrderService
 {
   
    public void placeOrder(String item)
     {
        System.out.println("Order placed online for: " + item);
    }
}
