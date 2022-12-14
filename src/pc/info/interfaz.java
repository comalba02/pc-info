/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc.info;

import java.awt.Color;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class interfaz extends javax.swing.JFrame {

    /**
     * Creates new form interfaz
     */
    int x, y;

    public interfaz() {
        initComponents();
        setSize(650, 393);
        setBackground(new Color(0, 0, 0, 0));
        setLocationRelativeTo(null);

        //Obtener nombre y direccion Ip del equipo
        InetAddress direccion;
        try {
            direccion = InetAddress.getLocalHost();
            txt_nombrePC.setText( direccion.getHostName() );
            txt_ip.setText( direccion.getHostAddress() );
        } catch (UnknownHostException ex) {
            Logger.getLogger(PcInfo.class.getName()).log(Level.SEVERE, null, ex);
        }

        //sistema operativo
        String sistema = System.getProperty("os.name");
        txt_sistema.setText(sistema);
        
        //arquitectura
        String arquitectura = System.getProperty("os.arch");
        if ( arquitectura.contains("64") || arquitectura.contains("amd") ) {
            txt_arquitectura.setText("64 Bits");
        }
        else{
            txt_arquitectura.setText("32 Bits");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_cerrar = new javax.swing.JButton();
        txt_nombrePC = new javax.swing.JTextField();
        txt_ip = new javax.swing.JTextField();
        txt_sistema = new javax.swing.JTextField();
        txt_arquitectura = new javax.swing.JTextField();
        lbl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(null);

        btn_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pc/info/img/cerrar.png"))); // NOI18N
        btn_cerrar.setBorderPainted(false);
        btn_cerrar.setContentAreaFilled(false);
        btn_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cerrar.setFocusPainted(false);
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cerrar);
        btn_cerrar.setBounds(583, 22, 30, 30);

        txt_nombrePC.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
        txt_nombrePC.setBorder(null);
        txt_nombrePC.setOpaque(false);
        getContentPane().add(txt_nombrePC);
        txt_nombrePC.setBounds(340, 75, 220, 30);

        txt_ip.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
        txt_ip.setBorder(null);
        txt_ip.setOpaque(false);
        getContentPane().add(txt_ip);
        txt_ip.setBounds(340, 149, 220, 30);

        txt_sistema.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
        txt_sistema.setBorder(null);
        txt_sistema.setOpaque(false);
        getContentPane().add(txt_sistema);
        txt_sistema.setBounds(340, 231, 220, 30);

        txt_arquitectura.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
        txt_arquitectura.setBorder(null);
        txt_arquitectura.setOpaque(false);
        getContentPane().add(txt_arquitectura);
        txt_arquitectura.setBounds(340, 307, 220, 30);

        lbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pc/info/img/fondo.png"))); // NOI18N
        getContentPane().add(lbl_fondo);
        lbl_fondo.setBounds(0, 0, 670, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_cerrarActionPerformed

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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JLabel lbl_fondo;
    private javax.swing.JTextField txt_arquitectura;
    private javax.swing.JTextField txt_ip;
    private javax.swing.JTextField txt_nombrePC;
    private javax.swing.JTextField txt_sistema;
    // End of variables declaration//GEN-END:variables
}
