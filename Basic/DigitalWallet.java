class TheDigitalWallet{
    private String walletId;
    private double balance;
    private double maxTransferLimit;
    
    public TheDigitalWallet(String walletId){
        this.walletId = walletId;
        this.balance = 0.0;
        this.maxTransferLimit = 3500.00;
    }
    void deposit(double amount){
        if (amount <= 0){
            System.out.println("Enter a valid statement.");
        }
        else{
            this.balance += amount;
        }
    }
    
    double getBalance(){
        double value = this.balance;
        return value;
    }
    public void sendMoney(TheDigitalWallet reciever , double amount ){
        if(amount <= 0){
            System.out.println("Enter the valid amount!");
        }
        else if(amount >= getBalance() || amount >= this.maxTransferLimit){
            System.out.println("Enter amount under "+getBalance()+ " and Transfer Limit "+this.maxTransferLimit);
            
        }
        else{
            this.balance -= amount;
            reciever.deposit(amount);
            System.out.println("Successfully sent $"+amount);
        }
    }
}
public class DigitalWallet{
    public static void main(String[] args){
        TheDigitalWallet person1 = new TheDigitalWallet("1abcd234");
        TheDigitalWallet person2 = new TheDigitalWallet("1abcd2345");
        
        person1.deposit(5000.00);
        System.out.println("the balance is : "+person1.getBalance());
        person1.sendMoney(person2,3000.00);
        person1.sendMoney(person2,3000.00);
        System.out.println("balance is : " +person1.getBalance());
    }
}