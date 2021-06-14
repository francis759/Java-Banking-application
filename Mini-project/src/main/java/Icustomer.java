import java.util.ArrayList;

public interface Icustomer {

    String getName();

    ArrayList <Double> getTransactions();

    void addTransaction(Double transaction);
}
