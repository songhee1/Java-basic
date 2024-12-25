package testCode.practice;

public class ThreadSample {
    public static void main(String[] args) {
        Thread t = new MyThread(); //Thread 상속받는 방법
        t.start();

        Thread t2 = new Thread(new MyThread2());// Runnable 구현하는 방법
        t2.start();
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
