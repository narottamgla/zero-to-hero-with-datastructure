package org.datastructure.threading;

public class MultiThreadingWithThreadClass extends Thread {

    @Override
    public void run() {
        System.out.println("Anay Singh :" + System.currentTimeMillis());
        try {
            Thread.sleep(2000);
            System.out.println("Last step of thread");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }


    public static void main(String[] args) {
       System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 4; i++) {
            MultiThreadingWithThreadClass threading = new MultiThreadingWithThreadClass();
            threading.start();
        }

    }
}
