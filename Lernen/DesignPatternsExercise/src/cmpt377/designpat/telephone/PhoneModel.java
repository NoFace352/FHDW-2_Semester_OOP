package cmpt377.designpat.telephone;

import java.util.ArrayList;
import java.util.List;

/**
 * Store a phone number, digit-by-digit
 */
public class PhoneModel extends Subject{
    private List<Integer> digits = new ArrayList<>();

    public void addDigit(int newDigit) {
        digits.add(newDigit);
        notifyChangeDigit(newDigit);
    }

    public List<Integer> getDigits() {
        notifyChangeDigits(digits.toString());
        return digits;
    }
}
