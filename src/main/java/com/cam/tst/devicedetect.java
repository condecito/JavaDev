/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cam.tst;

import com.github.sarxos.webcam.*;

/**
 *
 * @author Edwin Roney
 */
public class devicedetect {

    Webcam webCam;

    public Webcam getWebCam() {
        this.webCam = Webcam.getDefault();

        if (webCam != null) {
            return this.webCam;
        } else {
            return null;
        }
    }

    public void detectMotion(Webcam camera) {
        WebcamMotionDetector detector = new WebcamMotionDetector(camera);
        detector.start();
        detector.getMotionArea();
        
    }
}
