package Older.Adapter.javatpoint;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BankCustomer extends CreditCard {
    BankDetails bankDetails = new BankDetails();
    public void giveBankDetails() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the account holder name :\n");
            String customername = br.readLine();
            System.out.print("\n");

            System.out.print("Enter the account number:\n");
            long accno = Long.parseLong(br.readLine());
            System.out.print("\n");

            System.out.print("Enter the bank name :\n");
            String bankname = br.readLine();

            bankDetails.setAccHolderName(customername);
            bankDetails.setAccNumber(accno);
            bankDetails.setBankName(bankname);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getCreditCard() {
        long accno = bankDetails.getAccNumber();
        String accholdername = bankDetails.getAccHolderName();
        String bname = bankDetails.getBankName();

        return ("The Account number " + accno + " of " + accholdername + " in " + bname + " " +
                "bank is valid and authenticated for issuing the credit card. ");
    }
}
