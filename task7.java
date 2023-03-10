import java.util.ArrayList;

public class task7 {
    public static void main(String[] args) {
        ArrayList <String> color=new ArrayList<>();
        color.add("red");
        color.add("white");
        color.add("green");
        color.add("blue");
        System.out.println("before appending"+color);
        color.add("yellow");
        System.out.println("after appending"+color);
    }
}
