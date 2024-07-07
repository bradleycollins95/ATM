# Bank Account Management System

This project is a simple bank account management system written in Java. It provides functionality for users to log in, view balances, deposit money, and withdraw money from different types of accounts (Chequing, Savings, and Credit Card).

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Classes](#classes)
- [Usage](#usage)
- [Example](#example)
- [License](#license)

## Introduction
This project simulates a basic banking system where users can log in and perform various transactions on their accounts. The system supports three types of accounts: Chequing, Savings, and Credit Card.

## Features
- User authentication with username and password.
- Viewing account balances.
- Depositing money into accounts.
- Withdrawing money from accounts with checks to prevent negative balances.
- Credit card balance limits.

## Classes

### `User`
Represents a user with a username and password.
- `User(String username, String password)`: Constructs a User with specified username and password.
- `User()`: Constructs a User with default username and password.
- `String getUsername()`: Returns the username.
- `void setUsername(String username)`: Sets the username.
- `String getPassword()`: Returns the password.
- `void setPassword(String password)`: Sets the password.
- `boolean isLoginCorrect(String username, String password)`: Checks if the login credentials are correct.

### `ChequingAccount`
Represents a chequing account with deposit, withdrawal, and balance.
- `ChequingAccount(double balance)`: Constructs a ChequingAccount with specified balance.
- `ChequingAccount()`: Constructs a ChequingAccount with zero balance.
- `double getBalance()`: Returns the balance.
- `void setBalance(double balance)`: Sets the balance.
- `double getDeposit()`: Returns the deposit amount.
- `void setDeposit(double deposit)`: Sets the deposit amount and updates the balance.
- `double getWithdrawal()`: Returns the withdrawal amount.
- `void setWithdrawal(double withdrawal)`: Sets the withdrawal amount and updates the balance if funds are sufficient.

### `SavingsAccount`
Represents a savings account with deposit, withdrawal, and balance.
- `SavingsAccount(double balance)`: Constructs a SavingsAccount with specified balance.
- `SavingsAccount()`: Constructs a SavingsAccount with zero balance.
- `double getBalance()`: Returns the balance.
- `void setBalance(double balance)`: Sets the balance.
- `double getDeposit()`: Returns the deposit amount.
- `void setDeposit(double deposit)`: Sets the deposit amount and updates the balance.
- `double getWithdrawal()`: Returns the withdrawal amount.
- `void setWithdrawal(double withdrawal)`: Sets the withdrawal amount and updates the balance if funds are sufficient.

### `CreditCard`
Represents a credit card account with deposit, withdrawal, balance, and balance limit.
- `CreditCard(double balance)`: Constructs a CreditCard with specified balance.
- `CreditCard()`: Constructs a CreditCard with zero balance.
- `double getBalance()`: Returns the balance.
- `void setBalance(double balance)`: Sets the balance.
- `double getBalanceLimit()`: Returns the balance limit.
- `void setBalanceLimit(double balanceLimit)`: Sets the balance limit.
- `double getDeposit()`: Returns the deposit amount.
- `void setDeposit(double deposit)`: Sets the deposit amount and updates the balance.
- `double getWithdrawal()`: Returns the withdrawal amount.
- `void setWithdrawal(double withdrawal)`: Sets the withdrawal amount and updates the balance if funds are sufficient.

### `DateAndTime`
Provides a method to get the current timestamp.
- `String timeStamp()`: Returns the current timestamp in the format "yyyy-MM-dd HH:mm:ss".

### `Main`
The entry point of the application, providing a simple banking system interface.
- `main(String[] args)`: The main method to run the application.

- ## Usage
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/bank-account-management-system.git
   cd bank-account-management-system
2. Compile the Java files:
   ```bash
   javac *.java
3. Run the application
   java Main
4. Follow the on-screen instructions to log in and manage your accounts.
