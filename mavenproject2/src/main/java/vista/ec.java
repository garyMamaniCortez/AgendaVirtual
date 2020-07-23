/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import edl.ListaSE;
import javax.swing.JOptionPane;
import modelo.Contacto;

/**
 *
 * @author Luis
 */
public class ec extends javax.swing.JFrame {

    private ListaSE<Contacto> listaContactos;
    private int n;
    private Contacto contacto;

    /**
     * Creates new form ec
     */
    public ec(Contacto contacto) {
        initComponents();
        this.contacto = contacto;
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setSize(600, 400);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nombretxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        apellidotxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fijotxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        correotxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        direcciontxt = new javax.swing.JTextField();
        Guardar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        celulartxt = new javax.swing.JTextField();
        regresar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        nombretxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(nombretxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 320, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Apellido:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        apellidotxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(apellidotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 320, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Telefono fijo:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        fijotxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(fijotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 120, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Correo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        correotxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(correotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 320, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Direccion:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        direcciontxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(direcciontxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 320, -1));

        Guardar.setBackground(new java.awt.Color(172, 96, 100));
        Guardar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Guardar.setForeground(new java.awt.Color(255, 255, 255));
        Guardar.setText("Guardar");
        Guardar.setBorderPainted(false);
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 150, 50));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Celular:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, -1));

        celulartxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(celulartxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 130, -1));

        regresar.setBackground(new java.awt.Color(149, 173, 177));
        regresar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        regresar.setForeground(new java.awt.Color(255, 255, 255));
        regresar.setText("<");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jPanel1.setBackground(new java.awt.Color(80, 83, 98));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Editar Contacto");
        jPanel1.add(jLabel7, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 550, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        contacto.setApellido(apellidotxt.getText());
        contacto.setCelular(celulartxt.getText());
        contacto.setCorreo(correotxt.getText());
        contacto.setDireccion(direcciontxt.getText());
        contacto.setFijo(fijotxt.getText());
        contacto.setNombre(nombretxt.getText());
        this.dispose();
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
    private javax.swing.JTextField fijotxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombretxt;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}