package lesson04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class StringCollection {

    public static void main(String[] args) {
        ArrayList<String> footballClubs = new ArrayList<>();
        footballClubs.add("Arsenal");
        footballClubs.add("Chelsea");
        footballClubs.add("Kolos");
        footballClubs.add("Inter");
        footballClubs.add("BVB");

        footballClubs.remove("Inter");
        System.out.println(footballClubs.contains("Inter"));

        Iterator iterator = footballClubs.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+ " ");
        }

        Collections.sort(footballClubs);
        System.out.print("\n");

        Iterator iterator2 = footballClubs.iterator();
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next()+ " ");
        }

    }
}
