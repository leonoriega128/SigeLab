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
import com.toedter.calendar.JDateChooser;

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
        jCalendar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCalendar1MouseClicked(evt);
            }
        });
        jCalendar1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendar1PropertyChange(evt);
            }
        });
        jCalendar1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCalendar1KeyPressed(evt);
            }
        });

        jLabel4.setText("Solicitud de reserva");

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

        jLabel5.setForeground(new java.awt.Color(102, 102, 255));
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(617, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(104, 104, 104))
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
                            .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jComboBoxLab, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(71, 71, 71)
                            .addComponent(jLabel4)))
                    .addGap(19, 19, 19)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addGap(109, 109, 109))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 297, Short.MAX_VALUE)
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
                            .addGap(38, 38, 38)))
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

    public boolean obtenerDia(String convertido) {
        int dia = jCalendar1.getCalendar().getTime().getDate();
        boolean b = false;
        // System.out.println("dia de la modularidad" + convertido);
        //  String convertido = "";
        SolicitudlabDAO sl = new SolicitudlabDAO();
        ArrayList C = new ArrayList();
        C = sl.Listar_SolicitudlabVO();
        // for (int i = 0; i < C.size(); i++) {
        convertido = Character.toString(convertido.charAt(8)) + (convertido.charAt(9));
        //convertido = Character.toString(((SolicitudlabVO) C.get(i)).getFecha().charAt(8)) + Character.toString(((SolicitudlabVO) C.get(i)).getFecha().charAt(9));
        if (dia == Integer.parseInt(convertido)) {
            b = true;
        }

        //}
        //System.out.println("dia obtenido de la base de datos" + convertido);
        if (dia == Integer.parseInt(convertido)) {
            b = true;
        }

        return b;
    }

    public int obtenerMes() {
        int mes = jCalendar1.getCalendar().getTime().getMonth() + 1;
        return mes;

    }

    public int obtenerAnio() {
        int anio = jCalendar1.getCalendar().getWeekYear();//esto es para obtener el año
        return anio;
    }

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked

        SolicitudlabDAO SolcLab = new SolicitudlabDAO();
        SolicitudlabVO slvo = new SolicitudlabVO();
        MateriaDAO M = new MateriaDAO();
        ArrayList a = new ArrayList();
        a = M.Listar_MateriaVO();
        int anio = objDate.getYear() + 1900;
        boolean v = false;
        int mes = jCalendar1.getMonthChooser().getMonth() + 1;
        int c = JOptionPane.showConfirmDialog(null, "Desea solicitar reserva?", "Advertencia", JOptionPane.YES_NO_OPTION);
        boolean b = false;
        for (int x = 0; x < cantidadHorasSolc; x++) {
            String valor = Integer.toString(anio) + "-" + mes + "-" + Integer.toString(jCalendar1.getDayChooser().getDay());
            String hora = "0";
            String horafin = "0";
            for (int i = 0; i < 13; i++) {
                if (i == jTable2.getSelectedRow()) {
                    hora = String.valueOf(jTable2.getValueAt(i, 0));
                    horafin = String.valueOf(jTable2.getValueAt(i + jTable2.getSelectedRows().length, 0));
                }
            }
            String fechaSolc = valor;
            int[] columnass = jTable2.getSelectedColumns();
            String tipoRe = "";
            if (jRadioButton1.isSelected()) {
                tipoRe = "Materia";
            } else {
                tipoRe = "Ayudantia";
            }

            if (jTable2.getValueAt(jTable2.getSelectedRow(), 1) == null || String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(), 1)).equalsIgnoreCase("")) {
                if (c == 0) {

                    MateriaVO mat = new MateriaVO();
                    for (int i = 0; i < a.size(); i++) {
                        if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase(((MateriaVO) a.get(i)).getNombre())) {
                            slvo.setMateria_codMat((((MateriaVO) a.get(i)).getCodMat()));
                        }
                    }
                    slvo.setDni(Integer.parseInt(dni));
                    slvo.setLegajo(Legajo);
                    slvo.setTipoReserva("curricular");
                    slvo.setFecha(fechaSolc);
                    slvo.setHora(hora);
                    slvo.setEstadoSol("pendiente");
                    slvo.setLaboratorio_CodLab(1 + jComboBoxLab.getSelectedIndex());

                    slvo.setDocente_idDocente(Integer.parseInt(id));
                    slvo.setHoraFin(horafin);
                    b = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar una materia", "Advertencia",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Horario no disponible", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if (b == true) {
            SolcLab.Agregar_SolicitudlabVO(slvo);
            jComboBoxLab.removeAllItems();
            JOptionPane.showMessageDialog(null, "Solicitud enviada con exito", " ", JOptionPane.INFORMATION_MESSAGE);
        }

        cantidadHorasSolc = 0;
    }//GEN-LAST:event_jButton3MouseClicked

    public void obtenerDatos(String leg) {
        ArrayList E = new ArrayList();
        DocenteDAO dc = new DocenteDAO();
        E = dc.Listar_DocenteVO();
        //  System.out.println("necesito saber el legajo: " + Legajo);

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
        jComboBox1.removeAllItems();
        jComboBox1.removeAll();
        ArrayList E = new ArrayList();
        MateriaDAO dc = new MateriaDAO();
        E = dc.Listar_MateriaVO();

        ArrayList C = new ArrayList();
        SolicitudlabDAO sl = new SolicitudlabDAO();
        C = sl.Listar_SolicitudlabVO();

        ArrayList D = new ArrayList();
        UsuarioDAO doc = new UsuarioDAO();
        D = doc.Listar_UsuarioVO();

        for (int i = 0; i < D.size(); i++) {
            if (Legajo.equalsIgnoreCase(String.valueOf((((UsuarioVO) D.get(i)).getLegajo())))) {
                jLabel5.setText("Sesión en curso: " + (((UsuarioVO) D.get(i)).getNombre()).toString() + " " + (((UsuarioVO) D.get(i)).getApellido()).toString());
            }
        }

        for (int i = 0; i < E.size(); i++) {
            if (Legajo.equalsIgnoreCase((((MateriaVO) E.get(i)).getLegajo()))) {
                jComboBox1.addItem(((MateriaVO) E.get(i)).getNombre());
            }
        }

        for (int i = 0; i < C.size(); i++) {
            //if(obtenerMes(((SolicitudlabVO) C.get(i)).getFecha())){
            if (obtenerDia(((SolicitudlabVO) C.get(i)).getFecha())) {
                if (((SolicitudlabVO) C.get(i)).getEstadoSol().equalsIgnoreCase("aprobado")) {
                    String horaInicio = String.valueOf(((SolicitudlabVO) C.get(i)).getHora());
                    String horaFin = String.valueOf(((SolicitudlabVO) C.get(i)).getHoraFin());
                    int hora = convertirHora(horaInicio);
                    int horaF = convertirHora(horaFin);
                    int contador = horaF - hora;
                    for (int j = 0; j < E.size(); j++) {
                        for (int k = 0; k < contador; k++) {
                            if (((SolicitudlabVO) C.get(i)).getMateria_codMat().equals(((MateriaVO) E.get(j)).getCodMat())) {
                                jTable2.setValueAt(((MateriaVO) E.get(j)).getNombre(), hora + k, 1);
                            }
                        }

                    }
                
            }
        }
        }
    }//GEN-LAST:event_formWindowActivated

    private void jCalendar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCalendar1MouseClicked

    }//GEN-LAST:event_jCalendar1MouseClicked

    private void jCalendar1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCalendar1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCalendar1KeyPressed

    private void jCalendar1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendar1PropertyChange
        jComboBox1.removeAllItems();
        UsuarioDAO u = new UsuarioDAO();
        for (int i = 0; i < jTable2.getRowCount(); i++) {
            jTable2.setValueAt("", i, 1);
            jTable2.setValueAt(null, i, 1);
        }

        ArrayList E = new ArrayList();
        MateriaDAO dc = new MateriaDAO();
        E = dc.Listar_MateriaVO();

        ArrayList C = new ArrayList();
        SolicitudlabDAO sl = new SolicitudlabDAO();
        C = sl.Listar_SolicitudlabVO();

        for (int i = 0; i < E.size(); i++) {
            if (Legajo.equalsIgnoreCase((((MateriaVO) E.get(i)).getLegajo()))) {
                jComboBox1.addItem(((MateriaVO) E.get(i)).getNombre());
            }
        }

        for (int i = 0; i < C.size(); i++) {
            if (obtenerDia(((SolicitudlabVO) C.get(i)).getFecha())) {
                if (((SolicitudlabVO) C.get(i)).getEstadoSol().equalsIgnoreCase("aprobado")) {
                    String horaInicio = String.valueOf(((SolicitudlabVO) C.get(i)).getHora());
                    String horaFin = String.valueOf(((SolicitudlabVO) C.get(i)).getHoraFin());
                    int hora = convertirHora(horaInicio);
                    int horaF = convertirHora(horaFin);
                    int contador = horaF - hora;
                    for (int j = 0; j < E.size(); j++) {
                        if (((SolicitudlabVO) C.get(i)).getMateria_codMat().equals(((MateriaVO) E.get(j)).getCodMat())) {
                            for (int k = 0; k < contador; k++) {
                                jTable2.setValueAt(((MateriaVO) E.get(j)).getNombre(), hora + k, 1);
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jCalendar1PropertyChange

    public int convertirHora(String hora) {

        jCalendar1.setDate(objDate);

        Character d = String.valueOf(jCalendar1.getDate()).charAt(8);
        Character i = String.valueOf(jCalendar1.getDate()).charAt(9);
        String dia = Character.toString(d) + Character.toString(i);

        ArrayList E = new ArrayList();
        MateriaDAO dc = new MateriaDAO();
        E = dc.Listar_MateriaVO();

        ArrayList C = new ArrayList();
        SolicitudlabDAO sl = new SolicitudlabDAO();
        C = sl.Listar_SolicitudlabVO();
        String convert = "";
        int convertir = 0;
        boolean b = false;
        for (int j = 0; j < C.size(); j++) {
            String DiaBdd = Character.toString(((SolicitudlabVO) C.get(j)).getFecha().charAt(8)) + ((SolicitudlabVO) C.get(j)).getFecha().charAt(9);
            //  System.out.println("asdasd" + jCalendar1.getCalendar().getTime().getDate());
            if (((SolicitudlabVO) C.get(j)).getEstadoSol().equalsIgnoreCase("aprobado") && DiaBdd.equalsIgnoreCase(Integer.toString(jCalendar1.getCalendar().getTime().getDate()))) {

                // String hora = ((SolicitudlabVO) C.get(j)).getHora().toString();
                String horaTabla = "";
                int suma = Integer.parseInt(Character.toString(hora.charAt(0)) + Character.toString(hora.charAt(1))) + 3;
                if (suma < 10) {
                    convert = "0" + suma + ":" + "00";
                } else {
                    convert = suma + ":" + "00";
                }

                for (int k = 0; k < 2; k++) {
                    if (hora.charAt(k) != ':') {
                        horaTabla = horaTabla + Character.toString(convert.charAt(k));
                        b = true;
                    }
                }
                convertir = Integer.parseInt(horaTabla) - 8;
            }
        }
        return convertir;
    }

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
