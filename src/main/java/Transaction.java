import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Transaction {
    private final String date;
    private final int amount;
    private final String type;

    public Transaction(int amount, String type) {
        this.date = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.amount = amount;
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public int getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }
}
