/**
 * Write a description of class BankGUI here.
 *
 * @author (22067683 Rashi Maharjan)
 * @version (1.0.0)
 */
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.Color;

public class BankGUI implements ActionListener
{
    //declare all the components here
    private JFrame frame;
    private ArrayList<BankCard> cards;
    
    private JLabel TitleText, DebitText, CreditText;
    
    //.........................................declare debit card components.........................................
    private JTextField D_CardIdText, D_ClientNameText, D_IssuerBankText, D_BankAccountText, D_BalanceAmountText;
    private JTextField D_PinNumberText, D_CardIDText,  D_WithdrawalAmountText, D_PinNumberrText;
    
    private JLabel D_CardIdLabel, D_ClientNameLabel, D_IssuerBankLabel, D_BankAccountLabel, D_BalanceAmountLabel;
    private JLabel D_PinNumberLabel, D_CardIDLabel, D_WithdrawalAmountLabel,  D_WithdrawalDateLabel,  D_PinNumberrLabel;
    
    private JButton D_DisplayButton, D_AddButton, D_DisplayyButton, D_WithdrawButton;
    private JComboBox day, month, year;
    
    
    //.........................................declare credit card components.........................................
    private JTextField C_CardIdText, C_ClientNameText, C_IssuerBankText, C_BankAccountText, C_BalanceAmountText;
    private JTextField C_CVCNumberText, C_InterestRateText, C_CardIDText, C_CreditLimitText, C_GracePeriodText, C_CarDIDText;
    
    private JLabel C_CardIdLabel, C_ClientNameLabel, C_IssuerBankLabel, C_BankAccountLabel, C_ExpirationDateLabel, C_BalanceAmountLabel;
    private JLabel C_CVCNumberLabel, C_InterestRateLabel, C_CardIDLabel, C_CreditLimitLabel, C_GracePeriodLabel, C_CarDIDLabel;
    
    private JButton C_DisplayButton, C_AddButton, C_DisplayyButton, C_SetButton, C_DisplayyyButton, C_CancelButton;
    private JComboBox dayy, monthh, yearr;
    
    
    private JButton ClearButton;
    
    public BankGUI(){
        cards = new ArrayList();   
        
        //create the code to  write the GUI
        //create frame
        frame = new JFrame("Nabil Bank");           
        frame.setSize(1280,720);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(true);
        
        //create components
        TitleText = new JLabel("Banking System");
        
        //Debit Card componenets
        //.........................................add to debit card.........................................
        DebitText = new JLabel("Debit Card");        
        
        D_CardIdText = new JTextField();
        D_CardIdLabel = new JLabel("Card Id:");
        
        D_ClientNameText = new JTextField();
        D_ClientNameLabel = new JLabel("Client Name:");
        
        D_IssuerBankText = new JTextField();
        D_IssuerBankLabel = new JLabel("Issuer Bank:");
        
        D_BankAccountText = new JTextField();
        D_BankAccountLabel = new JLabel("Bank Account:");
        
        D_BalanceAmountText = new JTextField();
        D_BalanceAmountLabel = new JLabel("Balance Amount:");
        
        D_PinNumberText = new JTextField();
        D_PinNumberLabel = new JLabel("Pin Number:");
        
        D_DisplayButton = new JButton("Display");
        D_DisplayButton.setBackground(new Color(212,227,252));
        D_DisplayButton.setOpaque(true);
        D_DisplayButton.setBorderPainted(true);
        D_DisplayButton.addActionListener(this);
        
        D_AddButton = new JButton("Add to Debit Card");
        D_AddButton.setBackground(new Color(254,250,192));
        D_AddButton.setOpaque(true);
        D_AddButton.setBorderPainted(true);
        D_AddButton.addActionListener(this);      
        

        //.........................................withdraw.........................................
        D_CardIDText = new JTextField();
        D_CardIDLabel = new JLabel("Card Id:");
        
        D_WithdrawalAmountText = new JTextField();
        D_WithdrawalAmountLabel = new JLabel("Withdrawal Amount:");
        
        D_WithdrawalDateLabel = new JLabel("Withdrawal Date:");
        
        String [] days = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14",
        "15","16","17","18","19","20","21","23","24","25","26","27","28","29","30","31"};
        day = new JComboBox(days);
        
        String [] months = {"January","February","March","April", "May","June","July","August", "September", "October", 
        "November","December"};
        month = new JComboBox(months);
        
