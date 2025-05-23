import java.util.ArrayList;
import java.util.List;

public class BirdQuiz {
    private List<Bird> birds;
    private List<Question> questions;

    public BirdQuiz(ArrayList<Bird> birds, ArrayList<Question> questions) {
        this.birds = birds;
        this.questions = questions;
    }

    public List<Bird> getBirds() {
        return new ArrayList<Bird>(this.birds);
    }

    public List<Question> getQuestions() {
        return new ArrayList<Question>(this.questions);
    }

    public boolean setBirds(List<Bird> birds) {
        if (birds != null) {
            this.birds = birds;
            return true;
        }
        return false;
    }

    public boolean setQuestions(List<Question> questions) {
        if (questions != null) {
            this.questions = questions;
            return true;
        }
        return false;
    }
}
