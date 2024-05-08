
package com.mycompany.figurasgeometricas.vistas;

import com.mycompany.figurasgeometricas.controladores.FigurasControl;
import com.mycompany.figurasgeometricas.modelo.Circulo;
import com.mycompany.figurasgeometricas.modelo.Cuadrado;
import com.mycompany.figurasgeometricas.modelo.Poligono;
import com.mycompany.figurasgeometricas.modelo.Triangulo;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class VistaPrincipal extends javax.swing.JFrame {

    private JFrame ventanaActual;
    FigurasControl figurasControl;
    private final Class<?>[] clasesFiguras = {Cuadrado.class, Triangulo.class, Circulo.class, Poligono.class};
    
    public VistaPrincipal() throws SQLException {
        figurasControl = FigurasControl.GetInstance();
        initComponents();
        poblarComboBox();
        setLocationRelativeTo(null);
    }

    private void poblarComboBox() {
     
        cbxFiguras.removeAllItems();

      
        for (Class<?> clase : clasesFiguras) {
            cbxFiguras.addItem(clase.getSimpleName()); 
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblSelectFigura = new javax.swing.JLabel();
        cbxFiguras = new javax.swing.JComboBox<>();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Calculadora de Figuras");

        lblSelectFigura.setText("Seleccione una Figura:");

        cbxFiguras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(lblSelectFigura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAceptar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(lblTitulo)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblTitulo)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelectFigura)
                    .addComponent(cbxFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar))
                .addContainerGap(166, Short.MAX_VALUE))
        );

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

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        try {
            String nombreClase = (String) cbxFiguras.getSelectedItem();

            
            switch (nombreClase) {
                case "Cuadrado":
                    if (ventanaActual != null) {
                        ventanaActual.dispose();
                    }
                    
                    VistaCuadrado vistaCuadrado = null;
                    vistaCuadrado = new VistaCuadrado();
                    
                    vistaCuadrado.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosed(WindowEvent e) {
                            
                            setVisible(true);
                        }
                    });
                    
                    vistaCuadrado.setVisible(true);
                    
                    ventanaActual = vistaCuadrado;
                    
                    this.setVisible(false);
                    break;
                    
                case "Triangulo":
                    if (ventanaActual != null) {
                        ventanaActual.dispose();
                    }
                    
                    VistaTriangulo vistaTriangulo = null;
                    vistaTriangulo = new VistaTriangulo();
                    
                    vistaTriangulo.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosed(WindowEvent e) {
                            
                            setVisible(true);
                        }
                    });
                    
                    vistaTriangulo.setVisible(true);
                    
                    ventanaActual = vistaTriangulo;
                    
                    this.setVisible(false);
                    break;
                case "Circulo":
                    if (ventanaActual != null) {
                        ventanaActual.dispose();
                    }
                    
                    VistaCirculo vistaCirculo = null;
                    vistaCirculo = new VistaCirculo();
                    
                    vistaCirculo.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosed(WindowEvent e) {
                            
                            setVisible(true);
                        }
                    });
                    
                    vistaCirculo.setVisible(true);
                    
                    ventanaActual = vistaCirculo;
                    
                    this.setVisible(false);
                    break;
                case "Poligono":
                    if (ventanaActual != null) {
                        ventanaActual.dispose();
                    }
                    
                    VistaPoligono vistaPoligono = null;
                    vistaPoligono = new VistaPoligono();
                    
                    vistaPoligono.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosed(WindowEvent e) {
                            
                            setVisible(true);
                        }
                    });
                    
                    vistaPoligono.setVisible(true);
                    
                    ventanaActual = vistaPoligono;
                    
                    this.setVisible(false);
                    break;
                default:
                  
                    JOptionPane.showMessageDialog(null, "Debes seleccionar una figura válida.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(VistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JComboBox<String> cbxFiguras;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblSelectFigura;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
