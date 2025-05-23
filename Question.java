import java.util.HashMap;
import java.util.Map;

public class Question {
    private String id;
    private String text;
    private Map<String, Integer> weight;

    public Question(String id, String text, Map<String, Integer> weight) {
        this.id = id;
        this.text = text;
        this.weight = weight;
    }

    public String getId() {
        return this.id;
    }

    public String getText() {
        return this.text;
    }

    public Map<String, Integer> getWeight() {
        return this.weight;
    }

    public boolean setId(String id) {
        if (id != null && id != "") {
            this.id = id;
            return true;
        }
        return false;
    }

    public boolean setText(String text) {
        if (text != null && text != "") {
            this.text = text;
            return true;
        }
        return false;
    }

    public boolean setWeight(Map<String, Integer> weight) {
        if (weight != null) {
            this.weight = new HashMap<>(weight);
            return true;
        }
        return false;
    }

    public String toString() {
        return "id: " + id + "\ntext: " + text + "\nweight: " + weight;
    }

}
