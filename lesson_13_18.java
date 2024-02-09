import java.util.ArrayList;
import java.util.Arrays;

public class lesson_13_18 {
    //В методе main найди и удали язык программирования Pascal из списка programmingLanguages.
    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
        programmingLanguages.remove("Pascal");
    }
}
