public class ActiveState implements AccountState {
    @Override
    public void deposit(Account account, Double depositAmount) {
        account.setBalance(account.getBalance() + depositAmount);
        System.out.println("Deposit successful.");
        System.out.println(account.toString());
    }

    @Override
    public void withdraw(Account account, Double withdrawAmount) {
        account.setBalance(account.getBalance() - withdrawAmount);
        System.out.println("Withdrawal successful.");
        System.out.println(account.toString());
    }

    @Override
    public void activate(Account account) {
        System.out.println("Account is already activated!");
    }

    @Override
    public void suspend(Account account) {
        account.setState(new SuspendedState());
        System.out.println("Account is suspended!");
    }

    @Override
    public void close(Account account) {
        account.setState(new ClosedState());
        System.out.println("Account is closed!");
    }
}