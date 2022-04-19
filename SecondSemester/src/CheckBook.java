import java.util.Scanner;

public class CheckBook {
    public static void main(String[] args) {
        float withdraw = 0; float balance = 100;  float deposit;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("when done, type 'exit' to exit the program");
            System.out.println("welcome. would you like to withdraw or deposit ?");
            String userInput = sc.next();
            if (userInput.equals("withdraw")) {
                    System.out.print("Amount to withdraw = ");
                    withdraw = sc.nextFloat();
                if (balance >= withdraw){
                    balance =  balance - withdraw ;
                    System.out.println("balance = " + balance);
                }else{
                    System.out.println("Insufficient balance");
                    System.out.println("your balance is = " + balance);
                }
            }else if (userInput.equals("deposit")){
                System.out.print("Amount to deposit = ");
                deposit = sc.nextFloat();
                balance = balance + deposit;
                System.out.println("balance = " + balance );
            }else if (userInput.equals("exit")){
                System.exit(0);
            }
        }
    }
    }

