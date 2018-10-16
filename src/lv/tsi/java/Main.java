package lv.tsi.java;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
    //    Map<String, String> translations = new TreeMap<>(); // v alfavitnom porjadke
        Map<String, String> translations = new TreeMap<>(Comparator.reverseOrder()); // v obratnom alfavitnom porjadke
 //       Map<String, String> translations = new LinkedHashMap<>(); // poradok inserta
//        Map<String, String> translations = new HashMap<>(); // besporjadocno
        translations.put("one","first");
        translations.put("two","second");
        translations.put("home","bilding");
        translations.put("ll","lala");
        System.out.println(translations.get("home"));
        System.out.println(translations.containsKey("home1"));
        System.out.println(translations.size());

        for (String k :translations.keySet()) {
            System.out.printf("A %s -> %s\n", k, translations.get(k));
        }
        translations.remove("ll");
        System.out.println(translations.size());
        for (String k :translations.keySet()) {
            System.out.printf("B %s -> %s\n", k, translations.get(k));
        }

    }
}
