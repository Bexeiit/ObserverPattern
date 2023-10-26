import java.util.Map;

public class Subscribers implements Observer{
    String name;
    int place;

    public Subscribers(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(Map<Integer, String> places) {
        System.out.println("Dear " + name + "\n We have some prize places" + places + "\n");
    }
}
