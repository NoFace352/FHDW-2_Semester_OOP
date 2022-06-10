package cmpt377.designpat.telephone;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Subject {
    private Set<Observer> observers = new HashSet<>();
    private String digits;

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }

    public void notifyChangeDigit(int digit){
        for (Observer observer: observers){
            observer.updateDigit(digit);
        }
    }

    public void notifyChangeDigits(String digits){
        for (Observer observer: observers){
            observer.updateDigits(digits);
        }
    }
}
