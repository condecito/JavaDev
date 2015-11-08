/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cam.prb;

import com.cam.tst.main;
import com.github.sarxos.webcam.WebcamDevice;
import com.github.sarxos.webcam.WebcamMotionEvent;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;

/**
 *
 * @author Edwin Roney
 */
public class test  implements com.github.sarxos.webcam.WebcamMotionListener{

    public void motionDetected(WebcamMotionEvent wme) {
        System.out.println(wme.getArea()+"\n");
    }
    
    
    
 
    
   
}
