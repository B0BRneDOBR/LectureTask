package Task4;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Внесено: " + amount + ". Поточний баланс: " + balance);
        } else {
            System.out.println("Сума повинна бути більшою за 0");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Знято: " + amount + ". Поточний баланс: " + balance);
            } else {
                System.out.println("Недостатньо коштів на рахунку!");
            }
        } else {
            System.out.println("Сума повинна бути більшою за 0");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Іван", 1000);

        account.deposit(500);
        account.withdraw(300);
        account.withdraw(1500);

        System.out.println("Фінальний баланс: " + account.getBalance());
    }
}
