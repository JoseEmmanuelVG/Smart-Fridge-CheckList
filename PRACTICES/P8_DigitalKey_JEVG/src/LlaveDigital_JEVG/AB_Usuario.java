/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LlaveDigital_JEVG;
/**
 *
 * @author referencia: catur    Implementacion: JEVG
 */ 

import com.fazecast.jSerialComm.SerialPort;
import com.fazecast.jSerialComm.SerialPortDataListener;
import com.fazecast.jSerialComm.SerialPortEvent;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import java.io.OutputStream;
import java.io.IOException;

public class AB_Usuario extends javax.swing.JFrame {

    SerialPort serialPort1;
    OutputStream outputStream1;
    String dataBuffer = "";
    /**
     * Creates new form MainJFrame
     */
    public AB_Usuario() {
        initComponents();
        this.setTitle("USUARIO");
        
        //Create default value
        jComboBox_baudRate.setSelectedItem("9600");
        jComboBox_dataBits.setSelectedItem("8");
        jComboBox_stopBits.setSelectedItem("1");
        jComboBox_parityBits.setSelectedItem("NO_PARITY");
        jComboBox_endLine.setSelectedItem("None");
        
        jComboBox_comPort.setEnabled(true);
        jProgressBar_comStatus.setValue(0);
        jButton_open.setEnabled(true);
        jButton_close.setEnabled(false);
        jButton_send.setEnabled(false);
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
        jLabel1 = new javax.swing.JLabel();
        jComboBox_comPort = new javax.swing.JComboBox<>();
        jComboBox_baudRate = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox_dataBits = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox_stopBits = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox_parityBits = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jProgressBar_comStatus = new javax.swing.JProgressBar();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton_open = new javax.swing.JButton();
        jButton_close = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        DatosEnviados = new javax.swing.JTextField();
        jButton_send = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DatosRecibidos = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jComboBox_endLine = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Serial Communication");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Propiedaddes del puerto COM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Puerto COM");

