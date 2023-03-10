import java.util.ArrayList;

public class task6 {
    public static void main(String[] args) {
        ArrayList <String> color=new ArrayList<>();
        color.add("red");
        color.add("white");
        color.add("green");
        color.add("blue");
        System.out.println("orignal list"+color);
        System.out.println("list is empty or not "+color.isEmpty());
        color.removeAll(color);
        System.out.println("list is empty or not "+color.isEmpty());
    }
}
