
/**
 * Write a description of class DebitCard here.
 *
 * @author (22067683 Rashi Maharjan)
 * @version (1.0.0)
 */
public class DebitCard extends BankCard
{
    //attributes
    private int pinNumber;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;
    
    //constructor
    public DebitCard(double balanceAmount,int cardId,String bankAccount,String issuerBank,String clientName,int pinNumber){
        super(balanceAmount,cardId,bankAccount,issuerBank);   //attributes called from super class
        setClientName(clientName);                            // method called from super class
        this.pinNumber = pinNumber;
        this.hasWithdrawn = false;
    }
    
    //mutator
    public void setWithdrawalAmount(int withdrawalAmount){
    this.withdrawalAmount = withdrawalAmount;
    }
    
    //accessor methods
    public int getPinNumber() {
        return this.pinNumber;
    }

    public int getWithdrawalAmount() {
        return this.withdrawalAmount;
    }

    public String getDateOfWithdrawal() {
        return this.dateOfWithdrawal;
    }

    public boolean getHasWithdrawn() {
        return this.hasWithdrawn;
    }
    
    //withdraw method 
    public void withdraw(int withdrawalAmount, String dateOfWithdrawal,int pinNumber) {
        if(this.pinNumber == pinNumber && withdrawalAmount <= super.getBalanceAmount()) {
            super.setBalanceAmount(super.getBalanceAmount() - withdrawalAmount);
            this.withdrawalAmount = withdrawalAmount;
            this.dateOfWithdrawal = dateOfWithdrawal;
            this.hasWithdrawn = true;
            System.out.println("New Balance: " + super.getBalanceAmount());
        }
        else if(this.pinNumber != pinNumber) {
            System.out.println("The Entered PIN-Number is INVALID");
        }
        else {
            System.out.println("The Balance is Insufficient");
        }
    }

    //display method
    public void display() {
        super.display();
        System.out.println("PIN-Number: " + pinNumber);
        if(hasWithdrawn == true) {
            System.out.println("Withdrawal-Amount: " + withdrawalAmount);
            System.out.println("Date-Of-WithDrawal: " + dateOfWithdrawal);
        }
        else{
            System.out.println("No withdrawal has been done");
        }
    }
}
