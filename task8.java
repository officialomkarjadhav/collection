import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class task8 {
   
        public static void main(String[] args) {
        LinkedList <String> color=new LinkedList();
            color.add("red");
            color.add("white");
            color.add("green");
            color.add("blue");
            Iterator i=color.listIterator();
            while(i.hasNext()){
                System.out.println(i.next());
            }
    }
}
