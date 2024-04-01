package JavaBasics;
import java.util.*;

public class arrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(6);

        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);


        ArrayList<String> str = new ArrayList();
        str.add("Bhavnish");
        str.add("is");
        str.add("very");
        str.add("Good");
        str.add("Boy");

        System.out.println(str);
        Collections.sort(str, Collections.reverseOrder());
        System.out.println(str);
    }
}
