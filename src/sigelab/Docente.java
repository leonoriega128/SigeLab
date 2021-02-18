/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sigelab;

import DAO.SolicitudlabDAO;
import VO.UsuarioVO;
import DAO.UsuarioDAO;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import VO.SolicitudlabVO;
import VO.DocenteVO;
import DAO.DocenteDAO;
import DAO.*;
import VO.*;

/**
 *
 * @author Leo
 */
public class Docente extends javax.swing.JFrame {

    private int contador = 0;
    private int inicio = 0;
    private int Columna = 0;
    private String Legajo = "";
    private int cantidadHorasSolc = 0;
    private String dni = "";
    private String id = "";

    /**
     * Creates new form Docente
     */
    public Docente() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    Date objDate = new Date();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jComboBoxLab = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jTextField2.setText(" ");

        jLabel1.setText("H. Inicio");

        jLabel2.setText("H. Fin");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"8:00", null},
                {"9:00", null},
                {"10:00", ""},
                {"11:00", ""},
                {"12:00", ""},
                {"13:00", null},
                {"14:00", null},
                {"15:00", null},
                {"16:00", null},
                {"17:00", null},
                {"18:00", null},
                {"19:00", null},
                {"20:00", null},
                {"21:00", null}
            },
            new String [] {
                "Horario", "Día"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable2MouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButton4.setText("Cerrar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jCalendar1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jCalendar1AncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jCalendar1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel4.setText("Solicitud de reserva");

        jButton1.setText("Actualizar tabla");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton3.setText("Solicitar Turno");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Ayudantia");

        jLabel3.setText("Nombre Asignatura");

        jRadioButton1.setText("Materia");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jComboBoxLab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alfa", "Beta", "Gamma" }));
        jComboBoxLab.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxLabItemStateChanged(evt);
            }
        });
        jComboBoxLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxLabMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jComboBoxLabMouseReleased(evt);
            }
        });

        jTextField1.setText(" ");

        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(650, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(203, 203, 203))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(67, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(19, 19, 19)
                                            .addComponent(jLabel1)
                                            .addGap(40, 40, 40)
                                            .addComponent(jLabel2))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(35, 35, 35)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(33, 33, 33))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(250, 250, 250)
                                    .addComponent(jButton1))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(13, 13, 13))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jComboBoxLab, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(71, 71, 71)
                            .addComponent(jLabel4)
                            .addGap(551, 551, 551)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 312, Short.MAX_VALUE)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addGap(109, 109, 109))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jComboBoxLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1)))
                    .addGap(19, 19, 19)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addGap(5, 5, 5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(7, 7, 7)
                    .addComponent(jButton3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jButton4)
                    .addContainerGap(48, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MousePressed

    }//GEN-LAST:event_jTable2MousePressed

    private void jTable2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseReleased
        int[] seleccionados = jTable2.getSelectedRows();
        int[] seleccionadosCol = jTable2.getSelectedColumns();
        cantidadHorasSolc = jTable2.getSelectedRowCount();
        inicio = jTable2.getSelectedRow();
        System.out.println("inicio :" + inicio);
        String convertedToString = String.valueOf(jTable2.getValueAt(inicio, 0));
        jTextField2.setText((convertedToString));
        convertedToString = String.valueOf(jTable2.getValueAt(seleccionados.length + inicio, 0));
        jTextField1.setText(convertedToString);
    }//GEN-LAST:event_jTable2MouseReleased

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked

