import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static BankAccount bankAccount = new BankAccount();
    public static void main(String[] args) {

        String stop = "";
        comands();
        while (!stop.equals("x")) {
            stop = scanner.nextLine();
            swich(stop);
        }
    }

    public static void swich(String p) {
        switch (p) {
            case "1":

                System.out.println("сколько хотите пополнить.  ");
                System.out.print("ведите суму :");
                bankAccount.deposit(scanner.nextInt());
                comands();
                break;
            case "2":
                int s = scanner.nextInt();
                try {
                    if (s>bankAccount.getAmount()){
                        bankAccount.withDraw(bankAccount.getAmount());
                      throw new LimitException();

                    }else {
                        bankAccount.withDraw(s);
                    }
                } catch (LimitException e) {
                    System.out.println("вы сняли остаток денги");
                }
                comands();
                break;
            case "3":
                System.out.println(bankAccount.getAmount());
                comands();
                break;
        }
    }
    public static void comands() {
        System.out.println(" Пополнить денги нажмите   : (1)");
        System.out.println(" Снять денги нажмите       : (2)");
        System.out.println(" Проверить баланс нажмите  : (3)");
        System.out.println(" Останавить просес нажмите : (х)");
    }

}
