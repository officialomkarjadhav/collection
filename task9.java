import java.util.LinkedList;

public class task9 {
    public static void main(String[] args) {
        LinkedList <String> color=new LinkedList();
        color.add("red");
        color.add("white");
        color.add("green");
        color.add("blue");
        if(color.contains("green")){
            System.out.println("green is there in linked list");
        }else
        System.out.println("green is not there in linked list");
    }
}
