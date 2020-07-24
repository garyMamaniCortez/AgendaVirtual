package vista;

import edl.ListaSE;
//import java.awt.event.*;
//import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
//import javax.swing.JOptionPane;
import modelo.*;
import Notificaciones.Notificacion;
/**
 *
 * @author Luis
 */
public class vcs extends javax.swing.JFrame {

    private ListaSE listaContactos;
    private Notificacion notificacion;
    public vcs(ListaSE listaContactos) {
        initComponents();
        this.listaContactos = listaContactos;
        this.setLocationRelativeTo(null);
        addContacts();
        notificacion = new Notificacion();
    }

    /**
     * This method is called from within the constructor to initialize the
     * form.WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     *
     * @param data
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlistcontactos = new javax.swing.JList<String>();
        añadir = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(149, 173, 177));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 2, new java.awt.Color(255, 255, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jlistcontactos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jlistcontactos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlistcontactos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlistcontactosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jlistcontactos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 300, 250));

        añadir.setBackground(new java.awt.Color(255, 255, 255));
        añadir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        añadir.setText("Añadir");
        añadir.setBorder(null);
        añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirActionPerformed(evt);
            }
        });
        getContentPane().add(añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 150, 50));

        Eliminar.setBackground(new java.awt.Color(255, 255, 255));
        Eliminar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.setBorder(null);
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 150, 50));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONTACTOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 280, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/panel.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 0, new java.awt.Color(255, 255, 255)));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 560, 50));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 610, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        /*if (JOptionPane.showConfirmDialog(null, "¿Eliminar?", "WARNING",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            int n = jlistcontactos.getSelectedIndex();
            listaContactos.eliminar(n);
            addContacts();
        } else {    // no option
        }*/
        Object [] botones = {"  SI  ","  NO  "};
        int res  = notificacion.notificacionBotones("¿ Eliminar ?","Advertencia", botones,"/Iconos/Negacion.png");
        if (res  == 0) {
            int n = jlistcontactos.getSelectedIndex();
            listaContactos.eliminar(n);
            addContacts();
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirActionPerformed
        VentanaContacto vc = new VentanaContacto(listaContactos);
        vc.setVisible(true);
        vcs padre = this;
        vc.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                padre.setVisible(true);
                padre.addContacts();
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_añadirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose(); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jlistcontactosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlistcontactosMouseClicked
        JList list = (JList) evt.getSource();
        if (evt.getClickCount() == 2) {
            int index = list.locationToIndex(evt.getPoint());
            int n = jlistcontactos.getSelectedIndex();
                VentanaVerContacto vc = new VentanaVerContacto(listaContactos,n);
                vc.setVisible(true);
                vcs padre = this;
                vc.addWindowListener(new WindowAdapter() {
                    public void windowClosed(WindowEvent e) {
                        padre.setVisible(true);
                        padre.addContacts();
                    }
                });
                this.setVisible(false);
        }
    }//GEN-LAST:event_jlistcontactosMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton añadir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> jlistcontactos;
    // End of variables declaration//GEN-END:variables

    private void addContacts() {
        DefaultListModel modeloLista = new DefaultListModel();
        for (int i = 0; i < listaContactos.tamanio(); i++) {
            Contacto nuevo = (Contacto) listaContactos.acceder(i);
            modeloLista.addElement(nuevo);
        }
        jlistcontactos.setModel(modeloLista);//le hace sett
        jlistcontactos.updateUI();//sube la lista al jList

    }
}
