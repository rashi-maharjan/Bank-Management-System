
/**
 * Write a description of class CreditCard here.
 *
 * @author (22067683 Rashi Maharjan)
 * @version (1.0.0)
 */
public class CreditCard extends BankCard
{
   //attributes
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;
    
   //constructor
   public CreditCard(double balanceAmount,int cardId,String bankAccount,String issuerBank,String clientName,int cvcNumber,double interestRate,String expirationDate) {
    super(balanceAmount,cardId,bankAccount,issuerBank);
    setClientName(clientName);
    this.cvcNumber = cvcNumber;
    this.interestRate = interestRate;
    this.expirationDate = expirationDate;
    this.isGranted = false;
   }
   
   //credit limit setter method 
   public void setCreditLimit(double creditLimit,int gracePeriod) {
    if(creditLimit <= 2.5 * super.getBalanceAmount()){
        this.creditLimit = creditLimit;
        this.gracePeriod = gracePeriod;
        this.isGranted = true;
    }else{
        System.out.println("Credit cannot be issued.");
    }
   }
   
   //accessor method
   public int getCvcNumber() {
        return this.cvcNumber;
   }
   public double getCreditLimit() {
       return this.creditLimit;
   }
   public double getInterestRate() {
        return this.interestRate;
   }
   public String getExpirationDate() {
        return this.expirationDate;
   }
   public int getGracePeriod() {
        return this.gracePeriod;
   }
   public boolean getIsGranted() {
        return this.isGranted;
   }

   //cancel card credit method
   public void cancelCreditCard() {
    if (isGranted == true){
        cvcNumber = 0;
        creditLimit = 0;
        gracePeriod = 0;
        isGranted = false;
    }
    else{
        System.out.println("No credit card to cancel.");
    }
   }

   //display method
   public void display(){
    super.display();
    if(isGranted == true) {
        System.out.println("CVC Number: " + cvcNumber);
        System.out.println("Credit Limit: " + creditLimit);
        System.out.println("Interest Rate: " + interestRate );
        System.out.println("Expiration Date: " + expirationDate);
        System.out.println("Grace Period: " + gracePeriod);
    }
    else{
        System.out.println("No credit has been granted yet.");
    }
   }
}
