import Napojee.Napoj_gaz;
import Napojee.Napoj_slodki;
import Napojee.Napoje;
import Napojee.Woda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<Napoje> napoje = new ArrayList<>();

        Woda woda = new Woda();
        Napoj_gaz napoj_gaz = new Napoj_gaz();
        Napoj_slodki napoj_slodki = new Napoj_slodki();

        napoje.add(woda);
        napoje.add(napoj_gaz);
        napoje.add(napoj_slodki);

        napoje.sort(new ZrodloCompartor());

        for (Napoje a:napoje) {
            System.out.println(a.getClass().getSimpleName());
            System.out.println(" stan: "+a.pij());
        }

        System.out.println("-------------------------------------");

        Function<String,Integer> lambda_slowo = (slowo) -> (int)slowo.length();
        System.out.println(lambda_slowo.apply("testslowo"));

        Function<Integer,String> lambda_ocena = (ocena) -> "Dostanę ocenę:"+ocena;
        System.out.println(lambda_ocena.apply(5));
        BiFunction<Integer,Integer> lambda_iloczyn = (liczba1,liczba2) -> {
            int i=0;
            int licz1=(int)liczba1;
            int licz2=(int)liczba2;
            return i;
        };
        System.out.println(lambda_iloczyn.apply(4));

    }
}