public class BankAccount {

    private int amount ;

     int getAmount(){
        return  amount;
    }
    void withDraw(int sum){
        amount -=sum;
    }
    void deposit(int sum){
        amount+=sum;
    }
}


