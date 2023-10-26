import java.util.List;
import java.util.Map;

public interface Observer {
    public void handleEvent(Map<Integer, String> places);
}
