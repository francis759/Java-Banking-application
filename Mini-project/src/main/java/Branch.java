import java.util.ArrayList;

public class Branch implements IBranch {
    private String name;
    private ArrayList<Customer>customers;

    public Branch(String name) {
        this.name = name;
        this.customers=new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, Double transaction){
        Customer customer = new Customer(name,transaction);
        this.customers.add(customer);
        //Check if new customer has been added
        return customers.contains(customer);
    }

    public boolean addCustomerTransaction(String customerName, Double transaction){
        for (Customer customer:customers) {
            if(customer.getName()==customerName){
                customer.getTransactions().add(transaction);
            }
        }
        //check if transaction has been added
        for (Customer c:customers) {
            if(c.getName() == customerName){
                for (Double t:c.getTransactions()) {
                    if(t==transaction){
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public Customer findCustomer(String customerName){
        for (Customer customer:customers) {
            if(customer.getName()==customerName){
                return customer;
            }
        }

        return null;
    }


}
