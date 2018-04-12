package org.marcelo.proyecto.gui;

import com.birosoft.liquid.LiquidLookAndFeel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import model.Criminal;
import model.Estado;

public class App extends javax.swing.JFrame {

    private List<Estado> estados;
    private List<Criminal> criminales;

    public App() {
        initComponents();
        this.setTitle("Registro de criminales");
        txtNombre.requestFocus();

        rbtMasculino.setSelected(true);
        this.setLocationRelativeTo(null);

        inicializarComboBoxEstado();

 
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
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuRegistros = new javax.swing.JMenu();
        mniVerRegistros = new javax.swing.JMenuItem();

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

        mnuRegistros.setText("Registros");

        mniVerRegistros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        mniVerRegistros.setText("Ver registros");
        mniVerRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniVerRegistrosActionPerformed(evt);
            }
        });
        mnuRegistros.add(mniVerRegistros);

        jMenuBar1.add(mnuRegistros);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRut)
                                    .addComponent(lblEstado)
                                    .addComponent(lblNacionalidad)
                                    .addComponent(lblSexo)
                                    .addComponent(lblApellido))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre)
                            .addComponent(txtApellido)
                            .addComponent(txtNacionalidad)
                            .addComponent(txtRutChileno)
                            .addComponent(cboEstado, 0, 197, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtMasculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtFemenino)))
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRegistrar)
                        .addGap(80, 80, 80))))
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(btnRegistrar)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarFormulario() {
        txtNombre.setText("");
        txtApellido.setText("");
        rbtMasculino.setSelected(true);
        txtNacionalidad.setText("");
        txtRutChileno.setText("");

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

    private void mniVerRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniVerRegistrosActionPerformed
        Registros reg = new Registros();
        reg.setVisible(true);
        reg.setDefaultCloseOperation(reg.DISPOSE_ON_CLOSE);


    }//GEN-LAST:event_mniVerRegistrosActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

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

        Criminal c = new Criminal(nombre, apellido, sexo, nacionalidad, rut, estado);
        criminales.add(c);
        limpiarFormulario();

        msgDeRegistroExitoso();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

       try {
            UIManager.setLookAndFeel(new LiquidLookAndFeel());
        } catch (Exception e) {
            e.printStackTrace();
        }

        //</editor-fold>

        /* Create and display the form */
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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRut;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JMenuItem mniVerRegistros;
    private javax.swing.JMenu mnuRegistros;
    private javax.swing.JRadioButton rbtFemenino;
    private javax.swing.JRadioButton rbtMasculino;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRutChileno;
    // End of variables declaration//GEN-END:variables
}
