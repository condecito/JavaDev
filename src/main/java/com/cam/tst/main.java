/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cam.tst;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamMotionDetector;
import com.github.sarxos.webcam.WebcamMotionEvent;
import com.github.sarxos.webcam.WebcamMotionListener;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;

/**
 *
 * @author Edwin Roney
 */
public class main extends javax.swing.JFrame {

    WebcamPanel panel;

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbwebcam = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        btncapturar = new javax.swing.JButton();
        btndetectar = new javax.swing.JButton();
        btnmotion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtlog = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbwebcam, 0, 259, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbwebcam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btncapturar.setText("capturar");
        btncapturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncapturarActionPerformed(evt);
            }
        });

        btndetectar.setText("detectar");
        btndetectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndetectarActionPerformed(evt);
            }
        });

        btnmotion.setText("motion");
        btnmotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmotionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btndetectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btncapturar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmotion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btndetectar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncapturar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(btnmotion)
                .addContainerGap())
        );

        txtlog.setEditable(false);
        txtlog.setBackground(new java.awt.Color(51, 51, 51));
        txtlog.setColumns(20);
        txtlog.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        txtlog.setForeground(new java.awt.Color(255, 255, 255));
        txtlog.setRows(5);
        jScrollPane1.setViewportView(txtlog);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    }//GEN-LAST:event_formWindowOpened

    private void btndetectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndetectarActionPerformed

        devicedetect device = new devicedetect();
        String namedevice = device.getWebCam().getName();

        int countitem = 0;
        this.cmbwebcam.getItemCount();
        for (int i = 0; i <= countitem; i++) {
            try {
                if (!cmbwebcam.getItemAt(i).equals(namedevice)) {
                    this.cmbwebcam.addItem(namedevice);

                }
            } catch (Exception e) {
                this.cmbwebcam.addItem(namedevice);
                this.cmbwebcam.getItemCount();
                for (i = 0; i <= countitem; i++) {
                    if (!cmbwebcam.getItemAt(i).equals(namedevice)) {
                        this.cmbwebcam.addItem(namedevice);

                    }

                }

                this.txtlog.setText(this.txtlog.getText() + "\n" + e.getMessage());

            }
        }
    }//GEN-LAST:event_btndetectarActionPerformed

    private void btncapturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncapturarActionPerformed
        devicedetect device = new devicedetect();
        try {
            device.getWebCam().setViewSize(WebcamResolution.VGA.getSize());

            WebcamPanel panel = new WebcamPanel(device.getWebCam());
            panel.setFPSDisplayed(true);
            panel.setDisplayDebugInfo(true);
            panel.setImageSizeDisplayed(true);
            panel.setMirrored(true);


            JFrame window = new JFrame("Test webcam panel");
            window.add(panel);
            window.setResizable(true);
            window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            window.pack();
            window.setVisible(true);


        } catch (Exception e) {
            this.txtlog.setText(this.txtlog.getText() + "\n" + e.getMessage());
        }

    }//GEN-LAST:event_btncapturarActionPerformed

    public void motiondetec(Webcam cam) {


        WebcamMotionDetector movimiento = new WebcamMotionDetector(cam);
        movimiento.start();
        movimiento.setInterval(100);
        WebcamMotionListener listener = new WebcamMotionListener() {
            public void motionDetected(WebcamMotionEvent wme) {
                System.out.println(wme.getCog());
                actualizador(wme.getCog());

            }
        };

        movimiento.addMotionListener(listener);
        panel = new WebcamPanel(cam);
        panel.setFPSDisplayed(true);
        panel.setDisplayDebugInfo(true);
        panel.setImageSizeDisplayed(true);
        panel.setMirrored(true);

        JFrame window = new JFrame("Test webcam panel");
        window.add(panel);
        window.setResizable(true);
        window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        window.pack();
        window.setVisible(true);



    }

    public void actualizador(Point pts) {
        Rectangle r = new Rectangle(pts);
    
        

    }

  
  

    private void btnmotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmotionActionPerformed
        devicedetect device = new devicedetect();


        try {
            device.detectMotion(device.getWebCam());
            motiondetec(device.getWebCam());

        } catch (Exception e) {
            this.txtlog.setText(this.txtlog.getText() + "\n" + e.getMessage());
        }



    }//GEN-LAST:event_btnmotionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncapturar;
    private javax.swing.JButton btndetectar;
    private javax.swing.JButton btnmotion;
    private javax.swing.JComboBox cmbwebcam;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtlog;
    // End of variables declaration//GEN-END:variables
}