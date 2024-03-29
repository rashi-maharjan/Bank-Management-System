
/**
 * Write a description of class BankCard here.
 *
 * @author (22067683 Rashi Maharjan)
 * @version (1.0.0)
 */
public class BankCard
{
    //attributes
    private int cardId;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private double balanceAmount;
    
    //constructor
    public BankCard (double balanceAmount, int cardId, String bankAccount, String issuerBank)
    {
        //attribute = parameter
        this.balanceAmount = balanceAmount;
        this.cardId = cardId;
        this.bankAccount = bankAccount;
        this.issuerBank = issuerBank;
        this.clientName = "";              //empty string
    }
    
    //mutator
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
    
    public void setBalanceAmount(double balanceAmount) {
        this.balanceAmount = balanceAmount;
    }
    
    //accessor methods
    public int getCardId() {
        return this.cardId;
    }
    
    public String getClientName() {
        return this.clientName;
    }
    
    public String getIssuerBank() {
        return this.issuerBank;
    }
    
    public String getBankAccount() {
        return this.bankAccount;
    }
    
    public double getBalanceAmount() {
        return this.balanceAmount;
    }

    //display method : void cause it didn't return anything
    public void display() {
        System.out.println("Card ID: "+cardId);
        if(this.clientName == " "){
            System.out.println("Client name is not assigned");
        }
        else {
            System.out.println("Client Name: "+ clientName);
        }
        System.out.println("Issuer Bank: "+ issuerBank);
        System.out.println("Bank Account: "+ bankAccount);
        System.out.println("Balance Amount: "+ balanceAmount);
    }
}
