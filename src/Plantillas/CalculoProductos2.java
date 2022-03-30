/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plantillas;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CalculoProductos2 extends javax.swing.JFrame {
  static double acum=0; static int resp;
  static float pacl,cam; 
 
    public  CalculoProductos2() {
        initComponents();
        setLocationRelativeTo(this);
        this.setTitle("Cafeteria La Fuente: Calculo de Productos");
        this.setLocation(400,200);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTFnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFtotalcompra = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFcostopro = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/hola.jpg")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Kristen ITC", 0, 16)); // NOI18N
        jLabel2.setText("Ingresa el costo por producto:  $");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jTFnombre.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        getContentPane().add(jTFnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 390, 30));

        jLabel3.setFont(new java.awt.Font("Kristen ITC", 0, 16)); // NOI18N
        jLabel3.setText("Ingresa el nombre del producto:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jTFtotalcompra.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        getContentPane().add(jTFtotalcompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 70, 40));

        jLabel4.setFont(new java.awt.Font("Kristen ITC", 0, 16)); // NOI18N
        jLabel4.setText("Ingresa el total de que se vendio:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jTFcostopro.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        getContentPane().add(jTFcostopro, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 60, 40));

        jButton1.setFont(new java.awt.Font("HelloPicasso", 1, 16)); // NOI18N
        jButton1.setText("Calcular Total del producto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        jButton2.setFont(new java.awt.Font("HelloPicasso", 1, 16)); // NOI18N
        jButton2.setText("Borrar registro");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/99.png"))); // NOI18N
        Fondo.setText("jLabel1");
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -70, 470, 410));

        jMenu1.setText("Inicio");
        jMenu1.setToolTipText("");

        jMenuItem1.setText("Calcular registro");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Borrar registros");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");

        jMenuItem3.setText("Regresar al menu");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Regresar a Iniciar Sesion");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Salir Programa");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
       
        
       String nom=jTFnombre.getText();
        double tp = Double.parseDouble(jTFtotalcompra.getText());
        double cost = Double.parseDouble(jTFcostopro.getText());
       double tpa = tp*cost;
        acum=acum+tpa;
        JOptionPane.showMessageDialog(null,"El pago por los "+nom+"s es: $"+tpa);
        resp=Integer.parseInt(JOptionPane.showInputDialog("El cliente pidio otro producto:\nSi = 1\nNo = 2\n"
                + "Escriba el numero:"));
                 
         if(resp==1) {
             jTFcostopro.setText("0");
       jTFnombre.setText("");
       jTFtotalcompra.setText("0");
              CalculoProductos2 reiniciar=new CalculoProductos2();
         }else{
        JOptionPane.showMessageDialog(null,"El total a pagar es: $"+acum);
           pacl=Float.parseFloat(JOptionPane.showInputDialog("Escriba la cantidad que pago el cliente: "));
           cam=(float) (pacl-acum);
           JOptionPane.showMessageDialog(null,"El total a regresar al cliente es: $"+cam);
         MenuPrincipal abrirmenu= new MenuPrincipal();
        abrirmenu.setVisible(true);
        dispose();
         }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTFcostopro.setText("0");
       jTFnombre.setText("");
       jTFtotalcompra.setText("0");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
      MenuPrincipal abrirmenu= new MenuPrincipal();
        abrirmenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
      Inicio abrirmenu= new Inicio();
        abrirmenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
                                                  
     
        
       String nom=jTFnombre.getText();
        double tp = Double.parseDouble(jTFtotalcompra.getText());
        double cost = Double.parseDouble(jTFcostopro.getText());
       double tpa = tp*cost;
        acum=acum+tpa;
        JOptionPane.showMessageDialog(null,"El pago por los "+nom+"s es: $"+tpa);
        resp=Integer.parseInt(JOptionPane.showInputDialog("El cliente pidio otro producto: \nSi = 1\nNo = 2\n"
                + "Escriba el numero:"));
                 
         if(resp==1) {
             jTFcostopro.setText("0");
       jTFnombre.setText("");
       jTFtotalcompra.setText("0");
              CalculoProductos2 reiniciar=new CalculoProductos2();
         }else{
        JOptionPane.showMessageDialog(null,"El total a pagar es: $"+acum);
           pacl=Float.parseFloat(JOptionPane.showInputDialog("Escriba la cantidad que pago el cliente: "));
           cam=(float) (pacl-acum);
           JOptionPane.showMessageDialog(null,"El total a regresar al cliente es: $"+cam);
        MenuPrincipal abrirmenu= new MenuPrincipal();
        abrirmenu.setVisible(true);
        dispose();
         }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

 
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(CalculoProductos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculoProductos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculoProductos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculoProductos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

     
        java.awt.EventQueue.invokeLater(new Runnable() {
           
            public void run() {
                new CalculoProductos2().setVisible(true);
          
            }
        }
        );      
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JTextField jTFcostopro;
    private javax.swing.JTextField jTFnombre;
    private javax.swing.JTextField jTFtotalcompra;
    // End of variables declaration//GEN-END:variables
}
