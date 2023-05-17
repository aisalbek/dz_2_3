public class BankAccount {

    private int amount ;

     int getAmount(){
        return  amount;
    }
    void withDraw(int sum) throws LimitException {
         if (amount<sum){
             amount-=amount;
             throw new LimitException("сума больще чем балансе!!!");
         }else{
             amount -=sum;
         }

    }
    void deposit(int sum){
        amount+=sum;
    }
}


