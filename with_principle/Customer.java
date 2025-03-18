package lowcoupling;

// Customer class that depends on OrderService (Low Coupling)

public class Customer
 {
    private OrderService orderService;

    // Constructor-based dependency injection

    public Customer(OrderService orderService) 
    {
        this.orderService = orderService;
    }

    // Method to buy an item

    public void buyItem(String item) 
    {
        orderService.placeOrder(item);
    }
}
