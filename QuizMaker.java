import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class Quiz {
    private String name;
    private ArrayList<String> questions;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    Quiz(){}

    public static Quiz loadFromFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner in = new Scanner(file);



    }



    public void addQuestion(Question question){

    }

    public void start(){

    }

}
public class QuizMaker{
    public static void main(String[] args) {
        
    }
}
