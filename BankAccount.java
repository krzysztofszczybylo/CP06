
public class BankAccount
{
    private String id;
    private double balance;
    private String bankName;
    
    public BankAccount(String id, double balance, String bankName){
        this.id = id;
        this.balance = balance;
        this.bankName = bankName;
    }
    public void displayBalance(){
        System.out.println("Balance: " + this.balance + "PLN");
    }
    public double deposit(double amount){
        this.balance = balance + amount;
        return balance;
    }
    public void withdraw(double amount){
        
        if(balance < amount){
            System.out.println("Not enough money");
        }
        else if(amount > 500){
            System.out.println("You cannot withdraw more than 500PLN one time.");
        }
        else{
            this.balance = balance - amount;
        }
    }
    public static void main(String args[]){
        BankAccount ba1 = new BankAccount("33343364356635", 0, "PKO");
        ba1.deposit(500);
        ba1.displayBalance();
        ba1.deposit(200);
        ba1.displayBalance();
        ba1.withdraw(300);
        ba1.displayBalance();
    }
        
}
