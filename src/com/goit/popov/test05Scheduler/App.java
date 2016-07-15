package com.goit.popov.test05Scheduler;

/**
 * Created by Андрей on 13.07.2016.
 */
import java.util.Timer;
import java.util.TimerTask;

public class App {

        public static void main( String[] args ) {
                TimerTask task = new RunMeTask();
                Timer timer = new Timer();
                timer.schedule(task, 1000,60000);
        }
}
