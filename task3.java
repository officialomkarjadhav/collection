import java.util.ArrayList;

public class task3 {
    public static void main(String[] args) {
        ArrayList <String> color=new ArrayList<>();
        color.add("red");
        color.add("white");
        color.add("green");
        color.add("blue");
        System.out.println(color);
        color.remove(2);
        System.out.println("after removing element of second index"+color);
      
    }
}
