public interface IBank {
    boolean addBranch(String branchName);
    boolean addCustomer(String branchName, String customerName, Double transaction);
    boolean addCustomerTransaction(String branchName, String customerName, Double transaction);
    Branch findBranch(String branchName);
    boolean listCustomers(String branchName, boolean printTransaction);
}
