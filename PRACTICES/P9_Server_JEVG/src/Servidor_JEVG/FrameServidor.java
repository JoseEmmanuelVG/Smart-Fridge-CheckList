/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor_JEVG;

import Servidor_JEVG.Cliente;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import java.util.Observable;
import java.util.Observer;
import javax.swing.ImageIcon;
import java.awt.Image;
/**
 *
 * @author user                     //JEVG
 */
public class FrameServidor extends javax.swing.JFrame implements Observer 
{
int L1=3 , L2=2 , L3=1;
double angulo1,angulo2,angulo3, A1, A2, A3;

    public FrameServidor()
    {
        initComponents();
        ImageIcon imagen1 = new ImageIcon("Imagen1.png");
        ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel7.getWidth(),jLabel7.getHeight(), Image.SCALE_DEFAULT));
        jLabel7.setIcon(icono1);
       
        Lado1.setText("L1: "+L1);Lado2.setText("L2: "+L2);Lado3.setText("L3: "+L3);
        
        this.setTitle("SERVIDOR");
        this.getRootPane().setDefaultButton(this.btnEnviar);
        Servidor s = new Servidor(5000);
        s.addObserver(this);
        Thread t = new Thread(s);
        t.start();
        
                double Px, Py; 
                 Px=(L1*(Math.cos(45/57.2958)))+(L2*(Math.cos((45+30)/57.2958)))+(L3*(Math.cos((45+30+25)/57.2958)));
                 Py=(L1*(Math.sin(45/57.2958)))+(L2*(Math.sin((45+30)/57.2958)))+(L3*(Math.sin((45+30+25)/57.2958)));

                 //String mensaje = "\nPx: " + Px + "\n"  +  "\nPy: " + Py + "\n"  +  "OK";
                 jTextArea2.setText("Px: " + Px + "\n"  +  "\nPy: " + Py + "\n"  +  "\nOK");
                 
      /* double L1New = Math.toRadians(L1);
       double Mostrar = 3*Math.cos(45/57.2958)+2*Math.cos((45+30)/57.2958)+1*Math.cos((45+30+25)/57.2958);
       String totalityString = String.valueOf(Mostrar);
       Lado1.setText("1: "+Mostrar);*/
    }
    
    private static boolean isNumeric(String cadena)
    {
	try 
        {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe)
            {
                    return false;
            }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtTexto = new javax.swing.JTextArea();
        btnEnviar = new javax.swing.JButton();
        txtTextoEnviar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Borrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Lado3 = new javax.swing.JTextField();
        Lado2 = new javax.swing.JTextField();
        Lado1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FRM1");

        txtTexto.setColumns(20);
        txtTexto.setRows(5);
        jScrollPane1.setViewportView(txtTexto);

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        txtTextoEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTextoEnviarActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel1.setText("Respuesta de servidor");

        jLabel2.setText("Datos enviados del Cliente");

        jLabel3.setText("HISTORIAL");

        Borrar.setText("Limpiar Registro");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });

        jLabel4.setText("REGISTRO");

        Lado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lado2ActionPerformed(evt);
            }
        });

        Lado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lado1ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jLabel5.setText("Respuesta para: ");

        jLabel6.setText("a1=45 ; a2=30 ; a3=25");

        jLabel8.setText("Datos del ROBOT ");

        jLabel9.setText("Puerto de escucha :   5000");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(Borrar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(jLabel3)))
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(24, 24, 24))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(40, 40, 40)))
                                .addGap(0, 34, Short.MAX_VALUE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEnviar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTextoEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Lado3)
                            .addComponent(Lado2)
                            .addComponent(Lado1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTextoEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEnviar)
                            .addComponent(jLabel1))
                        .addGap(13, 13, 13)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Lado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Lado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Lado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Borrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        if (isNumeric(jTextArea1.getText()))
        {
        String angulo = jTextArea1.getText();
        int anguloEntero1 = Integer.parseInt(angulo);
        int x = 0;
        
            if (anguloEntero1>=0 && anguloEntero1<=360)
            {
                String mensaje = " \nServidor: OK \n";
                this.txtTexto.append(mensaje);
                Cliente c = new Cliente(6000, mensaje);
                Thread t = new Thread(c);
                t.start();  
                x=x+1;
            } 
            else if(anguloEntero1<0  || anguloEntero1>360)
            {
                String mensaje = "\nServidor: KO \n";
                this.txtTexto.append(mensaje);
                Cliente c = new Cliente(6000, mensaje);
                Thread t = new Thread(c);
                t.start();   
                x=0;
            }
          //  for(x=1 ; x<=3 ; x++) 
            //{
              //  if(x==1){angulo1=anguloEntero1;}
                //else if(x==2){angulo2=anguloEntero1;}
                //else if(x==3){angulo3=anguloEntero1;}
            //}                          
         /*   if(x==1){A1=anguloEntero1;}
            else if(x==2){A2=anguloEntero1;}
            else if(x==3){A3=anguloEntero1;}
                     
                    angulo1=A1;
                    angulo1=A2;
                    angulo1=A3;*/
                
                
               switch (x) 
                {
                    case 1: A1=anguloEntero1;
                    break;
                    case 2: A2=anguloEntero1;
                    
                        break;
                    case 3: A3=anguloEntero1;
                    
                        break;
                }
               angulo1=A1; angulo2=A2; angulo3=A2;
                /*String mensaje = "\n ES numero \n";
                this.txtTexto.append(mensaje);
                Cliente c = new Cliente(6000, mensaje);
                Thread t = new Thread(c);
                t.start();  */
        }
       else
       {
            if (jTextArea1.getText().equals("Cliente: Estado"))
             {
                 String mensaje = "\nServidor: Listo \n";
                 this.txtTexto.append(mensaje);
                 Cliente c = new Cliente(6000, mensaje);
                 Thread t = new Thread(c);
                 t.start();  
             }     
             else if(jTextArea1.getText().equals("Cliente: Get Px  Get Py"))
             {
                double Px, Py; 
                double aT1=angulo1/57.2958 , aT2=(angulo1+angulo2)/57.2958 , aT3=(angulo1+angulo2+angulo3)/57.2958;
                Px=(L1*(Math.cos(aT1)))+(L2*(Math.cos(aT2))+(L3*(Math.cos(aT3))));
                Py=(L1*(Math.sin(aT1)))+(L2*(Math.sin(aT2))+(L3*(Math.sin(aT3))));

                String mensaje = "\nPx: " + Px + "\n"  +  "\nPy: " + Py + "\n"  +  "Para Ángulos: " +"a1: "+angulo1+
                                  " a2: "+angulo2+" a3: "+angulo3 +  "\nOK\n";
                 this.txtTexto.append(mensaje);
                 Cliente c = new Cliente(6000, mensaje);
                 Thread t = new Thread(c);
                 t.start();  
             }    
             else if(jTextArea1.getText().equals("Cliente: se realizo el calculo?"))
             {
                
                String mensaje = "\n Servidor : OK";
                 this.txtTexto.append(mensaje);
                 Cliente c = new Cliente(6000, mensaje);
                 Thread t = new Thread(c);
                 t.start();  
             }    
       /*String mensaje = "\n No es numero\n";
                this.txtTexto.append(mensaje);
                Cliente c = new Cliente(6000, mensaje);
                Thread t = new Thread(c);
                t.start();*/
        }
            
        
        

       /* if (jTextArea1.getText().equals("Cliente: Estado"))
        {
            String mensaje = "\nServidor: Listo \n";
            this.txtTexto.append(mensaje);
            Cliente c = new Cliente(6000, mensaje);
            Thread t = new Thread(c);
            t.start();  
        }     
        else if(jTextArea1.getText().equals("Cliente: Get Px  Get Py"))
        {
            double Px, Py; 
            Px=(L1*Math.cos(angulo1))+(L2*Math.cos(angulo1+angulo2))+(L3*Math.cos(angulo3));
            Py=(L1*Math.sin(angulo1))+(L2*Math.sin(angulo1+angulo2))+(L3*Math.sin(angulo3));
            String totalString = String.valueOf(Px);
            String fullString = String.valueOf(Py);
            
            String mensaje = "\nPx: " + Px + "\n"  +  "\nPx: " + Py + "\n"  +  "OK";
            this.txtTexto.append(mensaje);
            Cliente c = new Cliente(6000, mensaje);
            Thread t = new Thread(c);
            t.start();  
        }
        
            else  if (anguloEntero1>=0 && anguloEntero1<=360)
            {
                String mensaje = " \nServidor: OK \n";
                this.txtTexto.append(mensaje);
                Cliente c = new Cliente(6000, mensaje);
                Thread t = new Thread(c);
                t.start();
                x++;
            } 
            else if(anguloEntero1<0 && anguloEntero1>360)
            {
                String mensaje = "\nServidor: KO \n";
                this.txtTexto.append(mensaje);
                Cliente c = new Cliente(6000, mensaje);
                Thread t = new Thread(c);
                t.start();   
                x=0;
            }
        else 
        {
           String mensaje ="KO";
           this.txtTexto.append(mensaje);
           Cliente c = new Cliente(6000, mensaje);
           Thread t = new Thread(c);
           t.start();   
        }
                switch (x) 
                {
                    case 1: angulo1=anguloEntero1;
                        break;
                    case 2: angulo2=anguloEntero1;
                        break;
                    case 3: angulo3=anguloEntero1;
                        break;
                }/*
                
      
        
  /*  int Accion=0;
    String angulo = jTextArea1.getText();
    int anguloEntero1 = Integer.parseInt(angulo);
    int x = 1;
    if (jTextArea1.getText().equals("Cliente: Estado"))
        {
            Accion=1;  
        }       
        
    switch (Accion) 
                {
                    case 1:
                String mensaje = "\nServidor: Listo \n";
                this.txtTexto.append(mensaje);
                Cliente c = new Cliente(6000, mensaje);
                Thread t = new Thread(c);
                t.start();  
                        break;
                    case 2: 
                        break;
                    case 3: 
                        break;
                    default: 
                String mensaje = "\nServidor: KO \n";
                this.txtTexto.append(mensaje);
                Cliente c = new Cliente(6000, mensaje);
                Thread t = new Thread(c);
                t.start();   
                x=0;
                        break;     
                }   */ 
        
            
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText("");
        txtTextoEnviar.setText("");
    }//GEN-LAST:event_BorrarActionPerformed

    private void Lado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Lado1ActionPerformed

    private void Lado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lado2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Lado2ActionPerformed

    private void txtTextoEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTextoEnviarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTextoEnviarActionPerformed

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
            java.util.logging.Logger.getLogger(FrameServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameServidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Borrar;
    private javax.swing.JTextField Lado1;
    private javax.swing.JTextField Lado2;
    private javax.swing.JTextField Lado3;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea txtTexto;
    private javax.swing.JTextField txtTextoEnviar;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) 
    {
        this.txtTexto.append((String) arg);
        this.jTextArea1.append((String) arg);
        /*String angulo = jTextArea1.getText();
        int anguloEntero = Integer.parseInt(angulo);
        if (anguloEntero>=0 && anguloEntero<=360)
        {
           jTextArea1.setText("hola mundo\n");
        }
        else
        {
            jTextArea1.setText("");
        }*/
    }
}                                       //JEVG
