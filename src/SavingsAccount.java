/**
 * The SavingsAccount class represents a savings account with deposit, withdrawal, and balance.
 */
public class SavingsAccount {
    private double deposit;
    private double withdrawal;
    private double balance;

    /**
     * Constructs a SavingsAccount with the specified balance.
     *
     * @param balance the initial balance of the account
     */
    public SavingsAccount(double balance) {
        if (balance < 0) {
            System.out.println("Balance must be greater than $0!");
        } else {
            this.balance = balance;
        }
    }

    /**
     * Constructs a SavingsAccount with a zero balance.
     */
    public SavingsAccount() {}

    /**
     * Returns the current balance of the account.
     *
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Sets the balance of the account.
     *
     * @param balance the new balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Returns the deposit amount.
     *
     * @return the deposit amount
     */
    public double getDeposit() {
        return deposit;
    }

    /**
     * Sets the deposit amount and updates the balance.
     *
     * @param deposit the deposit amount
     */
    public void setDeposit(double deposit) {
        this.deposit = deposit;
        updateBalance();
    }

    /**
     * Returns the withdrawal amount.
     *
     * @return the withdrawal amount
     */
    public double getWithdrawal() {
        return withdrawal;
    }

    /**
     * Sets the withdrawal amount and updates the balance if funds are sufficient.
     *
     * @param withdrawal the withdrawal amount
     */
    public void setWithdrawal(double withdrawal) {
        if (withdrawal > this.balance) {
            System.out.println("Error! Insufficient funds.");
        } else {
            this.withdrawal = withdrawal;
            updateBalance();
        }
    }

    /**
     * Updates the balance based on deposit and withdrawal amounts.
     */
    private void updateBalance() {
        this.balance = this.balance + this.deposit - this.withdrawal;
        this.deposit = 0;
        this.withdrawal = 0;
    }
}
