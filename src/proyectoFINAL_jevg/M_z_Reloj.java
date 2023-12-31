/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoFINAL_jevg;

import java.util.*;

/**
 *
 * @author user
 */
public class M_z_Reloj extends javax.swing.JFrame implements Runnable
{
    String hora, min, seg, ampm;
    Calendar calendario;
    Thread h1;
    /**
     * Creates new form Clock
     */
    public M_z_Reloj() 
    {
        initComponents();
        h1 = new Thread(this);
        h1.start();
        
        setLocationRelativeTo(null);
        setTitle("Reloj");
        setVisible(true);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Reloj = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Reloj.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        Reloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton1.setText("CERRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(Reloj, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(Reloj, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Reloj;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run()
    {
       Thread ct = Thread.currentThread();
        while (ct == h1) 
        {
            calcula();
            Reloj.setText(hora + ":" + min + ":" + seg + " " + ampm);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException error) {}     
        }
    }
    
        private void calcula() 
        {
            Calendar calendario = new GregorianCalendar();
            Date fechaHoraactual = new Date();
            calendario.setTime(fechaHoraactual);
            ampm = calendario.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";
            if (ampm.equals("PM")) {
                int h = calendario.get(Calendar.HOUR_OF_DAY) - 12;
                hora = h > 9 ? "" + h : "0" + h;
                if(h==00){
                       hora="12";
                 }else{
                       hora=h>9?""+h:"0"+h;
                 }      
            } else {
                hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
            }
            min = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
            seg = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
        }
}