        String [] years = {"2011","2012","2013","2014","2015","2016","2017","2018","2019","2020",
        "2021","2022","2023","2024","2025","2026","2027","2028","2029","2030"};
        year = new JComboBox(years);
        
        D_PinNumberrText = new JTextField();
        D_PinNumberrLabel = new JLabel("Pin Number:");
        
        D_DisplayyButton = new JButton("Display");
        D_DisplayyButton.setBackground(new Color(212,227,252));
        D_DisplayyButton.setOpaque(true);
        D_DisplayyButton.setBorderPainted(true);
        D_DisplayyButton.addActionListener(this);
        
        D_WithdrawButton = new JButton("Withdraw");
        D_WithdrawButton.setBackground(new Color(254,250,192));
        D_WithdrawButton.setOpaque(true);
        D_WithdrawButton.setBorderPainted(true);
        D_WithdrawButton.addActionListener(this); 
        
        
        //Credit Card componenets
        //.........................................add to credit card.........................................
        CreditText = new JLabel("Credit Card");
        
        C_CardIdText = new JTextField();
        C_CardIdLabel = new JLabel("Card Id:");
        
        C_ClientNameText = new JTextField();
        C_ClientNameLabel = new JLabel("Client Name:");
        
        C_IssuerBankText = new JTextField();
        C_IssuerBankLabel = new JLabel("Issuer Bank:");
        
        C_BankAccountText = new JTextField();
        C_BankAccountLabel = new JLabel("Bank Account:");
        
        C_ExpirationDateLabel = new JLabel("Expiration Date:");
        
