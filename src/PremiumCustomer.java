public class PremiumCustomer extends Customer implements Discountable{

    private double discountRate;

    public PremiumCustomer(String name, double discountRate){
        super(name);
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    @Override 
    public String getCustomerType() {
        return "Premium";
    }
}
