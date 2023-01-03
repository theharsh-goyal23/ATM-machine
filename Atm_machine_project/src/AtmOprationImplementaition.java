import java.util.HashMap;
import java.util.Map;

public class AtmOprationImplementaition implements AtmOprationInterface{
ATM atm = new ATM();
Map<Double,String>ministmt = new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Availaible Balance is :" + atm.getBalance());
    }

    @Override
    public void withdrawalAmount(double withdrawAmount) {
        if (withdrawAmount%500==0){
            if (withdrawAmount<=atm.getBalance()) {
                ministmt.put(withdrawAmount," Amount withdrawn");
                System.out.println("Collect the cash :" + withdrawAmount);
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
            }
            else {
                System.out.println("Insufficient Balance !! ");
            }
        }
        else {
                System.out.println("Please Enter amount in Multiple of 500");
            }
        }



    @Override
    public void depositAmount(double depositAmount) {
        ministmt.put(depositAmount," Amount Deposited");
        System.out.println(depositAmount + " Deposit Succesfully !!");
        atm.setBalance(atm.getBalance() + depositAmount);
        viewBalance();

    }

    @Override
    public void viewMiniStatement() {
        for (Map.Entry<Double,String> m:ministmt.entrySet()){
            System.out.println(m.getKey() + "" + m.getValue());
        }
    }
}