        jComboBox_comPort.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox_comPortPopupMenuWillBecomeVisible(evt);
            }
        });

        jComboBox_baudRate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4800", "9600", "38400", "57600", "115200" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("BAUD RATE");

        jComboBox_dataBits.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6", "7", "8" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("BITS");

        jComboBox_stopBits.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "1.5", "2" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("BITS de PARADA");

        jComboBox_parityBits.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO_PARITY", "EVEN_PARITY", "ODD_PARITY", "MARK_PARITY", "SPACE_PARITY" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("PARIDAD BITS");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("ESTATUS del COM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox_comPort, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_baudRate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_dataBits, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_stopBits, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_parityBits, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jProgressBar_comStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel2)
                        .addGap(65, 65, 65)
                        .addComponent(jLabel3)
                        .addGap(77, 77, 77)
                        .addComponent(jLabel4)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox_comPort, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox_baudRate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox_dataBits, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox_stopBits, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox_parityBits, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jProgressBar_comStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton_open.setText("ABRIR PUERTO");
        jButton_open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_openActionPerformed(evt);
            }
        });

        jButton_close.setText("CERRAR");
        jButton_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButton_open, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_close, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton_open, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton_close, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jButton_send.setText("ENVIAR");
        jButton_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_sendActionPerformed(evt);
            }
        });

        DatosRecibidos.setColumns(20);
        DatosRecibidos.setRows(5);
        jScrollPane1.setViewportView(DatosRecibidos);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("FINAL DE LINEA");

        jComboBox_endLine.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "New Line (\\n)", "Carriage Return (\\r)", "Both (\\r\\n)" }));

        jLabel8.setText("RESPUESTA :");

        jButton1.setText("LIMPIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setText("Número 1 (5 espacios)  Número2");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DatosEnviados))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_send, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_endLine, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel8)
                                .addContainerGap())
                            .addComponent(jScrollPane1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(80, 80, 80))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DatosEnviados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_send, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jComboBox_endLine, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton2.setText("Avanzar al BANCO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleDescription("Propiedaddes del puerto COM");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_comPortPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox_comPortPopupMenuWillBecomeVisible
        // TODO add your handling code here:
        jComboBox_comPort.removeAllItems();
        SerialPort []portLists = SerialPort.getCommPorts();
        for(SerialPort port : portLists){
            jComboBox_comPort.addItem(port.getSystemPortName());
        }
    }//GEN-LAST:event_jComboBox_comPortPopupMenuWillBecomeVisible

    private void jButton_openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_openActionPerformed
        // TODO add your handling code here:
        try{
            SerialPort []portLists = SerialPort.getCommPorts();
            serialPort1 = portLists[jComboBox_comPort.getSelectedIndex()];
            serialPort1.setBaudRate(Integer.parseInt(jComboBox_baudRate.getSelectedItem().toString()));
            serialPort1.setNumDataBits(Integer.parseInt(jComboBox_dataBits.getSelectedItem().toString()));
            serialPort1.setNumStopBits(Integer.parseInt(jComboBox_stopBits.getSelectedItem().toString()));
            serialPort1.setParity(jComboBox_parityBits.getSelectedIndex());
            serialPort1.openPort();
            
            if(serialPort1.isOpen()){
                JOptionPane.showMessageDialog(this, serialPort1.getDescriptivePortName() + " -- Success to OPEN!");
                jComboBox_comPort.setEnabled(false);
                jProgressBar_comStatus.setValue(100);
                jButton_open.setEnabled(false);
                jButton_close.setEnabled(true);
                jButton_send.setEnabled(true);
                
                Serial_EventBasedReading(serialPort1);
            }
            else{
                JOptionPane.showMessageDialog(this, serialPort1.getDescriptivePortName() + " -- Failed to OPEN!");
            }
        }
        catch(ArrayIndexOutOfBoundsException a){
            JOptionPane.showMessageDialog(this, "Please Choose COM PORT!", "ERROR", ERROR_MESSAGE);
        }
        catch(Exception b){
            JOptionPane.showMessageDialog(this, b, "ERROR", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_openActionPerformed

    private void jButton_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_closeActionPerformed
        // TODO add your handling code here:
        if(serialPort1.isOpen()){
            serialPort1.closePort();
            
            jComboBox_comPort.setEnabled(true);
            jProgressBar_comStatus.setValue(0);
            jButton_open.setEnabled(true);
            jButton_close.setEnabled(false);
            jButton_send.setEnabled(false);
        }
    }//GEN-LAST:event_jButton_closeActionPerformed

    private void jButton_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_sendActionPerformed
        // TODO add your handling code here:
        outputStream1 = serialPort1.getOutputStream();
        String dataToSend = "";
        
        switch(jComboBox_endLine.getSelectedIndex()){
            case 0: dataToSend = DatosEnviados.getText(); //none
                break;
            case 1: dataToSend = DatosEnviados.getText() + "\n"; //new line
                break;
            case 2: dataToSend = DatosEnviados.getText() + "\r"; //carriage return
                break;
            case 3: dataToSend = DatosEnviados.getText() + "\r\n"; //both
                break;
        }
        
        
        try{
            outputStream1.write(dataToSend.getBytes());
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton_sendActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DatosRecibidos.setText("           ");
        DatosEnviados.setText("             ");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Principal inicio;
        if(DatosRecibidos.getText().equals("CORRECTO"))
        {
            inicio=new Principal();
            inicio.setVisible(true);
            inicio.setBanco(Principal);
            dispose();  
        }
        else{jTextField1.setText("ERROR, INTENTA NUEVAMENTE");}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Serial_EventBasedReading(SerialPort activePort)
    {
        activePort.addDataListener(new SerialPortDataListener(){
        
            @Override
            public int getListeningEvents()
            {
                return SerialPort.LISTENING_EVENT_DATA_RECEIVED;
            }
            
            @Override
            public void serialEvent(SerialPortEvent event)
            {
                byte [] newData = event.getReceivedData();
                //dataBuffer += (char)newData[BYTE];
               // DatosRecibidos.setText(dataBuffer);
                for(int  i=0 ; i<newData.length ; i++)
                {
                    dataBuffer += (char)newData[i];
                    DatosRecibidos.setText(dataBuffer);
                }
            }
        });
                
                   // @Override
                  //  public int getListenerEvents(){return SerialPort.LISTENING_EVENT_DATA_RECEIVED;}
                    
               
    }
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
            java.util.logging.Logger.getLogger(AB_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AB_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AB_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AB_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AB_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DatosEnviados;
    private javax.swing.JTextArea DatosRecibidos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_close;
    private javax.swing.JButton jButton_open;
    private javax.swing.JButton jButton_send;
    private javax.swing.JComboBox<String> jComboBox_baudRate;
    private javax.swing.JComboBox<String> jComboBox_comPort;
    private javax.swing.JComboBox<String> jComboBox_dataBits;
    private javax.swing.JComboBox<String> jComboBox_endLine;
    private javax.swing.JComboBox<String> jComboBox_parityBits;
    private javax.swing.JComboBox<String> jComboBox_stopBits;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar_comStatus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    Banco Principal;
    
    public void setBanco(Banco P)
    {
        Principal=P;
    }   
}