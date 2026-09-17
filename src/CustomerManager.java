import java.util.ArrayList;

public class CustomerManager {
    private ArrayList<Customer> customers;
    
    public CustomerManager(){
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public int getCustomerCount() {
        return customers.size();
    }

    public void printAllCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer.getName());
        }
    }
}
