package testCode.practice;

import java.util.Hashtable;
import java.util.Random;
import java.util.Set;

public class RandomNumberStatics {

    private final int DATA_BOUNDARY = 50;
    private Hashtable<Integer, Integer> hastable = new Hashtable<>();
    public static void main(String[] args) {
        RandomNumberStatics sample = new RandomNumberStatics();
        sample.getRandomNumberStatistics();
    }
    public void getRandomNumberStatistics(){
        for(int i=1;i<=5000;i++){
            Random random = new Random();
            int temp = random.nextInt(DATA_BOUNDARY);
            putCurrentNumber(temp);
        }
        printStatics();
    }

    private void putCurrentNumber(int temp) {
        if(hastable.contains(temp)){
            hastable.put(temp, hastable.get(temp)+1);
        }else
            hastable.put(temp, 1);
    }

    public void printStatics(){
        Set<Integer> integers = hastable.keySet();
        for (Integer integer : integers) {
            System.out.println(hastable.get(integer));
            if (integer % 10 - 1 == 0) {
                System.out.println();
            }
        }
    }
}
