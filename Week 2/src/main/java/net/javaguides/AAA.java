package net.javaguides;

public class AAA {
    private String customerName;
    private float balance;

    public AAA(String customerName,float balance){
        this.customerName=customerName;
        this.balance=balance;
    }
    public void deposit(float amount){
        if(amount>0){
          balance+=amount;
        }
    }
    public void withdraw(float amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
        }
    }
    public float getBalance(){
        return balance;
    }
    public String getcustomerName(){
        return customerName;
    }
}
