/**
 * The CreditCard class represents a credit card account with deposit, withdrawal, balance, and balance limit.
 */
public class CreditCard {
    private double deposit;
    private double withdrawal;
    private double balance;
    private double balanceLimit = 3000;

    /**
     * Constructs a CreditCard with the specified balance.
     *
     * @param balance the initial balance of the credit card
     */
    public CreditCard(double balance) {
        if (balance < 0) {
            System.out.println("Balance must be greater than $0!");
        } else {
            this.balance = balance;
        }
    }

    /**
     * Constructs a CreditCard with a zero balance.
     */
    public CreditCard() {
    }

    /**
     * Returns the current balance of the credit card.
     *
     * @return the current balance
     */
    public double getBalance() {
        if (balance > balanceLimit) {
            System.out.println("You've exceeded your balance limit!");
        }
        return balance;
    }

    /**
     * Sets the balance of the credit card.
     *
     * @param balance the new balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Returns the balance limit of the credit card.
     *
     * @return the balance limit
     */
    public double getBalanceLimit() {
        return balanceLimit;
    }

    /**
     * Sets the balance limit of the credit card.
     *
     * @param balanceLimit the new balance limit
     */
    public void setBalanceLimit(double balanceLimit) {
        this.balanceLimit = balanceLimit;
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
        }
    }
}




