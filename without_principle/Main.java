package without_principle;

public class LowCouplingExample {
    public static void main(String[] args) {
        Customer customer = new Customer();

        // Ordering online (No flexibility to change order type)
        customer.buyItemOnline("Laptop");

        // Ordering in store (No flexibility to change order type)
        customer.buyItemInStore("Smartphone");
    }
}