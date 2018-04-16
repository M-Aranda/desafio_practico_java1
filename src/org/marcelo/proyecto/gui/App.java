package org.marcelo.proyecto.gui;


import com.jtattoo.plaf.luna.LunaLookAndFeel;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.TableColumn;
import conexion.Conexion;
import datos.Criminal;
import datos.CriminalEnBD;
import datos.Estado;
import model.TModel;


public class App extends javax.swing.JFrame {

    private List<Estado> estados;
    private List<Criminal> criminales;
    private List<CriminalEnBD> criminalesRegistrados;

    private Connection con = null;
    private Statement stmt = null;
    private ResultSet rs = null;

    private TModel model;

    public App() {
        try {
            initComponents();
            inicializarSeleccionesInicialesYTitulo();
            inicializarComboBoxEstado();

            criminalesRegistrados = new ArrayList<>();
            con = Conexion.getConnection();

            try {
                stmt = con.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }

            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM criminal;");

            int cantFilas = 0;
            while (rs.next()) {
                ++cantFilas;

            }

            for (int i = 1; i < cantFilas + 1; i++) {
                try {

                    rescateInicial(i);
                } catch (SQLException ex) {
                    Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            cargarTabla();
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void inicializarSeleccionesInicialesYTitulo() {
        this.setTitle("Registro de criminales");
        txtNombre.requestFocus();
        rbtMasculino.setSelected(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

    }

    private void rescateInicial(int inicio) throws SQLException {
        String sqlSelect = "SELECT * FROM criminal WHERE ID=" + inicio + ";";
        PreparedStatement prepdos = con.prepareStatement(sqlSelect);
        prepdos.executeQuery();
        CriminalEnBD infoSolicitada = rescatar(con, sqlSelect);
        criminalesRegistrados.add(infoSolicitada);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGSexo = new javax.swing.ButtonGroup();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblNacionalidad = new javax.swing.JLabel();
        lblRut = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        cboEstado = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNacionalidad = new javax.swing.JTextField();
        txtRutChileno = new javax.swing.JTextField();
        rbtMasculino = new javax.swing.JRadioButton();
        rbtFemenino = new javax.swing.JRadioButton();
        btnRegistrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombre.setText("Nombre:");

        lblApellido.setText("Apellido:");

        lblSexo.setText("Sexo:");

        lblNacionalidad.setText("Nacionalidad:");

        lblRut.setText("Rut chileno:");

        lblEstado.setText("Estado:");

        cboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnGSexo.add(rbtMasculino);
        rbtMasculino.setText("Masculino");

        btnGSexo.add(rbtFemenino);
        rbtFemenino.setText("Femenino");

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/criminal.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblDatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRut)
                            .addComponent(lblEstado)
                            .addComponent(lblNacionalidad)
                            .addComponent(lblSexo)
                            .addComponent(lblApellido)
                            .addComponent(lblNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre)
                            .addComponent(txtApellido)
                            .addComponent(txtNacionalidad)
                            .addComponent(txtRutChileno)
                            .addComponent(cboEstado, 0, 197, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtMasculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtFemenino))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btnRegistrar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblApellido)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSexo)
                            .addComponent(rbtMasculino)
                            .addComponent(rbtFemenino))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNacionalidad)
                            .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRut)
                            .addComponent(txtRutChileno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEstado)
                            .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrar))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarFormulario() {
        txtNombre.setText("");
        txtApellido.setText("");
        rbtMasculino.setSelected(true);
        txtNacionalidad.setText("");
        txtRutChileno.setText("");
        cboEstado.setSelectedIndex(0);
        txtNombre.requestFocus();

    }

    private void inicializarComboBoxEstado() {

        estados = new ArrayList<>();

        estados.add(new Estado(1, "Libre"));
        estados.add(new Estado(2, "Capturado"));
        estados.add(new Estado(3, "Preso"));
        estados.add(new Estado(4, "Muerto"));

        cboEstado.removeAllItems();

        for (Estado e : estados) {
            cboEstado.addItem(e.toString());

        }

    }

    private void msgDeRegistroExitoso() {
        String titulo = "Aviso";
        String msg = "Criminal registrado con exito";
        int tipo_msg = JOptionPane.INFORMATION_MESSAGE;

        JOptionPane.showMessageDialog(null, msg, titulo, HEIGHT);
    }


    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        try {
            criminales = new ArrayList<>();

            String nombre = txtNombre.getText();
            String apellido = txtApellido.getText();
            String sexo = "";
            if (rbtMasculino.isSelected()) {
                sexo = "Masculino";
            } else {
                sexo = "Femenino";
            }

            String nacionalidad = txtNacionalidad.getText();
            String rut = txtRutChileno.getText();
            String estado = String.valueOf(cboEstado.getSelectedItem());

            if (estado.equals("1. Libre")) {
                estado = "Libre";
            } else if (estado.equals("2. Capturado")) {
                estado = "Capturado";
            } else if (estado.equals("3. Preso")) {
                estado = "Preso";
            } else if (estado.equals("4. Muerto")) {
                estado = "Muerto";
            }

            Criminal c = new Criminal(nombre, apellido, sexo, nacionalidad, rut, estado);
            criminales.add(c);

            String sqlInsert = "INSERT INTO criminal VALUES (NULL, '" + nombre + "','" + apellido + "','" + sexo + "','" + nacionalidad + "','" + rut + "','" + estado + "');";

            PreparedStatement prep = con.prepareStatement(sqlInsert);
            prep.executeUpdate(sqlInsert);

            String sqlSelect = "SELECT * FROM criminal;";
            PreparedStatement prepdos = con.prepareStatement(sqlSelect);
            prepdos.executeQuery();
            CriminalEnBD informacionSolicitada = rescatar(con, sqlSelect);
            criminalesRegistrados.add(informacionSolicitada);

            limpiarFormulario();

        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

        cargarTabla();
        msgDeRegistroExitoso();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private CriminalEnBD rescatar(Connection con, String command) throws SQLException {

        Statement stmt = null;

        int id = 0;
        String nombre = "";
        String apellido = "";
        String sexo = "";
        String nacionalidad = "";
        String rutChileno = "";
        String estado = "";

        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(command);

            while (rs.next()) {
                id = rs.getInt("ID");
                nombre = rs.getString("nombre");
                apellido = rs.getString("apellido");
                sexo = rs.getString("sexo");
                nacionalidad = rs.getString("nacionalidad");
                rutChileno = rs.getString("rutChileno");
                estado = rs.getString("estado");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (stmt
                    != null) {
                stmt.close();
            }
        }

        CriminalEnBD sujetoRegistrado = new CriminalEnBD(id, nombre, apellido, sexo, nacionalidad, rutChileno, estado);

        return sujetoRegistrado;

    }

    private void cargarTabla() {
        model = new TModel(criminalesRegistrados);
        tblDatos.setModel(model);
        tblDatos.setGridColor(Color.DARK_GRAY);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            UIManager.setLookAndFeel(new LunaLookAndFeel());
        } catch (Exception e) {
            e.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGSexo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRut;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JRadioButton rbtFemenino;
    private javax.swing.JRadioButton rbtMasculino;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRutChileno;
    // End of variables declaration//GEN-END:variables
}