//        Loggin c = new Loggin();
//        this.setVisible(false);
//        c.setVisible(true);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
        Sigelab1 S = new Sigelab1();
        S.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jCalendar1AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jCalendar1AncestorMoved

    }//GEN-LAST:event_jCalendar1AncestorMoved

    private void jCalendar1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jCalendar1AncestorAdded

    }//GEN-LAST:event_jCalendar1AncestorAdded

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        UsuarioDAO u = new UsuarioDAO();
        ArrayList E = new ArrayList();

        for (int i = 0; i < jTable2.getRowCount(); i++) {
            jTable2.setValueAt(null, i, 1);
        }
        try {

//            PreparedStatement ps = null;
//            ResultSet rs = null;
            //           Connection con = CC.getConexion();
            String sql = "SELECT * FROM usuario WHERE LegajoU = '" + Legajo + "'";
            //   ps = con.prepareStatement(sql);
            //  rs = ps.executeQuery();
            //   while (rs.next()) {
            jLabel5.setText("Has iniciado sesion como: " + ((UsuarioVO) (E.get(1))).getNombre() + " " + ((UsuarioVO) (E.get(1))).getApellido());
            // }
        } catch (Exception e) {
        }
        String valor = Integer.toString(jCalendar1.getDayChooser().getDay());

        String mes = Integer.toString(jCalendar1.getMonthChooser().getMonth() + 1);
        if (mes.length() < 2) {
            mes = "0" + mes;
        }
        if (valor.length() == 1) {
            valor = "0" + valor;
        }

        try {
            String sql = "SELECT solFechayHora, solEstado, Materia FROM solicitud WHERE solFechaSolic like '%" + mes + "-" + valor + "%' ";
//            ps = con.prepareStatement(sql);
//            rs = ps.executeQuery();
            int convertir = 0;
            String horaTabla = "";
//            while (rs.next()) {
//                if (rs.getString("solEstado").equalsIgnoreCase("Aprobado")) {
//                    String hora = rs.getString("solFechayHora");
//                    System.out.println("horaaa: " + hora);
//                    horaTabla = "";
//                    for (int k = 0; k < 2; k++) {
//                        if (hora.charAt(k) != ':') {
//                            horaTabla = horaTabla + Character.toString(hora.charAt(k));
//                        }
//                    }
//                    convertir = Integer.parseInt(horaTabla) - 8;
//                    jTable2.setValueAt(rs.getString("Materia"), convertir, 1);
//                }
//            }

        } catch (Exception e) {

        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        System.out.println(jCalendar1.getDate().toString());
        System.out.println("Dia actual: " + objDate.getDay());
        System.out.println("Mes actual: " + objDate.getMonth());
        int anio = objDate.getYear() + 1900;
        boolean v = false;
        int mes = jCalendar1.getMonthChooser().getMonth() + 1;
        int c = JOptionPane.showConfirmDialog(null, "Desea solicitar reserva?", "Advertencia", JOptionPane.YES_NO_OPTION);

        for (int x = 0; x < cantidadHorasSolc; x++) {
            String valor = Integer.toString(anio) + "-" + mes + "-" + Integer.toString(jCalendar1.getDayChooser().getDay());
            System.out.println("compilado: " + valor);
            String hora = "0";
            String horafin = "0";
            for (int i = 0; i < 13; i++) {
                if (i == jTable2.getSelectedRow()) {
                    hora = String.valueOf(jTable2.getValueAt(i, 0));
                    horafin = String.valueOf(jTable2.getValueAt(i + jTable2.getSelectedRows().length, 0));
                }
            }
            String fechaSolc = valor;
            System.out.println(hora);
            int[] columnass = jTable2.getSelectedColumns();
            String tipoRe = "";
            if (jRadioButton1.isSelected()) {
                tipoRe = "Materia";
            } else {
                tipoRe = "Ayudantia";
            }
            System.out.println(String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(), 1)));

            if (jTable2.getValueAt(jTable2.getSelectedRow(), 1) == null || String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(), 1)).equalsIgnoreCase("")) {
                if (c == 0) {
                    //CC.insertarSolic(fechaSolc, fechaSolc, "Pendiente", fechaSolc, jTextField3.getText(), Legajo);
                    SolicitudlabDAO SolcLab = new SolicitudlabDAO();
                    SolicitudlabVO slvo = new SolicitudlabVO();
                    MateriaVO mat = new MateriaVO();
                    slvo.setCodLab(jComboBoxLab.getSelectedIndex() + 1);
                    slvo.setDni(Integer.parseInt(dni));
                    slvo.setLegajo(Legajo);
                    slvo.setTipoReserva("curricular");
                    slvo.setFecha(fechaSolc);
                    slvo.setHora(hora);
                    slvo.setEstadoSol("pendiente");
                    slvo.setLaboratorio_CodLab(1 + jComboBoxLab.getSelectedIndex());

//                    while (v == false) {
//                        if (jComboBox1.getItemAt(jComboBox1.getSelectedIndex()).equalsIgnoreCase(mat.getNombre())) {
//                            slvo.setMateria_codMat(mat.getCodMat());
//                            v = true;
//                        }
//                    }
                    slvo.setMateria_codMat(jComboBox1.getSelectedIndex() + 1);
                    //se debe hacer una consulta a la bdd para obtener el codigo de materia
                    slvo.setDocente_idDocente(Integer.parseInt(id));
                    slvo.setHoraFin(horafin);
                    SolcLab.Agregar_SolicitudlabVO(slvo);
                } else {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar una materia", "Advertencia",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Horario no disponible", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if (c == 0) {

        }
        JOptionPane.showMessageDialog(null, "Solicitud enviada con exito", " ", JOptionPane.INFORMATION_MESSAGE);

        cantidadHorasSolc = 0;
    }//GEN-LAST:event_jButton3MouseClicked

    public void obtenerDatos(String leg) {
        ArrayList E = new ArrayList();
        DocenteDAO dc = new DocenteDAO();
        E = dc.Listar_DocenteVO();
        System.out.println("necesito saber el legajo: " + Legajo);

        for (int i = 0; i < E.size(); i++) {
            String legajo = Integer.toString(((DocenteVO) E.get(i)).getUsuario_Legajo());
            if (Legajo.equalsIgnoreCase(legajo)) {
                dni = (((DocenteVO) E.get(i)).getDni());
                id = Integer.toString(((DocenteVO) E.get(i)).getIdDoc());
            }
        }
    }

    public void recibirLegajo(String leg) {
        Legajo = leg;
        System.out.println("recibiendo legajo : " + Legajo);
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jComboBoxLabItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxLabItemStateChanged

    }//GEN-LAST:event_jComboBoxLabItemStateChanged

    private void jComboBoxLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxLabMouseClicked

    }//GEN-LAST:event_jComboBoxLabMouseClicked

    private void jComboBoxLabMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxLabMouseReleased

    }//GEN-LAST:event_jComboBoxLabMouseReleased

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ArrayList E = new ArrayList();
        MateriaDAO dc = new MateriaDAO();
        E = dc.Listar_MateriaVO();
        //jComboBox1.addItem("Seleccionar materia");
        for (int i = 0; i < E.size(); i++) {
            if (Legajo.equalsIgnoreCase((((MateriaVO) E.get(i)).getLegajo()))) {
                jComboBox1.addItem(((MateriaVO) E.get(i)).getNombre());
            }
        }
        
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(Docente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Docente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Docente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Docente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Docente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxLab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
