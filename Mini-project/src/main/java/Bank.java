import java.util.ArrayList;

public class Bank implements IBank{
    private String name;
    private ArrayList<Branch>branches;

    public Bank(String name) {
        this.name = name;
        branches=new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){
        Branch newBranch = new Branch(branchName);
        this.branches.add(newBranch);
        //Check if branch has been added
        for (Branch branch:branches) {
            if(branch.getName()==branchName){
                return true;
            }
        }

        return false;
    }

    public boolean addCustomer(String branchName, String customerName, Double transaction){
        Customer customer = new Customer(customerName, transaction);
        for (Branch branch:branches) {
            if (branch.getName()==branchName){
                branch.getCustomers().add(customer);
            }
        }
        //Check id customer has been added successfully
        for (Branch branch:this.branches) {
            if(branch.getName()==branchName){
                for (Customer c:branch.getCustomers()) {
                    if(c.getName()==customerName && c.getTransactions().contains(transaction)){
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, Double transaction){
        for (Branch branch:this.branches) {
            if(branch.getName()==branchName){
                for (Customer customer:branch.getCustomers()) {
                    if(customer.getName()==customerName){
                        customer.getTransactions().add(transaction);
                    }
                }
            }
        }
        //Performing check
        for (Branch branch:this.branches) {
            if(branch.getName()==branchName){
                for (Customer customer:branch.getCustomers()) {
                    if(customer.getName()==customerName && customer.getTransactions().contains(transaction)){
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public Branch findBranch(String branchName){
        for (Branch branch:this.branches){
            if (branch.getName()==branchName){
                return branch;
            }
        }

        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransaction){
        for (Branch branch:branches) {
            if(branch.getName()==branchName){
                for (Customer customer:branch.getCustomers()) {
                    System.out.println(String.format("Customer: %s",customer.getName()));
                    if(printTransaction){
                        for (Double transaction:customer.getTransactions()) {
                            System.out.println("Amount : "+transaction);
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }
}
