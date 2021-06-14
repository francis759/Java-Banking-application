import java.util.ArrayList;

public interface IBranch {
    String getName();

    ArrayList<Customer> getCustomers();

    boolean newCustomer(String customerName, Double transaction);
    boolean addCustomerTransaction(String customerName, Double transaction);
    Customer findCustomer(String customerName);
}
