import java.util.List;

public interface TransactionRepository {
    void addTransaction(int amount, String type);
    List<Transaction> getAllTransactions();
}
