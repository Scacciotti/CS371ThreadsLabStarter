package edu.up.cs301threadslab;

/**
 * Created by scacciot17 on 4/6/2016.
 */
public class SubThread extends Thread {
    private AnimationView aV;

    public SubThread(AnimationView newAV){
        aV = newAV;
    }

    public void run(){
        while(true){
            aV.postInvalidate();

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
