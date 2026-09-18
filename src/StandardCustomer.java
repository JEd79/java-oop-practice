public class StandardCustomer extends Customer {

    public StandardCustomer(String name) {
        super(name);
    }

    @Override 
    public String getCustomerType() {
        return "Standard";
    }
}
