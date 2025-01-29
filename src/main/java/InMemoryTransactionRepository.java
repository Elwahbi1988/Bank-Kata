import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InMemoryTransactionRepository implements TransactionRepository {
    private final List<Transaction> transactions = new ArrayList<>();

    @Override
    public void addTransaction(int amount, String type) {
        transactions.add(new Transaction(amount, type));
    }

    @Override
    public List<Transaction> getAllTransactions() {
        return Collections.unmodifiableList(transactions);
    }
}

