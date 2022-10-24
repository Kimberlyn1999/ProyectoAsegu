
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author administrador
 */
public class frame_Opciones extends javax.swing.JFrame {
    private Connection conn;
    public frame_Opciones(Connection conn) {
        initComponents();
        this.conn = conn;
        contarCitas(fechaActual());
    }
    
    public String fechaActual(){
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fechaActual = formato.format(fecha);
        
        return fechaActual;
    }
    
    public void contarCitas(String fecha){
        String conteo= null;
        String Query = "select count(id_cita) from citas where fecha_cita = '"+fecha+"' and atendido = 'No'";
        
        try {
            Statement sentencia = conn.createStatement();
            ResultSet rs = sentencia.executeQuery(Query);
            
            while(rs.next()){
                conteo = rs.getString(1);
            }
            label_contador.setText(conteo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al recuperar los registros.","Error.",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        label_Pacientes = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        label_Consulta = new javax.swing.JLabel();
        Label_Cita = new javax.swing.JLabel();
        label_Pagos = new javax.swing.JLabel();
        label_contador = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Opciones");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Menú");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 153));
        jLabel2.setText("Principal");

        label_Pacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/paciente.png"))); // NOI18N
        label_Pacientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_Pacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_PacientesMouseEntered(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_PacientesMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_PacientesMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("PACIENTES");

        label_Consulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta.png"))); // NOI18N
        label_Consulta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_Consulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_ConsultaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_ConsultaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_ConsultaMouseExited(evt);
            }
        });

        Label_Cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cita.png"))); // NOI18N
        Label_Cita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Label_Cita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label_CitaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Label_CitaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Label_CitaMouseExited(evt);
            }
        });

        label_Pagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pago.png"))); // NOI18N
        label_Pagos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_Pagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_PagosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_PagosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_PagosMouseExited(evt);
            }
        });

        label_contador.setForeground(new java.awt.Color(0, 51, 204));
        label_contador.setText("0");

        jLabel7.setForeground(new java.awt.Color(0, 51, 204));
        jLabel7.setText("Citas pendientes:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("CONSULTAS");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("CITAS");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("PAGOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(33, 33, 33))
                            .addComponent(jSeparator2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_contador, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(441, 441, 441)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 717, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(233, 233, 233))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Label_Cita, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(label_Consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel9)
                        .addGap(172, 172, 172)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel8))
                            .addComponent(label_Pacientes))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_Pagos)
                .addGap(147, 147, 147))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_Pacientes)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label_Pagos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(label_Consulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Label_Cita, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(label_contador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void label_PacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_PacientesMouseClicked
        frame_Pacientes paciente = new frame_Pacientes(conn);
        paciente.setVisible(true);
        dispose();
    }//GEN-LAST:event_label_PacientesMouseClicked

    private void label_PacientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_PacientesMouseEntered
        label_Pacientes.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Paciente_c.png")));
    }//GEN-LAST:event_label_PacientesMouseEntered

    private void label_PacientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_PacientesMouseExited
        label_Pacientes.setIcon(new ImageIcon(getClass().getResource("/Imagenes/paciente.png")));
    }//GEN-LAST:event_label_PacientesMouseExited

    private void label_ConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_ConsultaMouseClicked
        frame_Consultas consultas = new frame_Consultas(conn);
        consultas.setVisible(true);
        dispose();
    }//GEN-LAST:event_label_ConsultaMouseClicked

    private void label_ConsultaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_ConsultaMouseEntered
        label_Consulta.setIcon(new ImageIcon(getClass().getResource("/Imagenes/consulta_c.png")));
    }//GEN-LAST:event_label_ConsultaMouseEntered

    private void label_ConsultaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_ConsultaMouseExited
        label_Consulta.setIcon(new ImageIcon(getClass().getResource("/Imagenes/consulta.png")));
    }//GEN-LAST:event_label_ConsultaMouseExited

    private void Label_CitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_CitaMouseClicked
        frame_Citas citas = new frame_Citas(conn);
        citas.setVisible(true);
        dispose();
    }//GEN-LAST:event_Label_CitaMouseClicked

    private void Label_CitaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_CitaMouseEntered
        Label_Cita.setIcon(new ImageIcon(getClass().getResource("/Imagenes/cita_c.png")));
    }//GEN-LAST:event_Label_CitaMouseEntered

    private void Label_CitaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_CitaMouseExited
        Label_Cita.setIcon(new ImageIcon(getClass().getResource("/Imagenes/cita.png")));
    }//GEN-LAST:event_Label_CitaMouseExited

    private void label_PagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_PagosMouseClicked
        frame_Pagos pagos = new frame_Pagos(conn);
        pagos.setVisible(true);
        dispose();
    }//GEN-LAST:event_label_PagosMouseClicked

    private void label_PagosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_PagosMouseEntered
        label_Pagos.setIcon(new ImageIcon(getClass().getResource("/Imagenes/pago_c.png")));
    }//GEN-LAST:event_label_PagosMouseEntered

    private void label_PagosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_PagosMouseExited
        label_Pagos.setIcon(new ImageIcon(getClass().getResource("/Imagenes/pago.png")));
    }//GEN-LAST:event_label_PagosMouseExited

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
            java.util.logging.Logger.getLogger(frame_Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame_Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame_Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame_Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_Cita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel label_Consulta;
    private javax.swing.JLabel label_Pacientes;
    private javax.swing.JLabel label_Pagos;
    private javax.swing.JLabel label_contador;
    // End of variables declaration//GEN-END:variables
}
