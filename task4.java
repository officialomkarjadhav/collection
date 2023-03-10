import java.util.ArrayList;
import java.util.Collections;

public class task4 {
    public static void main(String[] args) {
        ArrayList <String> color=new ArrayList<>();
        color.add("red");
        color.add("white");
        color.add("green");
        color.add("blue");
        System.out.println(color);
        Collections.sort(color);
        System.out.println("after the sorting "+color);
    }
}
