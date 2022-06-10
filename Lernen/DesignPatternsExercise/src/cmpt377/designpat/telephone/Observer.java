package cmpt377.designpat.telephone;

import java.util.List;

public interface Observer {
    void updateDigit(int digit);
    void updateDigits(String digits);
}
