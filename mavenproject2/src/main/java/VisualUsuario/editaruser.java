/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VisualUsuario;

import Notificaciones.Notificacion;
import Usuario.User;
import javax.swing.ImageIcon;

/**
 *
 * @author Luis
 */
public class editaruser extends javax.swing.JFrame {

    /**
     * Creates new form editaruser
     */
    private User usuario;

    public editaruser(User usuario) {
        initComponents();
        this.usuario = usuario;
        mostrarUsuario();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Nova_Code_Team.png/")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombretxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        apellidotxt = new javax.swing.JTextField();
        correotxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        direcciontxt = new javax.swing.JTextField();
        celulartxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Guardar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombretxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(nombretxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 320, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Apellido:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        apellidotxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(apellidotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 320, -1));

        correotxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(correotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 320, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Correo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Direccion:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        direcciontxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(direcciontxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 320, -1));

        celulartxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(celulartxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 320, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Celular:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, 20));

        Guardar.setBackground(new java.awt.Color(255, 255, 255));
        Guardar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Guardar.setText("Guardar");
        Guardar.setBorder(null);
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 150, 50));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("EDITAR USUARIO");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 360, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/panel.png"))); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 0, new java.awt.Color(255, 255, 255)));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 560, 50));

        regresar.setBackground(new java.awt.Color(149, 173, 177));
        regresar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        regresar.setForeground(new java.awt.Color(255, 255, 255));
        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
        regresar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 2, new java.awt.Color(255, 255, 255)));
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpeg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        Notificacion notificacion = new Notificacion();
        Object[] botones = {"  SI  ", "  NO  "};
        int num = notificacion.notificacionBotones("¿Esta seguro de cambiar los datos del usuario?", "Guardar cambios", botones, "/Iconos/Interrogacion.png");
        if (num == 0) {
            usuario.setName(nombretxt.getText());
            usuario.setLastName(apellidotxt.getText());
            usuario.setCellPhone(celulartxt.getText());
            usuario.setEmail(correotxt.getText());
            usuario.setDirection(direcciontxt.getText());
            notificacion.NotificacionEscrita("Exito", "Se cambiaron los datos exitosamente", "/Iconos/Aprobacion.png");
            this.dispose();
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_regresarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField apellidotxt;
    private javax.swing.JTextField celulartxt;
    private javax.swing.JTextField correotxt;
    private javax.swing.JTextField direcciontxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nombretxt;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables

    private void mostrarUsuario() {
        nombretxt.setText(usuario.getName());
        apellidotxt.setText(usuario.getLastName());
        celulartxt.setText(usuario.getCellPhone());
        correotxt.setText(usuario.getEmail());
        direcciontxt.setText(usuario.getDirection());
    }
}
