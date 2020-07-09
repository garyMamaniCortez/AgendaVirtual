/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import javax.swing.JOptionPane;
import modelo.*;
/**
 *
 * @author Nath
 */
public class mostrarCita extends javax.swing.JFrame {

    /**
     * Creates new form mostrarCita
     */
    public Cita cita;
    public mostrarCita(Cita cita) {
        initComponents();
        this.cita=cita;
        this.setLocationRelativeTo(null);
        if(cita.getAsunto()!=null){
        this.setAsunto(cita.getAsunto());
        }
        if(cita.getNota()!=null){
        this.setNota(cita.getNota());
        }
        if(cita.getDuracion()!=0){
        String duracion=cita.toString(cita.getDuracion());
        this.setDuracion(duracion);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botonEditar = new javax.swing.JButton();
        contFecha = new javax.swing.JLabel();
        contHora = new javax.swing.JLabel();
        botonAtras = new javax.swing.JButton();
        contAsunto = new javax.swing.JLabel();
        contNota = new javax.swing.JLabel();
        contDuracion = new javax.swing.JLabel();
        botonEliminar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(80, 83, 98));
        jPanel1.setPreferredSize(new java.awt.Dimension(460, 22));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel8.setBackground(new java.awt.Color(80, 83, 98));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("AGENDA");
        jPanel1.add(jLabel8, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 0, 550, 50));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Activar alarma:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Fecha:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Asunto:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Hora:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Duracion:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("minutos.");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Nota:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        botonEditar.setBackground(new java.awt.Color(172, 96, 100));
        botonEditar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        botonEditar.setForeground(new java.awt.Color(255, 255, 255));
        botonEditar.setText("Editar");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });
        getContentPane().add(botonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 150, 50));

        contFecha.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        contFecha.setPreferredSize(new java.awt.Dimension(22, 22));
        getContentPane().add(contFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 154, -1));

        contHora.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(contHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 164, 22));

        botonAtras.setBackground(new java.awt.Color(149, 173, 177));
        botonAtras.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        botonAtras.setForeground(new java.awt.Color(255, 255, 255));
        botonAtras.setText("<");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(botonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        contAsunto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(contAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 441, 22));

        contNota.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        contNota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contNota.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(contNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 400, 60));

        contDuracion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(contDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 30, 30));

        botonEliminar.setBackground(new java.awt.Color(172, 96, 100));
        botonEliminar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        botonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 150, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpeg"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        editarCita edit=new editarCita(this,cita);
        edit.setNota(cita.getNota());
        edit.setAsunto(cita.getAsunto());
        //edit.setHora(""+cita.getHora().getHour()+"",""+cita.getHora().getMinute()+"");
        edit.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonEditarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        int res=JOptionPane.showConfirmDialog(null, "Esta seguro que quiere eliminar la cita?", "Eliminar cita", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if(res==0){
        //eliminar cita
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    public void setAsunto(String p){
    contAsunto.setText(p);
    cita.setAsunto(p);
    }
    
    public void setNota(String p){
    contNota.setText(p);
    cita.setNota(p);
    }
    
    public void setDuracion(String p){
    contDuracion.setText(p);
    int dur= Integer.parseInt(p);
    cita.setDuracion(dur);
    }
    
    public void setFecha(String d, String m, String a){
    contFecha.setText(d+"/"+m+"/"+a);
    }
    public void setFecha(String p){
    contFecha.setText(p);
    }
    public void setHora(String h, String m){
    contHora.setText(h+":"+m);
    }
    
    public void setHora(String p){
    contHora.setText(p);
    }
    
    public void activaAl(){
        //activacionAlarma.
    }
    
    public static void main(String args[]) {
        Cita cita=new Cita("hola",2);
       mostrarCita holi=new mostrarCita(cita);
       holi.setVisible(true);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JLabel contAsunto;
    private javax.swing.JLabel contDuracion;
    private javax.swing.JLabel contFecha;
    private javax.swing.JLabel contHora;
    private javax.swing.JLabel contNota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
