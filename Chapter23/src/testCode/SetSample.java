package testCode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetSample {

    public static void main(String[] args) {
        SetSample sample = new SetSample();
        String[] cars = new String[]{
            "Tico", "Sonata", "BMW", "Benz", "Lexus",
            "Mustang", "Grandeure", "SM7"
        };
        System.out.println(sample.getCarKinds(cars));
    }

    private int getCarKinds(String[] cars) {
        Set<String> carSet = new HashSet<>(); // 해시테이블, 정렬x
        for (String car : cars) {
            carSet.add(car);
        }
        printCarSet(carSet);
        return carSet.size();
    }

    public void printCarSet(Set<String> carSet){
        Iterator<String> iterator = carSet.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
    }
}