        String [] dayss = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14",
        "15","16","17","18","19","20","21","23","24","25","26","27","28","29","30","31"};
        dayy = new JComboBox(dayss);
        
        String [] monthss = {"January","February","March","April", "May","June","July","August", "September",           "October", 
        "November","December"};
        monthh = new JComboBox(monthss);
        
        String [] yearss = {"2011","2012","2013","2014","2015","2016","2017","2018","2019","2020",
        "2021","2022","2023","2024","2025","2026","2027","2028","2029","2030"};
        yearr = new JComboBox(yearss);
        
        C_BalanceAmountText = new JTextField();
        C_BalanceAmountLabel = new JLabel("Balance Amount:");
        
        C_CVCNumberText = new JTextField();
        C_CVCNumberLabel = new JLabel("CVC Number:");
        
        C_InterestRateText = new JTextField();
        C_InterestRateLabel = new JLabel("Interest Rate:");
        
        C_DisplayButton = new JButton("Display");
        C_DisplayButton.setBackground(new Color(212,227,252));
        C_DisplayButton.setOpaque(true);
        C_DisplayButton.setBorderPainted(true);
        C_DisplayButton.addActionListener(this); 
        
        C_AddButton = new JButton("Add to Credit Card");
        C_AddButton.setBackground(new Color(254,250,192));
        C_AddButton.setOpaque(true);
        C_AddButton.setBorderPainted(true);
        C_AddButton.addActionListener(this); 
        
        
        //.........................................Set the credit limit.........................................
        C_CardIDText = new JTextField();
        C_CardIDLabel = new JLabel("Card Id:");
        
        C_CreditLimitText = new JTextField();
        C_CreditLimitLabel = new JLabel("Credit Limit:");
        
        C_GracePeriodText = new JTextField();
        C_GracePeriodLabel = new JLabel("Grace Period:");
        
        C_DisplayyButton = new JButton("Display");
        C_DisplayyButton.setBackground(new Color(212,227,252));
        C_DisplayyButton.setOpaque(true);
        C_DisplayyButton.setBorderPainted(true);
        C_DisplayyButton.addActionListener(this); 
        
        C_SetButton = new JButton("Set Credit Limit");
        C_SetButton.setBackground(new Color(254,250,192));
        C_SetButton.setOpaque(true);
        C_SetButton.setBorderPainted(true);
        C_SetButton.addActionListener(this); 
        
        
        //.........................................Cancel Credit Card.........................................
        C_CarDIDText = new JTextField();
        C_CarDIDLabel = new JLabel("Card Id:");
        
        C_DisplayyyButton = new JButton("Display");
        C_DisplayyyButton.setBackground(new Color(212,227,252));
        C_DisplayyyButton.setOpaque(true);
        C_DisplayyyButton.setBorderPainted(true);
        C_DisplayyyButton.addActionListener(this); 
        
        C_CancelButton = new JButton("Cancel Credit Card");
        C_CancelButton.setBackground(new Color(254,250,192));
        C_CancelButton.setOpaque(true);
        C_CancelButton.setBorderPainted(true);
        C_CancelButton.addActionListener(this); 
        
        ClearButton = new JButton("Clear");
        ClearButton.setBackground(new Color(255,138,132));
       // ClearButton.setOpaque(true);
        ClearButton.setBorderPainted(true);
        ClearButton.addActionListener(this);
        
        //set position
        TitleText.setBounds(589, 10, 109, 20);
        //.........................................Debit Card positions.........................................
        DebitText.setBounds(298, 55, 71, 20);
        
        D_CardIdLabel.setBounds(18, 104, 50, 18);
        D_CardIdText.setBounds(150, 100, 142, 26);
        
        D_ClientNameLabel.setBounds(18, 139, 81, 18);
        D_ClientNameText.setBounds(150, 135, 142, 26);      
        
        D_IssuerBankLabel.setBounds(18, 174, 78, 18);
        D_IssuerBankText.setBounds(150, 170, 142, 26);
        
        D_BankAccountLabel.setBounds(18, 209, 90, 18);
        D_BankAccountText.setBounds(150, 205, 142, 26);
        
        D_BalanceAmountLabel.setBounds(336, 104, 106, 18);
        D_BalanceAmountText.setBounds(468, 100, 142, 26);
        
        D_PinNumberLabel.setBounds(336, 139, 78, 18);
        D_PinNumberText.setBounds(468, 135, 142, 26);
        
        D_DisplayButton.setBounds(319, 290, 142, 26);
        D_AddButton.setBounds(468, 290, 142, 26);
        
        
        
        D_CardIDLabel.setBounds(18, 351, 50, 18);
        D_CardIDText.setBounds(150, 347, 142, 26);
        
        D_WithdrawalAmountLabel.setBounds(18, 386, 125, 18);
        D_WithdrawalAmountText.setBounds(150, 382, 142, 26);    
        
        D_WithdrawalDateLabel.setBounds(18, 423, 107, 18);
        day.setBounds(150, 417, 40, 32);
        month.setBounds(200, 417, 90, 32);
        year.setBounds(300, 417, 60, 32);
        
        D_PinNumberrLabel.setBounds(18, 460, 78, 18);
        D_PinNumberrText.setBounds(150, 457, 142, 26);
        
        D_DisplayyButton.setBounds(319, 497, 142, 26);
        D_WithdrawButton.setBounds(468, 497, 142, 26);
        
        
        
        //.........................................Credit Card positions.........................................
        CreditText.setBounds(936, 55, 71, 20);
        
        C_CardIdLabel.setBounds(658, 104, 50, 18);
        C_CardIdText.setBounds(790, 100, 142, 26);
        
        C_ClientNameLabel.setBounds(658, 139, 81, 18);
        C_ClientNameText.setBounds(790, 135, 142, 26);      
        
        C_IssuerBankLabel.setBounds(658, 174, 78, 18);
        C_IssuerBankText.setBounds(790, 170, 142, 26);
        
        C_BankAccountLabel.setBounds(658, 209, 87, 18);
        C_BankAccountText.setBounds(790, 205, 142, 26);
        
        C_ExpirationDateLabel.setBounds(658, 247, 100, 18);
        dayy.setBounds(789, 240, 40, 32);
        monthh.setBounds(839, 240, 90, 32);
        yearr.setBounds(939, 240, 60, 32);
        
        C_BalanceAmountLabel.setBounds(976, 104, 106, 18);
        C_BalanceAmountText.setBounds(1108, 100, 142, 26);
        
        C_CVCNumberLabel.setBounds(976, 139, 87, 18);
        C_CVCNumberText.setBounds(1108, 135, 142, 26);
        
        C_InterestRateLabel.setBounds(976, 174, 84, 18);
        C_InterestRateText.setBounds(1108, 170, 142, 26);
        
        C_DisplayButton.setBounds(959, 290, 142, 26);
        C_AddButton.setBounds(1108, 290, 142, 26);
        
        
        
        C_CardIDLabel.setBounds(658, 351, 50, 18);
        C_CardIDText.setBounds(790, 347, 142, 26);
        
        C_CreditLimitLabel.setBounds(658, 386, 75, 18);
        C_CreditLimitText.setBounds(790, 382, 142, 26);
        
        C_GracePeriodLabel.setBounds(658, 421, 86, 18);
        C_GracePeriodText.setBounds(790, 417, 142, 26);
        
        C_DisplayyButton.setBounds(959, 497, 142, 26);
        C_SetButton.setBounds(1108, 497, 142, 26);
        
        
        
        C_CarDIDLabel.setBounds(658, 558, 50, 18);
        C_CarDIDText.setBounds(790, 554, 142, 26);
        
        C_DisplayyyButton.setBounds(959, 592, 142, 26);
        C_CancelButton.setBounds(1108, 592, 143, 26);
        
        ClearButton.setBounds(586, 615, 142, 26);
        
        
        
        //add componenet 
        frame.add(TitleText);
        
        //.........................................add componenets of Debit Card......................................... 
        frame.add(DebitText);
        
        frame.add(D_CardIdText);
        frame.add(D_CardIdLabel);
        
        frame.add(D_ClientNameLabel);
        frame.add(D_ClientNameText);
        
        frame.add(D_IssuerBankLabel);
        frame.add(D_IssuerBankText);
        
        frame.add(D_BankAccountLabel);
        frame.add(D_BankAccountText);
        
        frame.add(D_BalanceAmountLabel);
        frame.add(D_BalanceAmountText);
        
        frame.add(D_PinNumberText);
        frame.add(D_PinNumberLabel);
        
        frame.add(D_DisplayButton);
        frame.add(D_AddButton);
        
        
        
        frame.add(D_CardIDText);
        frame.add(D_CardIDLabel);
        
        frame.add(D_WithdrawalAmountLabel);
        frame.add(D_WithdrawalAmountText);
        
        frame.add(D_WithdrawalDateLabel);
        frame.add(day);
        frame.add(month);
        frame.add(year);
        
        frame.add(D_PinNumberrText);
        frame.add(D_PinNumberrLabel);
        
        frame.add(D_DisplayyButton);
        frame.add(D_WithdrawButton);
        
        
        
        //.........................................add componenets of Credit Card.........................................
        frame.add(CreditText);
        
        frame.add(C_CardIdText);
        frame.add(C_CardIdLabel);
        
        frame.add(C_ClientNameLabel);
        frame.add(C_ClientNameText);
        
        frame.add(C_IssuerBankLabel);
        frame.add(C_IssuerBankText);
        
        frame.add(C_BankAccountLabel);
        frame.add(C_BankAccountText);
        
        frame.add(C_ExpirationDateLabel);
        frame.add(dayy);
        frame.add(monthh);
        frame.add(yearr);
        
        frame.add(C_BalanceAmountLabel);
        frame.add(C_BalanceAmountText);
        
        frame.add(C_CVCNumberLabel);
        frame.add(C_CVCNumberText);
        
        frame.add(C_InterestRateLabel);
        frame.add(C_InterestRateText);
        
        frame.add(C_DisplayButton);
        frame.add(C_AddButton);
        
        
        
        frame.add(C_CardIDText);
        frame.add(C_CardIDLabel);
        
        frame.add(C_CreditLimitLabel);
        frame.add(C_CreditLimitText);
        
        frame.add(C_GracePeriodLabel);
        frame.add(C_GracePeriodText);
        
        frame.add(C_DisplayyButton);
        frame.add(C_SetButton);
        
        
        
        frame.add(C_CarDIDText);
        frame.add(C_CarDIDLabel);
        
        frame.add(C_DisplayyyButton);
        frame.add(C_CancelButton);
        
        frame.add(ClearButton);
    }
    
    //implement the method of the ActionListener
    public void actionPerformed(ActionEvent e){ 
        //logic of the button functionality 
        //.........................................ADD Debit.........................................        
        if (e.getSource() == D_AddButton){
            if(D_CardIdText.getText().isEmpty() || D_ClientNameText.getText().isEmpty() || D_IssuerBankText.getText().isEmpty() ||
               D_BankAccountText.getText().isEmpty() || D_BalanceAmountText.getText().isEmpty() || D_PinNumberText.getText().isEmpty()){
                    JOptionPane.showMessageDialog(frame, "The fields are empty !!!");
            }
            else{
                try{
                    String clientName = D_ClientNameText.getText();
                    String issuerBank = D_IssuerBankText.getText();
                    String bankAccount = D_BankAccountText.getText();
            
                    int cardId = Integer.parseInt(D_CardIdText.getText());
                    int balanceAmount = Integer.parseInt(D_BalanceAmountText.getText());
                    int pinNumber = Integer.parseInt(D_PinNumberText.getText());
            
                    boolean Existence_of_Card = false;
                    for(BankCard DebitCard : cards){
                        if(DebitCard instanceof DebitCard){
                            DebitCard DebitCard_Object = (DebitCard) DebitCard;
                            if(DebitCard_Object.getCardId() == (cardId))      //Comparing card's id from ArrayList
                            {
                                Existence_of_Card = true;
                            }
                        }
                    } 
                    if(Existence_of_Card == false){
                        DebitCard DebitCard_Object= new DebitCard(balanceAmount, cardId, bankAccount, issuerBank, clientName, pinNumber);   //should be in the order of DebitCard constructor
                        cards.add(DebitCard_Object);
                        JOptionPane.showMessageDialog(frame, "Your Debit Card has been added successfully!!!");
                    }else{
                        JOptionPane.showMessageDialog(frame, "Debit Card already exists!!!");
                    } 
                }
                catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(frame,"Please provide required information only!!!");
                }
            } 
        }
        
        
        
        //.........................................Display for ADD Debit.........................................
        if(e.getSource() == D_DisplayButton){
            if(D_CardIdText.getText().isEmpty() || D_ClientNameText.getText().isEmpty() || D_IssuerBankText.getText().isEmpty() ||
               D_BankAccountText.getText().isEmpty() || D_BalanceAmountText.getText().isEmpty() || D_PinNumberText.getText().isEmpty()){
                   JOptionPane.showMessageDialog(frame, "The fields are empty !!");
            }
            else{
                try{
                    String clientName = D_ClientNameText.getText();
                    String issuerBank = D_IssuerBankText.getText();
                    String bankAccount = D_BankAccountText.getText();
            
                    int cardId = Integer.parseInt(D_CardIdText.getText());
                    int balanceAmount = Integer.parseInt(D_BalanceAmountText.getText());
                    int pinNumber = Integer.parseInt(D_PinNumberText.getText());
                    
                    for(BankCard Display_DebitCard : cards){
                        if(Display_DebitCard instanceof DebitCard){
                            DebitCard DebitCard_Object = (DebitCard) Display_DebitCard;
                            DebitCard_Object.display();
                            JOptionPane.showMessageDialog(frame, "Debit Card information are displayed. Please check the display tab!!!");
                        }
                    }
                }
                catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(frame,"Please provide required information only!!!");
                }
            }
        }
        
        
        
        //.........................................Withdraw Button.........................................
        if (e.getSource() == D_WithdrawButton){
            if(D_CardIDText.getText().isEmpty() || D_WithdrawalAmountText.getText().isEmpty() || D_WithdrawalDateLabel.getText().isEmpty() ||
               D_PinNumberrText.getText().isEmpty()){
                    JOptionPane.showMessageDialog(frame, "The fields are empty !!");
            }
            else{
                try{
                    String dateOfWithdrawal = D_WithdrawalDateLabel.getText();

                    int cardID = Integer.parseInt(D_CardIDText.getText());
                    int pinNumbeR = Integer.parseInt(D_PinNumberrText.getText());
                    int withdrawalAmount = Integer.parseInt(D_WithdrawalAmountText.getText());
        
                    for(BankCard Withdraw_DebitCard : cards){
                        if(Withdraw_DebitCard instanceof DebitCard){
                            DebitCard DebitCard_Object= (DebitCard) Withdraw_DebitCard;
                            if(DebitCard_Object.getCardId() == (cardID)){
                                DebitCard_Object.withdraw(withdrawalAmount, dateOfWithdrawal, pinNumbeR);
                                JOptionPane.showMessageDialog(frame,"Your Debit Card has been withdrawn successfully!!!");
                            }else{
                                JOptionPane.showMessageDialog(frame,"Debit Card doesn't exist");
                            }
                        }
                    }
                }
                catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(frame, "Please provide required information only!!!");
                }
            }
        }
        
        
        
        
        //.........................................Display for Withdraw Debit.........................................
        if(e.getSource() == D_DisplayyButton){
            if(D_CardIdText.getText().isEmpty() || D_ClientNameText.getText().isEmpty() || D_IssuerBankText.getText().isEmpty() ||
               D_BankAccountText.getText().isEmpty() || D_BalanceAmountText.getText().isEmpty() || D_PinNumberText.getText().isEmpty() ||
               D_CardIDText.getText().isEmpty() || D_WithdrawalAmountText.getText().isEmpty() || D_WithdrawalDateLabel.getText().isEmpty() ||
               D_PinNumberrText.getText().isEmpty()){
                   JOptionPane.showMessageDialog(frame, "The fields are empty !!");
            }
            else{
                try{
                    String clientName = D_ClientNameText.getText();
                    String issuerBank = D_IssuerBankText.getText();
                    String bankAccount = D_BankAccountText.getText();
                    String dateOfWithdrawal = D_WithdrawalDateLabel.getText();
            
                    int cardId = Integer.parseInt(D_CardIdText.getText());
                    int balanceAmount = Integer.parseInt(D_BalanceAmountText.getText());
                    int pinNumber = Integer.parseInt(D_PinNumberText.getText());
                    int cardID = Integer.parseInt(D_CardIDText.getText());
                    int pinNumbeR = Integer.parseInt(D_PinNumberrText.getText());
                    int withdrawalAmount = Integer.parseInt(D_WithdrawalAmountText.getText());
                    
                    for(BankCard Displayy_DebitCard : cards){
                        if(Displayy_DebitCard instanceof DebitCard){
                            DebitCard DebitCard_Object= (DebitCard) Displayy_DebitCard;
                            DebitCard_Object.display();
                            JOptionPane.showMessageDialog(frame, "All Debit Card informations are displayed. Please check the display tab!!!");
                        }
                    }
                }
                catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(frame,"Please provide required informations only!!!");
                }
            }
        }
        
        
        
        //.........................................ADD Credit.........................................
        if (e.getSource() == C_AddButton){
            if(C_CardIdText.getText().isEmpty() || C_ClientNameText.getText().isEmpty() || C_IssuerBankText.getText().isEmpty() ||
               C_BankAccountText.getText().isEmpty() || C_BalanceAmountText.getText().isEmpty() || C_CVCNumberText.getText().isEmpty() || 
               C_InterestRateText.getText().isEmpty() || C_ExpirationDateLabel.getText().isEmpty()){
                   JOptionPane.showMessageDialog(frame, "The fields are empty !!");
            }
            else{
                try{
                    String clientName = C_ClientNameText.getText();
                    String issuerBank = C_IssuerBankText.getText();
                    String bankAccount = C_BankAccountText.getText();
                    String expirationDate = C_ExpirationDateLabel.getText();
            
                    int cardId = Integer.parseInt(C_CardIdText.getText());
                    int balanceAmount = Integer.parseInt(C_BalanceAmountText.getText());
                    int cvcNumber = Integer.parseInt(C_CVCNumberText.getText());
                
                    double interestRate = Double.parseDouble(C_InterestRateText.getText());
                    
                    boolean Existence_of_Card = false;
                    for(BankCard CreditCard : cards){
                        if(CreditCard instanceof CreditCard){
                            CreditCard CreditCard_Object = (CreditCard) CreditCard;
                            if(CreditCard_Object.getCardId() == cardId)      //Comparing card's id from ArrayList
                            {
                                Existence_of_Card = true;
                            }
                        }
                    }
                    //Make a new debit card if the card don't exist 
                    if(Existence_of_Card == false){
                        CreditCard CreditCard_Object= new CreditCard(balanceAmount, cardId, bankAccount, issuerBank, clientName, cvcNumber, interestRate, expirationDate);   //should be in the order of DebitCard constructor
                        cards.add(CreditCard_Object);
                        JOptionPane.showMessageDialog(frame, "Your Credit Card has been added successfully!!!");
                    }else{
                        //Display the message about existence of debit card if the card exist 
                        JOptionPane.showMessageDialog(frame, "Credit Card already exists.");
                    } 
                }
                catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(frame, "Please provide required information only!!!");
                }
            }
        }
        
        
        
        //.........................................Display for ADD Credit.........................................
        if(e.getSource() == C_DisplayButton){
            if(C_CardIdText.getText().isEmpty() || C_ClientNameText.getText().isEmpty() || C_IssuerBankText.getText().isEmpty() ||
               C_BankAccountText.getText().isEmpty() || C_BalanceAmountText.getText().isEmpty() || C_CVCNumberText.getText().isEmpty() || 
               C_InterestRateText.getText().isEmpty() || C_ExpirationDateLabel.getText().isEmpty()){
                   JOptionPane.showMessageDialog(frame, "The fields are empty !!");
            }
            else{
                try{
                    String clientName = C_ClientNameText.getText();
                    String issuerBank = C_IssuerBankText.getText();
                    String bankAccount = C_BankAccountText.getText();
                    String expirationDate = C_ExpirationDateLabel.getText();
            
                    int cardId = Integer.parseInt(C_CardIdText.getText());
                    int balanceAmount = Integer.parseInt(C_BalanceAmountText.getText());
                    int cvcNumber = Integer.parseInt(C_CVCNumberText.getText());
                
                    double interestRate = Double.parseDouble(C_InterestRateText.getText());
            
                    for(BankCard Display_CreditCard : cards){
                        if(Display_CreditCard instanceof CreditCard){
                            CreditCard CreditCard_Object= (CreditCard) Display_CreditCard;
                            CreditCard_Object.display();
                            JOptionPane.showMessageDialog(frame, "Credit Card information are displayed. Please check the display tab!!!");
                        }
                    }
                }
                catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(frame,"Please provide required informations only!!!");
                }
            }
        }
        
        
        //.........................................Set the Credit Limit.........................................
        if (e.getSource() == C_SetButton){
            if(C_CardIDText.getText().isEmpty() || C_CreditLimitText.getText().isEmpty() || C_GracePeriodText.getText().isEmpty()){
                JOptionPane.showMessageDialog(frame, "The fields are empty !!");
            }
            else{
                try{
                    int cardID = Integer.parseInt(C_CardIDText.getText());
                    int gracePeriod = Integer.parseInt(C_GracePeriodText.getText());
                    
                    double creditLimit = Double.parseDouble(C_CreditLimitText.getText());
                    
                    for(BankCard Set_CreditCard : cards){
                        if(Set_CreditCard instanceof CreditCard){
                            CreditCard CreditCard_Object = (CreditCard) Set_CreditCard;
                            if(CreditCard_Object.getCardId() == (cardID)){
                                if(creditLimit <= (CreditCard_Object.getBalanceAmount() * 2.5)){
                                    CreditCard_Object.setCreditLimit(creditLimit, gracePeriod);
                                    JOptionPane.showMessageDialog(frame, "Your Credit Limit has been set successfully!!!");

                                }
                                else{
                                    JOptionPane.showMessageDialog(frame, "Credit Card has been exceeded. Please try again!!!");
                                }
                            }
                            else{
                                JOptionPane.showMessageDialog(frame, "Credit Card doesn't exist.");
                            }
                        }
                    }
                }
                catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(frame, "Invalid values !!! Please enter correct values.");
                }
            }
        }
        
        
        
        //.........................................Display for Set Credit Limit.........................................
        if(e.getSource() == C_DisplayyButton){
            if(C_CardIdText.getText().isEmpty() || C_ClientNameText.getText().isEmpty() || C_IssuerBankText.getText().isEmpty() ||
               C_BankAccountText.getText().isEmpty() || C_BalanceAmountText.getText().isEmpty() || C_CVCNumberText.getText().isEmpty() || 
               C_InterestRateText.getText().isEmpty() || C_ExpirationDateLabel.getText().isEmpty() || C_CardIDText.getText().isEmpty() || 
               C_CreditLimitText.getText().isEmpty() || C_GracePeriodText.getText().isEmpty()){
                   JOptionPane.showMessageDialog(frame, "The fields are empty !!");
            }
            else{
                try{
                    String clientName = C_ClientNameText.getText();
                    String issuerBank = C_IssuerBankText.getText();
                    String bankAccount = C_BankAccountText.getText();
                    String expirationDate = C_ExpirationDateLabel.getText();
            
                    int cardId = Integer.parseInt(C_CardIdText.getText());
                    int balanceAmount = Integer.parseInt(C_BalanceAmountText.getText());
                    int cardID = Integer.parseInt(C_CardIDText.getText());
                    int cvcNumber = Integer.parseInt(C_CVCNumberText.getText());
                    int gracePeriod = Integer.parseInt(C_GracePeriodText.getText());
                    
                    double creditLimit = Double.parseDouble(C_CreditLimitText.getText());
                    double interestRate = Double.parseDouble(C_InterestRateText.getText());
            
                    for(BankCard Displayy_CreditCard : cards){
                        if(Displayy_CreditCard instanceof CreditCard){
                            CreditCard CreditCard_Object= (CreditCard) Displayy_CreditCard;
                            CreditCard_Object.display();
                            JOptionPane.showMessageDialog(frame, "Credit Card information for setting the Credit Limit are displayed. Please check the display tab!!!");
                        }
                    }
                }
                catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(frame,"Please provide required informations only!!!");
                }
            }
        }
        
        
        //.........................................Cancel Credit Card Button.........................................
        if (e.getSource() == C_CancelButton){
            if(C_CarDIDText.getText().isEmpty()){
                JOptionPane.showMessageDialog(frame, "The fields are empty !!");
            }
            else{
                try{
                    int carDID = Integer.parseInt(C_CarDIDText.getText()); 
                    
                    for(BankCard Cancel_CreditCard : cards){
                        if(Cancel_CreditCard instanceof CreditCard){
                            CreditCard CreditCard_Object = (CreditCard) Cancel_CreditCard;
                            if(CreditCard_Object.getCardId() == (carDID)){
                                CreditCard_Object.cancelCreditCard();
                                cards.remove(Cancel_CreditCard);
                                JOptionPane.showMessageDialog(frame, "Credit Card has been cancelled successfully!!!");
                            }else{
                                JOptionPane.showMessageDialog(frame, "Credit Card hasn't been cancelled");
                            }
                        }
                    }
                }
                catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(frame, "Please provide required information only!!!");
                }
            }
        }
        
        
    
        //.........................................Display for Cancel Credit Card.........................................
        if(e.getSource() == C_DisplayyyButton){
            if(C_CardIdText.getText().isEmpty() || C_ClientNameText.getText().isEmpty() || C_IssuerBankText.getText().isEmpty() ||
               C_BankAccountText.getText().isEmpty() || C_BalanceAmountText.getText().isEmpty() || C_CVCNumberText.getText().isEmpty() || 
               C_InterestRateText.getText().isEmpty() || C_ExpirationDateLabel.getText().isEmpty() || C_CardIDText.getText().isEmpty() || 
               C_CreditLimitText.getText().isEmpty() || C_GracePeriodText.getText().isEmpty() || C_CarDIDText.getText().isEmpty()){
                   JOptionPane.showMessageDialog(frame, "The fields are empty !!!");
            }
            else{
                try{
                    String clientName = C_ClientNameText.getText();
                    String issuerBank = C_IssuerBankText.getText();
                    String bankAccount = C_BankAccountText.getText();
                    String expirationDate = C_ExpirationDateLabel.getText();
            
                    int cardId = Integer.parseInt(C_CardIdText.getText());
                    int balanceAmount = Integer.parseInt(C_BalanceAmountText.getText());
                    int cardID = Integer.parseInt(C_CardIDText.getText());
                    int cvcNumber = Integer.parseInt(C_CVCNumberText.getText());
                    int gracePeriod = Integer.parseInt(C_GracePeriodText.getText());
                    int carDID = Integer.parseInt(C_CarDIDText.getText());
                    
                    double creditLimit = Double.parseDouble(C_CreditLimitText.getText());
                    double interestRate = Double.parseDouble(C_InterestRateText.getText());
            
                    for(BankCard Displayyy_CreditCard : cards){
                        if(Displayyy_CreditCard instanceof CreditCard){
                            CreditCard CreditCard_Object= (CreditCard) Displayyy_CreditCard;
                            CreditCard_Object.display();
                            JOptionPane.showMessageDialog(frame, "All Credit Card informations are displayed. Please check the display tab!!!");
                        }
                    }
                }
                catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(frame,"Please provide required informations only!!!");
                }
            }
        }
        
        
        //.........................................Clear Button.........................................
        if (e.getSource() == ClearButton){
            D_CardIdText.setText("");
            D_ClientNameText.setText("");
            D_IssuerBankText.setText("");
            D_BankAccountText.setText("");
            D_BalanceAmountText.setText("");
            D_PinNumberText.setText("");
            
            D_CardIDText.setText("");
            D_WithdrawalAmountText.setText("");
            D_PinNumberrText.setText("");
            
            C_CardIdText.setText("");
            C_ClientNameText.setText("");
            C_IssuerBankText.setText("");
            C_BankAccountText.setText("");
            C_BalanceAmountText.setText("");
            C_CVCNumberText.setText("");
            C_InterestRateText.setText("");
            
            C_CardIDText.setText("");
            C_GracePeriodText.setText("");
            C_CreditLimitText.setText("");
            
            C_CarDIDText.setText("");
        }
    }
        
    public static void main(String[] args){
        //create object of BankGUI
        BankGUI obj = new BankGUI();
    }
}
