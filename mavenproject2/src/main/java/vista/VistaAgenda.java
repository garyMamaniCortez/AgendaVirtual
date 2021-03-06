package vista;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.ListModel;
import modelo.Cita;
import javax.swing.*;
import modelo.*;
import Notificaciones.Notificacion;
/**
 *
 * @author Sergio Garcia
 */
public class VistaAgenda extends javax.swing.JFrame {
    //Requiere de agenda para poder mostrar las citas que se encuentran en ella.
    private Agenda agenda;
    private Notificacion notificacion;
    //Constructor de VistaAgenda.
    public VistaAgenda(Agenda agenda){
        initComponents();
        this.agenda = agenda;
        this.setResizable(false);
        actualizarCitas();
        this.setLocationRelativeTo(null);
        mouseListener();
        notificacion = new Notificacion();
        //setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Nova_Code_Team.png/")).getImage());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaCitas = new javax.swing.JList();
        aniadirCita = new javax.swing.JButton();
        eliminarCita = new javax.swing.JButton();
        botonAtras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listaCitas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        listaCitas.setToolTipText("");
        listaCitas.setVerifyInputWhenFocusTarget(false);
        listaCitas.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                listaCitasComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(listaCitas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 73, 319, 289));

        aniadirCita.setBackground(new java.awt.Color(255, 255, 255));
        aniadirCita.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        aniadirCita.setText("Añadir cita");
        aniadirCita.setBorder(null);
        aniadirCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aniadirCitaActionPerformed(evt);
            }
        });
        jPanel1.add(aniadirCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 140, 50));

        eliminarCita.setBackground(new java.awt.Color(255, 255, 255));
        eliminarCita.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        eliminarCita.setText("Eliminar cita");
        eliminarCita.setBorder(null);
        eliminarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarCitaActionPerformed(evt);
            }
        });
        jPanel1.add(eliminarCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 140, 50));

        botonAtras.setBackground(new java.awt.Color(148, 173, 177));
        botonAtras.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonAtras.setForeground(new java.awt.Color(255, 255, 255));
        botonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
        botonAtras.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 2, new java.awt.Color(255, 255, 255)));
        botonAtras.setPreferredSize(new java.awt.Dimension(43, 22));
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(botonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("AGENDA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 280, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/panel.png"))); // NOI18N
        jLabel4.setToolTipText("");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 560, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpeg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Abre una nueva ventana CrearCita.
    private void aniadirCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aniadirCitaActionPerformed
        CrearCita crearCita = new CrearCita(agenda);
        crearCita.setVisible(true);
        VistaAgenda padre = this;
        crearCita.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                padre.setVisible(true);
                padre.actualizarCitas();
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_aniadirCitaActionPerformed
    //Cierra la ventana
    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void listaCitasComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_listaCitasComponentShown

    }//GEN-LAST:event_listaCitasComponentShown
    //Elimina la cita seleccionada en la lista(JList)
    private void eliminarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarCitaActionPerformed
        Object [] botones = {"  SI  ","  NO  "};
        if(agenda.getListaCitas().tamanio() == 0){
            notificacion.NotificacionEscrita("Cita","No tiene citas guardadas","/Iconos/Advertencia.png");
        }else{
            int index = notificacion.notificacionBotones("¿ Esta seguro que quiere eliminar la cita ?","Eliminar cita", botones,"/Iconos/Negacion.png");
            if(index == 0){
                int pos = listaCitas.getSelectedIndex();
                Cita eliminada = (Cita)agenda.getListaCitas().acceder(pos); 
                if(eliminada.getAlarma() != null){
                    eliminada.apagarAlarma();
                }
                agenda.getListaCitas().eliminar(pos); 
                actualizarCitas();
            }
        }
    }//GEN-LAST:event_eliminarCitaActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aniadirCita;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton eliminarCita;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaCitas;
    // End of variables declaration//GEN-END:variables
    //Actualiza la lista(Jlist) cada vez que se elimina o se guarda las citas
    private void actualizarCitas(){
        DefaultListModel modeloLista = new DefaultListModel();
        for(int i = 0; i < agenda.getListaCitas().tamanio() ; i++){
            Cita nueva = (Cita)agenda.getListaCitas().acceder(i);
            modeloLista.addElement(nueva);
        }
        listaCitas.setModel(modeloLista);//le hace set
        listaCitas.updateUI();//sube la lista al jList
    }
    //Metodo auxiliar para poder acceder a la ventana mostrarCita de la cita seleccionada
    private void mouseListener() {
        VistaAgenda padre = this;
        listaCitas.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                JList list = (JList) evt.getSource();
                if (evt.getClickCount() == 2) { // Doble Click
                    int index = list.locationToIndex(evt.getPoint()); // retorna la posicion del elemento seleccionado
                    mostrarCita mostrar = new mostrarCita((Cita) agenda.getListaCitas().acceder(index), padre,agenda.getListaCitas());
                    mostrar.setVisible(true);
                    mostrar.addWindowListener(new WindowAdapter() {
                        public void windowClosed(WindowEvent e) {
                            padre.setVisible(true);
                            padre.actualizarCitas();
                        }
                    });
                    padre.setVisible(false);
                }
            }
        });
    }
}
