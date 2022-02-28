import java.util.ArrayList;
import java.util.Arrays;

public class Test extends Question {
    private String[] options;
    private int numOfOptions;
    private ArrayList<String> labels;

    Test(){}

    public String getOptionAt(int opt) {
        return this.options[opt];
    }

    public void setOptions(String[] options){
        this.options = options;
    }

    @Override
    public String toString() {
        return "Test{" +
                "options=" + Arrays.toString(options) +
                ", numOfOptions=" + numOfOptions +
                ", labels=" + labels +
                '}';
    }
}
