public class Main{
    private String accountNumber;  // Encapsulated attribute
    private String accountHolder;  // Encapsulated attribute
    private double balance;        // Encapsulated attribute

    // Constructor
    public Main(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter method for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Setter method for account holder
    public void setAccountHolder(String newHolder) {
        accountHolder = newHolder;
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }

    // toString method to provide a string representation of the account
    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Account Holder: " + accountHolder + ", Balance: $" + balance;
    }

    public static void main(String[] args) {
        Main account = new Main("12345", "Saif", 100000.0);
        System.out.println(account);

        account.deposit(5000.0);
        System.out.println("After deposit: " + account);

        account.withdraw(2000.0);
        System.out.println("After withdrawal: " + account);

        account.setAccountHolder("Khan");
        System.out.println("After account holder change: " + account);
    }
}
