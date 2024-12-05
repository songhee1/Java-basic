package testCode;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapSample {

    public static void main(String[] args) {
        TreeMapSample sample = new TreeMapSample();
        sample.checkTreeMap();
    }
    public void checkTreeMap(){
        TreeMap<String, String> map = new TreeMap<>(); // 키의 값을 기준으로 정렬
        map.put("가", "e");
        map.put("A", "a");
        map.put("1", "f");
        map.put("a", "g");

        Set<Entry<String, String>> entries = map.entrySet();
        for (Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
    }
}
