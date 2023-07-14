# Design a Bank

Banks offer a wide variety of financial services, including checking and savings accounts, credit cards, and loans. Customers typically have to open an account with a bank prior to using any services. 
Customers can deposit or withdraw money, and even purchase investments.

## Requirements
Some possible questions to ask:
- What financial services will the bank offer?
- Will customers be required to have accounts? Will the bank manage them?
- Will the bank have physical locations and bank tellers?

### Services
- Customers can open accounts and deposit/withdraw money
- We are only concerned with transactions that take place within a physical location (i.e. through a bank teller)

### Tellers
- Tellers can perform transactions on behalf of customers
  - Every transaction is recorded and associated with the Teller and Customer

### Headquarters
- Each branch location will send money to a central location (i.e. the bank's headquarters) at the end of the day
  - We don't need to worry about the transporation details

## Design
- We will have a base `Transaction` class that will be inherited by `Deposit`, `Withdrawal`, and `OpenAccount` classes.
- A `BankTeller` will simply encapsulate the unique ID of the teller. We don't need a class for Customer's, since we can use the `BankAccount` class to encapsulate their `ID` and `Balance`.
- A headquarter `Bank` will be made up of multiple `BankBranch` objects, and a single `BankSystem` which will be the central store for customer accounts and transactions.
  - Note that a customer could transact with multiple branches, so we need to store their information in the `BankSystem`.
