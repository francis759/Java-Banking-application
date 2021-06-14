import java.util.ArrayList;

public class Customer implements Icustomer {
    private String name;
    private ArrayList<Double>transactions;

    public Customer(String name, Double transaction) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        this.transactions.add(transaction);
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Double> getTransactions() {
        return this.transactions;
    }

    public void addTransaction(Double transaction){
        this.transactions.add(transaction);
    }
}

