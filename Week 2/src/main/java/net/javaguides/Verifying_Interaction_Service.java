package net.javaguides;

public class Verifying_Interaction_Service {
    private Verifying_Interactions verify;

    public Verifying_Interaction_Service(Verifying_Interactions verify){
        this.verify=verify;
    }
    public void sendmoney(double amount){
        verify.transfermoney(amount);
    }
}
