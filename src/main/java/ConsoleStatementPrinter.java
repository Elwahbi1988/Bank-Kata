import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConsoleStatementPrinter implements StatementPrinter {
    @Override
    public void print(List<Transaction> transactions) {
        System.out.println("Date       | Crédit  | Débit  | Solde");
        int balance = 0;

        List<Transaction> sortedTransactions = new ArrayList<>(transactions);
        Collections.reverse(sortedTransactions); // Trier par ordre inverse

        for (Transaction t : sortedTransactions) {
            if (t.getType().equals("CREDIT")) {
                balance += t.getAmount();
                System.out.printf("%s | %d    |        | %d%n", t.getDate(), t.getAmount(), balance);
            } else {
                balance -= t.getAmount();
                System.out.printf("%s |        | %d    | %d%n", t.getDate(), t.getAmount(), balance);
            }
        }
    }
}

