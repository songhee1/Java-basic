package testCode.practice;

import java.util.ArrayList;
import java.util.List;

public class ThreadSample {
    private static int value = 0;
    public static void main(String[] args) throws InterruptedException {
        Thread t = new MyThread(); //Thread 상속받는 방법
        t.start();

        Thread t2 = new Thread(new MyThread2());// Runnable 구현하는 방법
        t2.start();

        List<Thread> pool = new ArrayList<>();
        for(int i=0;i<10;i++){
            Thread t3 = new Thread(() -> {
                for(int j=0;j<1000000;j++){
                    value++;
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
// 스레드 생성방법
class MyThread extends Thread{
    @Override
    public void run(){
    }
}

class MyThread2 implements Runnable{

    @Override
    public void run() {

    }
}
