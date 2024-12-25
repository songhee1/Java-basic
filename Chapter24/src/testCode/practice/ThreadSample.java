package testCode.practice;

import com.sun.tools.javac.Main;
import java.util.ArrayList;
import java.util.List;

public class ThreadSample {
    private static int value = 0;
    public static void main(String[] args) throws InterruptedException {
        List<Thread> pool = new ArrayList<>();
        for(int i=0;i<10;i++){
            Thread t3 = new Thread(() -> {
                for(int j=0;j<1000000;j++){
                    synchronized (ThreadSample.class){
                        value++;
                    }
                }
            });

            t3.start();
            pool.add(t3);
        }

        for(Thread t3 : pool){
            t3.join();
        }

        System.out.println("value = "+value);
    }
}

