public class Customer extends User{
    private int loyalPoints;
    private static int counterCustomer = 0;

    public Customer() {
        counterCustomer++;
    }
    public Customer(String username, String email, int loyalPoints) {
        super(username,email);
        this.loyalPoints = loyalPoints;
        counterCustomer++;
    }

    public int getLoyalPoints() {
        return loyalPoints;
    }
    public static int getCounterCustomer() {
        return counterCustomer;
    }

    @Override
    public void printInfo() {

        System.out.println("CUSTOMER INFO: ");
        System.out.println("Username : " + username);
        System.out.println("Email : " +email);
        System.out.println("Loyal Points : " + loyalPoints);
    }


}
