
package com.mycompany.figurasgeometricas.vistas;

import com.mycompany.figurasgeometricas.controladores.FigurasControl;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class VistaTriangulo extends javax.swing.JFrame {

    FigurasControl figurasControl;
    
    public VistaTriangulo() throws SQLException {
        figurasControl = FigurasControl.GetInstance();
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        lblMedidas = new javax.swing.JLabel();
        lblLado1Triangulo = new javax.swing.JLabel();
        txtLado1Triangulo = new javax.swing.JTextField();
        lblLado2Triangulo = new javax.swing.JLabel();
        txtLado2Triangulo = new javax.swing.JTextField();
        lblBaseTriangulo = new javax.swing.JLabel();
        txtBaseTriangulo = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        lblResultados = new javax.swing.JLabel();
        lblPerimetro = new javax.swing.JLabel();
        lblMedidaPerimetro = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        lblMedidaArea = new javax.swing.JLabel();
        lblAltura = new javax.swing.JLabel();
        lblMedidaAltura = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitulo.setText("Triangulo");

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblMedidas.setText("Ingrese las medidas:");

        lblLado1Triangulo.setText("Lado 1:");

        lblLado2Triangulo.setText("Lado 2:");

        lblBaseTriangulo.setText("Base:");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lblResultados.setText("Resultados:");

        lblPerimetro.setText("Perimetro:");

        lblMedidaPerimetro.setText("Medida");

        lblArea.setText("Area:");

        lblMedidaArea.setText("Medida");

        lblAltura.setText("Altura:");

        lblMedidaAltura.setText("Medida");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(lblTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblLado1Triangulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLado1Triangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblLado2Triangulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLado2Triangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblBaseTriangulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBaseTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblMedidas)
                            .addComponent(btnCalcular)
                            .addComponent(lblResultados)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPerimetro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMedidaPerimetro)
                                .addGap(18, 18, 18)
                                .addComponent(lblArea)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMedidaArea)
                                .addGap(18, 18, 18)
                                .addComponent(lblAltura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMedidaAltura))
                            .addComponent(btnLimpiar))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(btnVolver))
                .addGap(39, 39, 39)
                .addComponent(lblMedidas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLado1Triangulo)
                    .addComponent(txtLado1Triangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLado2Triangulo)
                    .addComponent(txtLado2Triangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBaseTriangulo)
                    .addComponent(txtBaseTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCalcular)
                .addGap(18, 18, 18)
                .addComponent(lblResultados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPerimetro)
                    .addComponent(lblMedidaPerimetro)
                    .addComponent(lblArea)
                    .addComponent(lblMedidaArea)
                    .addComponent(lblAltura)
                    .addComponent(lblMedidaAltura))
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar)
                .addContainerGap(26, Short.MAX_VALUE))
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

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        try{
            float medidaBase = Float.parseFloat(txtBaseTriangulo.getText());
            float medidaLado1 = Float.parseFloat(txtLado1Triangulo.getText());
            float medidaLado2 = Float.parseFloat(txtLado2Triangulo.getText());
            
            float resultadoPerimetro = figurasControl.calcularPerimetroTriangulo(medidaLado1, medidaLado2, medidaBase);
            float resultadoArea = figurasControl.calcularSuperficieTriangulo(medidaLado1, medidaLado2, medidaBase);
            float resultadoAltura = figurasControl.calcularAlturaTriangulo(medidaLado1, medidaLado2, medidaBase);
            
            lblMedidaPerimetro.setText(String.valueOf(resultadoPerimetro));
            lblMedidaArea.setText(String.valueOf(resultadoArea));
            lblMedidaAltura.setText(String.valueOf(resultadoAltura));
            
        }catch(NumberFormatException exception){
            JOptionPane.showMessageDialog(this, "Por favor, ingrese una medida valida del triangulo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
        VistaPrincipal vistaPrincipal = null;
        try {
            vistaPrincipal = new VistaPrincipal();
        } catch (SQLException ex) {
            Logger.getLogger(VistaTriangulo.class.getName()).log(Level.SEVERE, null, ex);
        }
        vistaPrincipal.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtBaseTriangulo.setText("");
        txtLado1Triangulo.setText("");
        txtLado2Triangulo.setText("");
        
        
        lblMedidaPerimetro.setText("");
        lblMedidaArea.setText("");
        lblMedidaAltura.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblBaseTriangulo;
    private javax.swing.JLabel lblLado1Triangulo;
    private javax.swing.JLabel lblLado2Triangulo;
    private javax.swing.JLabel lblMedidaAltura;
    private javax.swing.JLabel lblMedidaArea;
    private javax.swing.JLabel lblMedidaPerimetro;
    private javax.swing.JLabel lblMedidas;
    private javax.swing.JLabel lblPerimetro;
    private javax.swing.JLabel lblResultados;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtBaseTriangulo;
    private javax.swing.JTextField txtLado1Triangulo;
    private javax.swing.JTextField txtLado2Triangulo;
    // End of variables declaration//GEN-END:variables
}
