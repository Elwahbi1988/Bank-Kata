public class Main {
    public static void main(String[] args) {
        TransactionRepository transactionRepository = new InMemoryTransactionRepository();
        StatementPrinter statementPrinter = new ConsoleStatementPrinter();
        Account account = new Account(transactionRepository, statementPrinter);

        account.deposit(1000);
        account.deposit(2000);
        account.withdraw(500);

        account.printStatement();
    }
}