package testCode.practice;

import java.util.HashSet;
import java.util.Random;

public class RandomMaker {

    public static void main(String[] args) {
        RandomMaker maker = new RandomMaker();
        for(int i=1;i<11;i++){
            System.out.println(maker.getSixNumber());
        }
    }
    public HashSet<Integer> getSixNumber(){
        HashSet<Integer> collection = new HashSet<>();
        for(int i=1;i<7;i++){
            Random random = new Random();
            int tempNumber = random.nextInt(45);
            collection.add(tempNumber);
        }

        return collection;
    }
}
