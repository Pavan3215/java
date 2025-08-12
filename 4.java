class LessBalanceException extends Exception {
	LessBalanceException(String msg) {
		super(msg);
	}
}

class Account {
    private int acc_no;
    private double balance;
    
    Account(int acc_no) {
        this.acc_no=acc_no;
        balance=500;
        System.out.println("Account No "+acc_no+" is created with minimum balance of Rs. "+balance);
    }
    
    Account(int acc_no,int amount){
        this.acc_no=acc_no;
        balance=amount;
        System.out.println("Account No "+acc_no+" is created with the intial balance of Rs. "+balance);
    }
    
    double showBalance() {
        return balance;
    }
    
    void deposit(double amount) {
        balance+=amount;
        System.out.println("The amount Rs "+amount+" is deposited to "+acc_no);
        System.out.println("Now, The total balance is Rs "+showBalance());
    }
     
    public void withdraw(double amount) throws LessBalanceException {
        if(amount<=balance) {
		if(balance-amount < 500)
			throw new LessBalanceException("Lesser than Min Balance"); 
            System.out.println("Rs "+amount+" is withdrawn from a/c "+acc_no);
        }
        else
        {
            System.out.println("Unable to withdraw the amount "+amount+" due to in-sufficient funds");
        }
        System.out.println("Now, The balance is Rs "+showBalance());
    }
    
}

class BankDemo {
    public static void main (String[] args) {
        Account a1=new Account(1800717);
        Account a2=new Account(1800752,8500);
       try { 
        a1.deposit(3200);
        a2.withdraw(1400);
        a1.withdraw(4800);
	a1.withdraw(3500);
      }catch(LessBalanceException lb) {
	System.out.println(lb);
       }
    }
}
