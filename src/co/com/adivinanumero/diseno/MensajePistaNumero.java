/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package co.com.adivinanumero.diseno;

/**
 *
 * @author dainer
 */
public class MensajePistaNumero extends javax.swing.JDialog {

    /**
     * Creates new form MensajePistaNumero
     */
    public MensajePistaNumero(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        this.setLocationRelativeTo(null);
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
        jlbl_cerrar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jbtn_regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 270));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Harrington", 0, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 119, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("•");
        jLabel1.setToolTipText("");
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(22, 35));
        jLabel1.setMinimumSize(new java.awt.Dimension(22, 35));
        jLabel1.setPreferredSize(new java.awt.Dimension(22, 35));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 30, 30));

        jlbl_cerrar.setFont(new java.awt.Font("Harrington", 0, 55)); // NOI18N
        jlbl_cerrar.setForeground(new java.awt.Color(255, 0, 0));
        jlbl_cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl_cerrar.setText("•");
        jlbl_cerrar.setToolTipText("");
        jlbl_cerrar.setFocusable(false);
        jlbl_cerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlbl_cerrar.setMaximumSize(new java.awt.Dimension(22, 35));
        jlbl_cerrar.setMinimumSize(new java.awt.Dimension(22, 35));
        jlbl_cerrar.setPreferredSize(new java.awt.Dimension(22, 35));
        jlbl_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbl_cerrarMouseClicked(evt);
            }
        });
        jPanel1.add(jlbl_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        jPanel2.setBackground(new java.awt.Color(69, 69, 69));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("El número a adivinar es impar");
        jLabel5.setMaximumSize(new java.awt.Dimension(350, 32));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 40, 350, 40));

        jbtn_regresar.setBackground(new java.awt.Color(135, 206, 235));
        jbtn_regresar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtn_regresar.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_regresar.setText("Regresar");
        jbtn_regresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jbtn_regresar.setContentAreaFilled(false);
        jbtn_regresar.setFocusPainted(false);
        jbtn_regresar.setFocusable(false);
        jbtn_regresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn_regresar.setPreferredSize(new java.awt.Dimension(100, 100));
        jbtn_regresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonLargo.png"))); // NOI18N
        jbtn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_regresarActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 140, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlbl_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl_cerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jlbl_cerrarMouseClicked

    private void jbtn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_regresarActionPerformed
        Home ventana = new Home();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtn_regresarActionPerformed

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
            java.util.logging.Logger.getLogger(MensajePistaNumero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MensajePistaNumero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MensajePistaNumero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MensajePistaNumero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MensajePistaNumero dialog = new MensajePistaNumero(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtn_regresar;
    private javax.swing.JLabel jlbl_cerrar;
    // End of variables declaration//GEN-END:variables
}
