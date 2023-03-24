import Napojee.Napoje;

import java.util.Comparator;

public class ZrodloCompartor implements Comparator<Napoje> {


    @Override
    public int compare(Napoje o1, Napoje o2) {
        String s1 = o1.getClass().getSimpleName();
        String s2 = o2.getClass().getSimpleName();
        return s1.compareTo(s2);
    }
}