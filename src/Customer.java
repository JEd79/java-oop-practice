public abstract class Customer {
    private String name;
    private int customerId;
    private static int customerCount = 0;

    public Customer(String name) {
        this.name = name;
        customerCount++;
    }

    public String getName() {
        return name;
    }

    public abstract String getCustomerType();

    public static int getCustomerCount(){
        return customerCount;
    }

}

