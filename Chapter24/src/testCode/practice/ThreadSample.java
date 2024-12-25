package testCode.practice;

import com.sun.tools.javac.Main;
import java.util.ArrayList;
import java.util.List;

public class ThreadSample {
    private static int value = 0;
    public static void main(String[] args) throws InterruptedException {
        Thread r1 = new MyThread("*");
        Thread r2 = new MyThread("!");
        Thread r3 = new MyThread("&");

        r1.start();
        r2.start();
        r3.start();

        System.out.println("종료");
    }
}
class MyThread extends Thread{

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run(){
        System.out.println(this.getName());
    }
}
