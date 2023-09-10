/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoFINAL_jevg;

import java.awt.Image;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;

/**
 *
 * @author user             //JEVG
 */
public class K_ListarProductos extends javax.swing.JFrame
{
//ArrayList array = new ArrayList();
//DefaultListModel modelo = new DefaultListModel();
    /**
     * Creates new form K_ListarProductos
     */
    public K_ListarProductos() //throws ParseException 
    {
        initComponents();
        ImageIcon imagenMenuIcon = new ImageIcon("MenuIcon.png");
        ImageIcon iconoMenuIcon = new ImageIcon(imagenMenuIcon.getImage().getScaledInstance(30,30,1));
        Menu.setIcon(iconoMenuIcon);
        
        ImageIcon imagenmenu = new ImageIcon("FondoListar.jpg");
        ImageIcon iconomenu = new ImageIcon(imagenmenu.getImage().getScaledInstance(FondoListar.getWidth(),FondoListar.getHeight(), Image.SCALE_DEFAULT));
        FondoListar.setIcon(iconomenu);
              
        ListadoProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {J_AgregarProducto.uno.Nombre, J_AgregarProducto.uno.FechaEntrada, J_AgregarProducto.uno.FechaCad},
                {J_AgregarProducto.dos.Nombre, J_AgregarProducto.dos.FechaEntrada, J_AgregarProducto.dos.FechaCad},
                {J_AgregarProducto.tres.Nombre, J_AgregarProducto.tres.FechaEntrada, J_AgregarProducto.tres.FechaCad},
                {J_AgregarProducto.cuatro.Nombre, J_AgregarProducto.cuatro.FechaEntrada, J_AgregarProducto.cuatro.FechaCad},
                {J_AgregarProducto.cinco.Nombre, J_AgregarProducto.cinco.FechaEntrada, J_AgregarProducto.cinco.FechaCad},
                {J_AgregarProducto.seis.Nombre, J_AgregarProducto.seis.FechaEntrada, J_AgregarProducto.seis.FechaCad},
                {J_AgregarProducto.siete.Nombre, J_AgregarProducto.siete.FechaEntrada, J_AgregarProducto.siete.FechaCad},
                {J_AgregarProducto.ocho.Nombre, J_AgregarProducto.ocho.FechaEntrada, J_AgregarProducto.ocho.FechaCad},
                {J_AgregarProducto.nueve.Nombre, J_AgregarProducto.nueve.FechaEntrada, J_AgregarProducto.nueve.FechaCad},
                {J_AgregarProducto.diez.Nombre, J_AgregarProducto.diez.FechaEntrada, J_AgregarProducto.diez.FechaCad} 
            },
            new String [] {
                "Nombre del PRODUCTO", "Fecha de INTRODUCCIÓN", "Fecha de CADUCIDAD"
            }
        ));
        
        
        /*Listado.setModel(modelo);
        modelo.removeAllElements();
        for(int i=0; )
        {
            
        }*/
        //"Nuevo Producto Agregado:  " +Nombre+"\nIntroducido el:  "+FechaEntrada+"\nCaduca el:  "+FechaCad+"\n\n";
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	//Date fechaEntrada=dateFormat.parse(J_AgregarProducto.uno.FechaEntrada);
	//Date fechaCad=dateFormat.parse(J_AgregarProducto.uno.FechaCad);
        //int DiasCad =(int) ((fechaCad.getTime()-fechaEntrada.getTime())/86400000);
        
        
       /* ListaDeProductos.setText("PRODUCTO 1: " +J_AgregarProducto.uno.Nombre+"  INTRODUCIDO EL:  "+
                J_AgregarProducto.uno.FechaEntrada+"  CADUCA EL:  "+J_AgregarProducto.uno.FechaCad+
                "\n\nPRODUCTO 2: " +J_AgregarProducto.dos.Nombre+"  INTRODUCIDO EL:  "+
                J_AgregarProducto.dos.FechaEntrada+"  CADUCA EL:  "+J_AgregarProducto.dos.FechaCad+
                "\n\nPRODUCTO 3: " +J_AgregarProducto.tres.Nombre+"  INTRODUCIDO EL:  "+
                J_AgregarProducto.tres.FechaEntrada+"  CADUCA EL:  "+J_AgregarProducto.tres.FechaCad+
                "\n\nPRODUCTO 4: " +J_AgregarProducto.cuatro.Nombre+"  INTRODUCIDO EL:  "+
                J_AgregarProducto.cuatro.FechaEntrada+"  CADUCA EL:  "+J_AgregarProducto.cuatro.FechaCad+
                "\n\nPRODUCTO 5: " +J_AgregarProducto.cinco.Nombre+"  INTRODUCIDO EL:  "+
                J_AgregarProducto.cinco.FechaEntrada+"  CADUCA EL:  "+J_AgregarProducto.cinco.FechaCad
        );*/
    }
    
        /* public int DiasCad() throws ParseException
        {
        //SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	Date fechaEntrada=dateFormat.parse(FechaEntrada);
	Date fechaCad=dateFormat.parse(FechaCad);
        DiasCad =(int) ((fechaCad.getTime()-fechaEntrada.getTime())/86400000);
        return DiasCad;
        }*/
    
    /*public K_ListarProductos(B_RegistroPrincipal I)
    {
        Fridge=I;
        initComponents();
        jList1.addElement(J_AgregarProducto.uno.Nombre);  
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListadoProductos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        FondoListar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(0, 102, 102));
        Menu.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        Menu.setForeground(new java.awt.Color(255, 255, 255));
        Menu.setText("Menú");
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });
        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 150, 53));

        ListadoProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre del PRODUCTO", "Fecha de INTRODUCCIÓN", "Fecha de CADUCIDAD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(ListadoProductos);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 117));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LISTA DE PRODUCTOS AGREGADOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 20));
        getContentPane().add(FondoListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        // TODO add your handling code here:
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuActionPerformed

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
            java.util.logging.Logger.getLogger(K_ListarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(K_ListarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(K_ListarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(K_ListarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new K_ListarProductos().setVisible(true);
                
                
            }
        });
    }
 /*try {
                    new K_ListarProductos().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(K_ListarProductos.class.getName()).log(Level.SEVERE, null, ex);
                }*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoListar;
    private javax.swing.JTable ListadoProductos;
    private javax.swing.JButton Menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
 B_RegistroPrincipal SFC_JEVG;
I_Menu menu;
            
    public void setB_RegistroPrincipal(B_RegistroPrincipal i)
    {
        SFC_JEVG = i;
    }   
    public void setI_Menu(I_Menu m)
    {
        menu=m;
    } 
    
    public void mostrar()
    {
        
    }
    
    
    /*B_RegistroPrincipal Fridge;
 I_Menu menu;
    
 public String[] getProductos()
 {
        int i;
        String Productos[];
        Productos=new String[Fridge.ObtenerNumProducto()];
        for(i=0;i<Productos.length;i++)
        {
            Productos[i]=Fridge.ObtenerProducto(i).ObtenerNombre();
        }
        return Productos;
}

 public DefaultListModel LimpiarList()
 {
    DefaultListModel modelo = new DefaultListModel();  
    modelo="";
    return modelo;
 }
    public void setI_Menu(I_Menu m)
    {
        menu=m;
    }*/
}
