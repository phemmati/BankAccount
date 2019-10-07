public class BankAccount3 implements Comparable {
    public float balance;
    public float rate;


    public void processYear(){

        float interest = balance * rate;
        balance = balance + interest;

    }

    public void processNYears(int n){
        int i = 0;
        while (i < n) {
            processYear();
            i = i + 1;
        }
    }

    public static void main(String [] args) {
	int a = 0;
        BankAccount3 account = new BankAccount3(1000,.1f);
        BankAccount3 account2 = new BankAccount3(1000,.1f);
        account.processNYears(10);
        account.compareTo(account2);
        System.out.println("balance after years is: " + account.balance);

    }
    public BankAccount3(float balance,float rate){
        this.balance = balance;
        this.rate = rate;
    }

    public int compareTo(Object o){
        if this.balance ==
    }



}

