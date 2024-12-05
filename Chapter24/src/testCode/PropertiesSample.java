package testCode;

import java.util.Properties;
import java.util.Set;

public class PropertiesSample {

    public static void main(String[] args) {
        PropertiesSample sample = new PropertiesSample();
        sample.checkProperties();
    }
    public void checkProperties(){
        Properties prop = System.getProperties(); // extends HashTable
        Set<Object> keySet = prop.keySet();
        for (Object o : keySet) {
            System.out.println(o + " = "+prop.get(o));
        }
    }
}
