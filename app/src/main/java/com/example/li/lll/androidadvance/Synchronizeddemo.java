package com.example.li.lll.androidadvance;

public class Synchronizeddemo implements Runnable{



    private  static  int  count =0;



    public static void main(String []args){
        for (int i =0;i <10; i++){
            Thread thread= new Thread(new Synchronizeddemo());
            thread.start();
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("==============================resutlt1111 ="+ String.valueOf(count));
    }
    @Override
    public  void run() {
        for (int i =0;i<100000;i++){
            increase();
            System.out.println("resutlt ="+ String.valueOf(count));
        }
    }

    public synchronized void increase(){
        count++;
    }
}


