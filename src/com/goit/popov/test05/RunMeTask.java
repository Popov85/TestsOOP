package com.goit.popov.test05;

/**
 * Created by Андрей on 13.07.2016.
 */
import java.util.TimerTask;

public class RunMeTask extends TimerTask
{
        @Override
        public void run() {
                System.out.println("Run Me ~");
        }
}