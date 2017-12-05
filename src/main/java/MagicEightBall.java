import java.util.ArrayList;
import java.util.Collections;

public class MagicEightBall {

    private ArrayList<String> results;

    public MagicEightBall() {
        this.results = new ArrayList<>();
    }

    public void addResult(String answer) {
        this.results.add(answer);
    }

    public int getCount() {
        return this.results.size();
    }

    public String shake() {
        Collections.shuffle(results);
        return results.get(0);
    }
}
