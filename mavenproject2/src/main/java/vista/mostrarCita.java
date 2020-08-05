/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import modelo.*;
import java.util.*;
import Notificaciones.Notificacion;
import edl.ListaSE;
import java.text.SimpleDateFormat;

/**
 *
 * @author Nath
 */
public class mostrarCita extends javax.swing.JFrame {

    /**
     * Creates new form mostrarCita
     */
    public Cita cita;
    private VistaAgenda padre;
    private Notificacion notificacion;
    private ListaSE<Cita> listaCitas;
    public mostrarCita(Cita cita, VistaAgenda padre,ListaSE<Cita> listaCitas) {
        this.padre = padre;
        this.cita = cita;
        this.listaCitas = listaCitas;
        initComponents();
        this.setLocationRelativeTo(null);
        if (cita.getAsunto() != null) {
            this.setAsunto(cita.getAsunto());
        }
        if (cita.getNota() != null) {
            this.setNota(cita.getNota());
        }
        if (cita.getDuracion() != 0) {
            String duracion = cita.toString(cita.getDuracion());
            contDuracion.setText(duracion);
        }
        if (cita.getHoraFecha() != null) {
            setFechaHora(cita.getHoraFecha()); 
        }
        setTextoBotonAlarma();
        this.setVisible(true);
        notificacion = new Notificacion();
    
    }
    public void setTextoBotonAlarma(){
        if(cita.getAlarma() == null){
            contAlarma.setText("Desactivada"); 
        }else{
            if(cita.getAlarma().getActivo()){
                contAlarma.setText("Activada"); 
            }else{
                contAlarma.setText("Desactivada"); 
            }        
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botonEditar = new javax.swing.JButton();
        botonAtras = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contNota = new javax.swing.JTextArea();
        contDuracion = new javax.swing.JTextField();
        contHora = new javax.swing.JTextField();
        contAsunto = new javax.swing.JTextField();
        contFecha = new javax.swing.JTextField();
        contAlarma = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Alarma :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Fecha:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Asunto:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Hora:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 40, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Duracion:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("minutos.");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, -1, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Nota:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        botonEditar.setBackground(new java.awt.Color(255, 255, 255));
        botonEditar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botonEditar.setText("Editar");
        botonEditar.setBorder(null);
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });
        getContentPane().add(botonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 150, 50));

        botonAtras.setBackground(new java.awt.Color(149, 173, 177));
        botonAtras.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        botonAtras.setForeground(new java.awt.Color(255, 255, 255));
        botonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
        botonAtras.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 2, new java.awt.Color(255, 255, 255)));
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(botonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        botonEliminar.setBackground(new java.awt.Color(255, 255, 255));
        botonEliminar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.setBorder(null);
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 150, 50));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("MOSTRAR CITA");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 280, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/panel.png"))); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 0, new java.awt.Color(255, 255, 255)));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 560, 50));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        contNota.setEditable(false);
        contNota.setColumns(20);
        contNota.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        contNota.setRows(5);
        jScrollPane1.setViewportView(contNota);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 226, 440, 70));

        contDuracion.setEditable(false);
        contDuracion.setBackground(new java.awt.Color(255, 255, 255));
        contDuracion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        contDuracion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contDuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contDuracionActionPerformed(evt);
            }
        });
        getContentPane().add(contDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 40, 30));

        contHora.setEditable(false);
        contHora.setBackground(new java.awt.Color(255, 255, 255));
        contHora.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        contHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contHoraActionPerformed(evt);
            }
        });
        getContentPane().add(contHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 250, 30));

        contAsunto.setEditable(false);
        contAsunto.setBackground(new java.awt.Color(255, 255, 255));
        contAsunto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(contAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 440, 30));

        contFecha.setEditable(false);
        contFecha.setBackground(new java.awt.Color(255, 255, 255));
        contFecha.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        contFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contFechaActionPerformed(evt);
            }
        });
        getContentPane().add(contFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 210, 30));

        contAlarma.setEditable(false);
        contAlarma.setBackground(new java.awt.Color(255, 255, 255));
        contAlarma.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        contAlarma.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(contAlarma, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 130, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpeg"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        //padre.setVisible(true); //solo se vuelven invisibles las ventanas
        this.dispose();
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        System.out.println("indice de la musica : "+cita.getIndiceMus()+" indice de los minutos de anticipacion : "+cita.getIndiceMin());
        editarCita edit = new editarCita(this, cita);
        edit.setNota(cita.getNota());
        edit.setAsunto(cita.getAsunto());
        edit.setVisible(true);   
        mostrarCita padree = this;
        edit.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                padree.setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_botonEditarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        Object [] botones = {"  SI  ","  NO  "};
        int res = notificacion.notificacionBotones("¿ Esta seguro que quiere eliminar la cita ?","Eliminar cita", botones,"/Iconos/Negacion.png");       
        if (res == 0) {
            int aux = listaCitas.indexOf(cita);
            if(cita.getAlarma() != null){
                cita.apagarAlarma();
            }
            listaCitas.eliminar(aux);
            this.dispose();
            notificacion.NotificacionEscrita("Eliminado","La cita se elimino","/Iconos/Aprobacion.png");           
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void contDuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contDuracionActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_contDuracionActionPerformed

    private void contHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contHoraActionPerformed

    private void contFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contFechaActionPerformed

    /**
     * @param args the command line arguments
     */
    public void setAsunto(String p) {
        contAsunto.setText(p);
        cita.setAsunto(p);
    }

    public void setNota(String p) {
        contNota.setText(p);
        cita.setNota(p);
    }

    public void setDuracion(String p) {
        contDuracion.setText(p);
        int dur = Integer.parseInt(p);
        cita.setDuracion(dur);
    }

    /*public void setFecha(String d, String m, String a) {
        contFecha.setText(d + "/" + m + "/" + a);
    }*/

    /*public void setFecha(String p) {
        contFecha.setText(p);
    }*/

    /*public void setFecha(Date fecha) {
        cita.setFechaHora(fecha);
    }*/

    public void setFechaHora(Date fecha){
        cita.setFechaHora(fecha);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        contFecha.setText(sdf.format(fecha)); 
        sdf = new SimpleDateFormat("HH:mm  a");
        contHora.setText(sdf.format(fecha)); 
        cita.setFechaHora(fecha); 
    }

    /*public void setHora(String p) {
        contHora.setText(p);
    }*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JTextField contAlarma;
    private javax.swing.JTextField contAsunto;
    private javax.swing.JTextField contDuracion;
    private javax.swing.JTextField contFecha;
    private javax.swing.JTextField contHora;
    private javax.swing.JTextArea contNota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
