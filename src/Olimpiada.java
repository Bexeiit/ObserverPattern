import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Olimpiada implements Observed {
    Map<Integer, String> places = new HashMap<>();
    List<Observer> subscribers = new ArrayList<>();
    public void addPrize(String name, int place){
        this.places.put(place, name);
        notifyObservers();
    }

    public void removePrize(String name){
        this.places.remove(name);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: subscribers){
            observer.handleEvent(this.places);
        }
    }
}
