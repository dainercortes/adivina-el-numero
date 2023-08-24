/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.adivinanumero.diseno;

import com.adivinanumero.logica.LogicaJuego;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author dainer
 */
public class JuegoPrincipal extends javax.swing.JFrame {

    //Instancia de objetos  
    private int puntosJugador = 0;
    private int vidaJugador = 3;
    private LogicaJuego log = new LogicaJuego(); 
    private List<Integer> numeros = new  ArrayList<Integer>();

    /**
     * Creates new form JuegoPrincipal
     */
    public JuegoPrincipal() {      
        initComponents();
        
        this.anadirNumeros();
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
        jbtn1 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jlbl_C3 = new javax.swing.JLabel();
        jlbl_C2 = new javax.swing.JLabel();
        jlbl_C1 = new javax.swing.JLabel();
        jlbl_puntos = new javax.swing.JLabel();
        jbtn_menu = new javax.swing.JButton();
        jbtn_pista = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);
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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 30));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtn1.setBackground(new java.awt.Color(135, 206, 235));
        jbtn1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtn1.setForeground(new java.awt.Color(255, 255, 255));
        jbtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jbtn1.setContentAreaFilled(false);
        jbtn1.setFocusPainted(false);
        jbtn1.setFocusable(false);
        jbtn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn1.setPreferredSize(new java.awt.Dimension(100, 100));
        jbtn1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/botonLargo.png"))); // NOI18N
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jbtn2.setBackground(new java.awt.Color(135, 206, 235));
        jbtn2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtn2.setForeground(new java.awt.Color(255, 255, 255));
        jbtn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jbtn2.setContentAreaFilled(false);
        jbtn2.setFocusPainted(false);
        jbtn2.setFocusable(false);
        jbtn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn2.setPreferredSize(new java.awt.Dimension(100, 100));
        jbtn2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/botonLargo.png"))); // NOI18N
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        jbtn3.setBackground(new java.awt.Color(135, 206, 235));
        jbtn3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtn3.setForeground(new java.awt.Color(255, 255, 255));
        jbtn3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jbtn3.setContentAreaFilled(false);
        jbtn3.setFocusPainted(false);
        jbtn3.setFocusable(false);
        jbtn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn3.setPreferredSize(new java.awt.Dimension(100, 100));
        jbtn3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/botonLargo.png"))); // NOI18N
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        jbtn4.setBackground(new java.awt.Color(135, 206, 235));
        jbtn4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtn4.setForeground(new java.awt.Color(255, 255, 255));
        jbtn4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jbtn4.setContentAreaFilled(false);
        jbtn4.setFocusPainted(false);
        jbtn4.setFocusable(false);
        jbtn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn4.setPreferredSize(new java.awt.Dimension(100, 100));
        jbtn4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/botonLargo.png"))); // NOI18N
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jbtn5.setBackground(new java.awt.Color(135, 206, 235));
        jbtn5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtn5.setForeground(new java.awt.Color(255, 255, 255));
        jbtn5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jbtn5.setContentAreaFilled(false);
        jbtn5.setFocusPainted(false);
        jbtn5.setFocusable(false);
        jbtn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn5.setPreferredSize(new java.awt.Dimension(100, 100));
        jbtn5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/botonLargo.png"))); // NOI18N
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        jbtn6.setBackground(new java.awt.Color(135, 206, 235));
        jbtn6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtn6.setForeground(new java.awt.Color(255, 255, 255));
        jbtn6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jbtn6.setContentAreaFilled(false);
        jbtn6.setFocusPainted(false);
        jbtn6.setFocusable(false);
        jbtn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn6.setPreferredSize(new java.awt.Dimension(100, 100));
        jbtn6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/botonLargo.png"))); // NOI18N
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        jbtn9.setBackground(new java.awt.Color(135, 206, 235));
        jbtn9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtn9.setForeground(new java.awt.Color(255, 255, 255));
        jbtn9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jbtn9.setContentAreaFilled(false);
        jbtn9.setFocusPainted(false);
        jbtn9.setFocusable(false);
        jbtn9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn9.setPreferredSize(new java.awt.Dimension(100, 100));
        jbtn9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/botonLargo.png"))); // NOI18N
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        jbtn8.setBackground(new java.awt.Color(135, 206, 235));
        jbtn8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtn8.setForeground(new java.awt.Color(255, 255, 255));
        jbtn8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jbtn8.setContentAreaFilled(false);
        jbtn8.setFocusPainted(false);
        jbtn8.setFocusable(false);
        jbtn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn8.setPreferredSize(new java.awt.Dimension(100, 100));
        jbtn8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/botonLargo.png"))); // NOI18N
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));

        jbtn7.setBackground(new java.awt.Color(135, 206, 235));
        jbtn7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jbtn7.setForeground(new java.awt.Color(255, 255, 255));
        jbtn7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jbtn7.setContentAreaFilled(false);
        jbtn7.setFocusPainted(false);
        jbtn7.setFocusable(false);
        jbtn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn7.setPreferredSize(new java.awt.Dimension(100, 100));
        jbtn7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/botonLargo.png"))); // NOI18N
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jlbl_C3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/corazon.png"))); // NOI18N
        jPanel2.add(jlbl_C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 30, 30));

        jlbl_C2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/corazon.png"))); // NOI18N
        jPanel2.add(jlbl_C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 30, 30));

        jlbl_C1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/corazon.png"))); // NOI18N
        jPanel2.add(jlbl_C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 30, 30));

        jlbl_puntos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_puntos.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_puntos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl_puntos.setText("Puntos: 0");
        jPanel2.add(jlbl_puntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 140, -1));

        jbtn_menu.setBackground(new java.awt.Color(135, 206, 235));
        jbtn_menu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtn_menu.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_menu.setText("Regresar");
        jbtn_menu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jbtn_menu.setContentAreaFilled(false);
        jbtn_menu.setFocusPainted(false);
        jbtn_menu.setFocusable(false);
        jbtn_menu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn_menu.setPreferredSize(new java.awt.Dimension(100, 100));
        jbtn_menu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/botonLargo.png"))); // NOI18N
        jbtn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_menuActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 140, 60));

        jbtn_pista.setBackground(new java.awt.Color(135, 206, 235));
        jbtn_pista.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtn_pista.setForeground(new java.awt.Color(135, 206, 235));
        jbtn_pista.setText("Pista");
        jbtn_pista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(135, 206, 235)));
        jbtn_pista.setContentAreaFilled(false);
        jbtn_pista.setFocusPainted(false);
        jbtn_pista.setFocusable(false);
        jbtn_pista.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn_pista.setPreferredSize(new java.awt.Dimension(100, 100));
        jbtn_pista.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/botonLargo2.png"))); // NOI18N
        jbtn_pista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_pistaActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn_pista, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 140, 60));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Adivina el número");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 570, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_menuActionPerformed
        Home hm = new Home();
        hm.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jbtn_menuActionPerformed

    private void jbtn_pistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_pistaActionPerformed
        MensajePistaNumero msjp = new MensajePistaNumero(this, true, numeros.get(log.getNumeroSistema()));
        msjp.setVisible(true);
    }//GEN-LAST:event_jbtn_pistaActionPerformed

    private void jlbl_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl_cerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jlbl_cerrarMouseClicked
   
    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
        this.validarEleccion(Integer.parseInt(this.jbtn1.getText()));
    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
        this.validarEleccion(Integer.parseInt(this.jbtn2.getText()));
    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed
        this.validarEleccion(Integer.parseInt(this.jbtn3.getText()));
    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4ActionPerformed
        this.validarEleccion(Integer.parseInt(this.jbtn4.getText()));
    }//GEN-LAST:event_jbtn4ActionPerformed

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn5ActionPerformed
        this.validarEleccion(Integer.parseInt(this.jbtn5.getText()));
    }//GEN-LAST:event_jbtn5ActionPerformed

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn6ActionPerformed
        this.validarEleccion(Integer.parseInt(this.jbtn6.getText()));
    }//GEN-LAST:event_jbtn6ActionPerformed

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
        this.validarEleccion(Integer.parseInt(this.jbtn7.getText()));
    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn8ActionPerformed
        this.validarEleccion(Integer.parseInt(this.jbtn8.getText()));
    }//GEN-LAST:event_jbtn8ActionPerformed

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn9ActionPerformed
        this.validarEleccion(Integer.parseInt(this.jbtn9.getText()));
    }//GEN-LAST:event_jbtn9ActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        FiveCodMover.FiveCodMoverJFrame.MousePressed(evt);
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        FiveCodMover.FiveCodMoverJFrame.MouseDraggedFrame(evt, this);
    }//GEN-LAST:event_formMouseDragged

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
            java.util.logging.Logger.getLogger(JuegoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JuegoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JuegoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuegoPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JuegoPrincipal().setVisible(true);
            }
        });
    }

    // ----- Metodos creados por Dainer -----
    
    private void ReiniciarJuego() {
        puntosJugador = 0;
        vidaJugador = 3;
        numeros = null;     
        this.anadirNumeros();
        this.jlbl_puntos.setText("Puntos: 0");
        for(JLabel lbl : getLabels()) {
            lbl.setIcon(new ImageIcon(getClass().getResource("/com/img/corazon.png")));
        }    
    }
    
    private void anadirNumeros() {
        try {
            log.generarNumeros(9, 1, 30);
            this.numeros = log.OrdenarNumeros();
            
            jbtn1.setText(Integer.toString(numeros.get(0)));
            jbtn2.setText(Integer.toString(numeros.get(1)));
            jbtn3.setText(Integer.toString(numeros.get(2)));
            jbtn4.setText(Integer.toString(numeros.get(3)));
            jbtn5.setText(Integer.toString(numeros.get(4)));
            jbtn6.setText(Integer.toString(numeros.get(5)));
            jbtn7.setText(Integer.toString(numeros.get(6)));
            jbtn8.setText(Integer.toString(numeros.get(7)));
            jbtn9.setText(Integer.toString(numeros.get(8))); 
        
        } catch (Exception e) {
            e.getMessage();
        }
    }
    
    private JLabel[] getLabels() {
        JLabel[] jlbl = { this.jlbl_C1, this.jlbl_C2, this.jlbl_C3 };
        
        return jlbl;
    }
    
    private void validarEleccion(int miNum) {
        
        System.out.println("asdf----------------");
        System.out.println(Integer.toString(numeros.get(log.getNumeroSistema())));
                  
        try {        
            if(miNum == numeros.get(log.getNumeroSistema())) {
                
                puntosJugador += 100;
                this.jlbl_puntos.setText("Puntos: " + puntosJugador);
                new MensajeGameOver(this, this, true, "Ganaste", "Continuar").setVisible(true);
                log.generarNumeroSistema();
                this.anadirNumeros(); 
            } else {
                getLabels()[vidaJugador - 1].setIcon(new ImageIcon(getClass().getResource("/com/img/corazonVacio.png")));
                vidaJugador--;                     
                
                if(vidaJugador <= 0) {
                    new MensajeGameOver(this, this, true, "Perdiste", "Jugar de nuevo").setVisible(true);
                    log.generarNumeroSistema();
                    this.ReiniciarJuego();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtn_menu;
    private javax.swing.JButton jbtn_pista;
    private javax.swing.JLabel jlbl_C1;
    private javax.swing.JLabel jlbl_C2;
    private javax.swing.JLabel jlbl_C3;
    private javax.swing.JLabel jlbl_cerrar;
    private javax.swing.JLabel jlbl_puntos;
    // End of variables declaration//GEN-END:variables
}