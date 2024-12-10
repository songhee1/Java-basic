package testCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapSample {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(10);
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        map.put("D", "d");

        Set<Entry<String, String>> entries = map.entrySet();
        for (Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+ " = " + entry.getValue());
        }
    }
}
