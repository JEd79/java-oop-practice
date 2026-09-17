public class Main {
    public static void main(String[] args){
        Customer customer1 = new Customer("Jason");
        Customer customer2 = new Customer("Eve");
        Customer customer3 = new Customer("Nicola");
        Customer premiumCustomer = new PremiumCustomer("Alice", 0.15);
        CustomerManager manager = new CustomerManager();

        manager.addCustomer(customer1);
        manager.addCustomer(premiumCustomer);

        System.out.println(customer1.getName());
        System.out.println(Customer.getCustomerCount());
        System.out.println(premiumCustomer.getName());
        System.out.println(premiumCustomer.getCustomerType());
        //System.out.println(premiumCustomer.getDiscountRate());

        System.out.println(manager.getCustomerCount());

        manager.printAllCustomers();

    }
}
