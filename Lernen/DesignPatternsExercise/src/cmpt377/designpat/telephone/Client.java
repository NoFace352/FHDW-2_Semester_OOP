package cmpt377.designpat.telephone;

import java.util.List;

public class Client implements Observer{
    @Override
    public void updateDigit(int digit) {
        System.out.println(digit);
    }

    @Override
    public void updateDigits(String digits) {
        System.out.println(digits);
    }
}
