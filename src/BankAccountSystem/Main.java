package BankAccountSystem;

public class Main {
    private static final String SAVINGS_TYPE = "SAVINGS";
    private static final String CURRENT_TYPE = "CURRENT";

    public static void main (String[]  args){

        SavingsAccountInterface savingsaccount = new SavingsAccount();
        CurrentAccountInterface currentaccount = new CurrentAccount();

        savingsaccount.setownerName("User1");
        savingsaccount.setwithdrawAmt(1000);
        savingsaccount.setdepositAmt(10000);
        savingsaccount.setbalance(10000);
        savingsaccount.setacctype(SAVINGS_TYPE);
        savingsaccount.setaccNo(123456);
        savingsaccount.setcreateFixedDeposit("Fixed Deposit Created");

        currentaccount.setownerName("User2");
        currentaccount.setwithdrawAmt(2000);
        currentaccount.setdepositAmt(50000);
        currentaccount.setbalance(50000);
        currentaccount.setacctype(CURRENT_TYPE);
        currentaccount.setaccNo(654321);
        currentaccount.setenableOverdraft("Overdraft Enabled");

        if (SAVINGS_TYPE.equals(savingsaccount.getacctype())){
            System.out.println(savingsaccount.getownerName()+":"+savingsaccount.getacctype());
            System.out.println( "Deposited:"+savingsaccount.getdepositAmt());
            System.out.println("Balance:"+savingsaccount.getbalance());
            System.out.println(savingsaccount.getcreateFixedDeposit());
        }
        if(CURRENT_TYPE.equals(currentaccount.getacctype())){
            System.out.println(currentaccount.getownerName()+":"+currentaccount.getacctype());
            System.out.println( "Deposited:"+currentaccount.getdepositAmt());
            System.out.println("Balance:"+currentaccount.getbalance());
            System.out.println(currentaccount.getenableOverdraft());

        }



















    }
}
