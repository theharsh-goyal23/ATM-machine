import java.sql.SQLOutput;
import java.util.Scanner;

public class Mainclass {
    public static void main(String[] args) {
        AtmOprationInterface op = new AtmOprationImplementaition() ;
        int atmnumber=12345;
        int atmpin=123;
        Scanner in = new Scanner(System.in);
        System.out.println("WELCOME TO ATM MACHINE !!");
        System.out.print("Enter ATM number :");
        int atmNumber = in.nextInt();
        System.out.println("Enter ATM pin :");
        int pin = in.nextInt();
        if (atmnumber==atmNumber && atmpin == pin){
            while (true){
                System.out.println(" 1. View Availaible Balance\n 2. Withdrawal Amount \n 3. Deposit Amount \n 4. View Mini Statement \n 5. Exit ");
                System.out.println("Enter Your Choice :");
                int ch=in.nextInt();
                if (ch==1){
                    op.viewBalance();
                }
                else if (ch==2) {
                    System.out.println("Enter Amount to withdraw :");
                    double withdrawaAmount=in.nextDouble();
                    op.withdrawalAmount(withdrawaAmount);
                }
                else if (ch==3) {
                    System.out.println("Enter Amount to Deposit :");
                    double depositAmount = in.nextDouble();
                    op.depositAmount(depositAmount);
                }
                else if (ch==4) {
                    op.viewMiniStatement();
                }
                else if (ch==5) {
                    System.out.println("Collect Your ATM card \n Thank you for using ATM machine");
                    System.exit(0);
                }
                else {
                    System.out.println("Please Enter the correct choice");
                }

            }
        }
        else{
            System.out.println("Incorrect ATM number or pin");
            System.exit(0);
        }
    }

}
