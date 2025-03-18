package lowcoupling;

// Implementation of OrderService for in-store orders
public class inStoreOrder implements OrderService 
{
    @Override
    public void placeOrder(String item) 
    
    {
        System.out.println("Order placed at the physical store for: " + item);
    }
}
