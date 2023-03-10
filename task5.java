import java.util.ArrayList;
import java.util.List;

public class task5 {
    public static void main(String[] args) {
        ArrayList <String> color=new ArrayList<>();
        color.add("red");
        color.add("white");
        color.add("green");
        color.add("blue");
        System.out.println(color);
        List <String> sublist=color.subList(0, 2);
         System.out.println(sublist);
    }
}
