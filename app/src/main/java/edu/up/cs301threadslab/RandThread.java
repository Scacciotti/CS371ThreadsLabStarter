package edu.up.cs301threadslab;

import java.util.Random;

/**
 * Created by scacciot17 on 4/6/2016.
 */
public class RandThread extends Thread {
    private StarAnimation sA;

    public RandThread(StarAnimation newsA){
        sA = newsA;
    }

    public void run(){
        Random rand = new Random();
        while (true) {
            synchronized (sA) {
                if (rand.nextBoolean()) {
                    sA.addStar();
                } else {
                    sA.removeStar();
                }
            }
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
