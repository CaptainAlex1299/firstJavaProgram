public class BankAccount {
    String owner;
    double balance;

    public BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = balance;
    }

    public double deposit(double amount){
        balance += amount;
        return balance;
    }

    public double withdraw(double amount){
        balance -= amount;
        return balance;
    }

    public static void main(String[] args){
    BankAccount person1 = new BankAccount("John", 5000);
    person1.deposit(500);
    person1.withdraw(5000);
    System.out.println( person1.owner +  " " + person1.balance);
    }
}
