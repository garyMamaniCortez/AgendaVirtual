package vista;
import edl.ListaSE;
import Notificaciones.Notificacion;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import modelo.*;
/**
 *
 * @author luis
 */
public class VentanaVerContacto extends javax.swing.JFrame {
    /**
     * Creates new form VentanaVerContacto
     */
    private ListaSE<Contacto> listaContactos;
    private int n;
    private Contacto contacto;
    public VentanaVerContacto(ListaSE<Contacto> listaContactos,int n){
        initComponents();
        this.n = n;
        this.listaContactos = listaContactos;
        this.contacto = this.listaContactos.acceder(n);
        txtnombre.setText(contacto.getNombre());
        txtapellido.setText(contacto.getApellido());
        txtfijo.setText(contacto.getFijo());
        txtcelular.setText(contacto.getCelular());
        txtcorreo.setText(contacto.getCorreo());
        txtdireccion.setText(contacto.getDireccion());
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

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JLabel();
        txtapellido = new javax.swing.JLabel();
        txtfijo = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtcelular = new javax.swing.JLabel();
        editar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(149, 173, 177));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 2, new java.awt.Color(255, 255, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Apellido:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Telefojono: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Correo:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Direccion:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        txtnombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtnombre.setText("\"nombre\"");
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 360, -1));

        txtapellido.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtapellido.setText("\"apellido\"");
        getContentPane().add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 360, -1));

        txtfijo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtfijo.setText("\"fijo\"");
        getContentPane().add(txtfijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 100, -1));

        txtcorreo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtcorreo.setText("\"correo\"");
        getContentPane().add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 360, -1));

        txtdireccion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtdireccion.setText("\"direccion\"");
        getContentPane().add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 180, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Celular:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));

        txtcelular.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtcelular.setText("\"celular\"");
        getContentPane().add(txtcelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 150, -1));

        editar.setBackground(new java.awt.Color(255, 255, 255));
        editar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        editar.setText("Editar");
        editar.setBorder(null);
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });
        getContentPane().add(editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 150, 50));

        Eliminar.setBackground(new java.awt.Color(255, 255, 255));
        Eliminar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.setBorder(null);
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 150, 50));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("CONTACTOS");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 330, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/panel.png"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 0, new java.awt.Color(255, 255, 255)));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 560, 50));
        jLabel7.getAccessibleContext().setAccessibleDescription("");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        Object[] botones = {" Si "," No "}; 
        Notificacion m = new Notificacion();
        int res = m.notificacionBotones("¿Esta seguro de querer elminar el contacto?", "Eliminar", botones, "/Iconos/Advertencia.png");
        if(res == 0){
            listaContactos.eliminar(n);
            this.dispose();
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        ec ec = new ec(contacto);
        ec.setVisible(true);
        VentanaVerContacto padre = this;
        ec.addWindowListener(new WindowAdapter() {
                public void windowClosed(WindowEvent e) {
                    padre.dispose();
                    //padre.setVisible(true);
                }
            });
        this.setVisible(false);
    }//GEN-LAST:event_editarActionPerformed
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(VentanaVerContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VentanaVerContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VentanaVerContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VentanaVerContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VentanaVerContacto().setVisible(true);
//            }
//        });
//    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton editar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel txtapellido;
    private javax.swing.JLabel txtcelular;
    private javax.swing.JLabel txtcorreo;
    private javax.swing.JLabel txtdireccion;
    private javax.swing.JLabel txtfijo;
    private javax.swing.JLabel txtnombre;
    // End of variables declaration//GEN-END:variables
}