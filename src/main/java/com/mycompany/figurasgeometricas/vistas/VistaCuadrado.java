
package com.mycompany.figurasgeometricas.vistas;

import com.mycompany.figurasgeometricas.controladores.FigurasControl;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class VistaCuadrado extends javax.swing.JFrame {

    FigurasControl figurasControl;
    
    public VistaCuadrado() throws SQLException {
        figurasControl = FigurasControl.GetInstance();
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblMedidas = new javax.swing.JLabel();
        lblLadoC = new javax.swing.JLabel();
        txtLadoCuadrado = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        lblResultados = new javax.swing.JLabel();
        lblPerimetro = new javax.swing.JLabel();
        lblMedidaPerimetro = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        lblMedidaArea = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitulo.setText("Cuadrado");

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblMedidas.setText("Ingrese las medidas:");

        lblLadoC.setText("Lado:");

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
                        .addGap(16, 16, 16)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(lblTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblLadoC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLadoCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblMedidas)
                            .addComponent(btnLimpiar)
                            .addComponent(btnCalcular)
                            .addComponent(lblResultados)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPerimetro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMedidaPerimetro)
                                .addGap(18, 18, 18)
                                .addComponent(lblArea)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMedidaArea)))))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(lblTitulo))
                .addGap(38, 38, 38)
                .addComponent(lblMedidas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLadoC)
                    .addComponent(txtLadoCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCalcular)
                .addGap(18, 18, 18)
                .addComponent(lblResultados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPerimetro)
                    .addComponent(lblMedidaPerimetro)
                    .addComponent(lblArea)
                    .addComponent(lblMedidaArea))
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar)
                .addContainerGap(29, Short.MAX_VALUE))
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
         try {
            float medidaLado = Float.parseFloat(txtLadoCuadrado.getText());

            float perimetroResultado = figurasControl.calcularPerimetroCuadrado(medidaLado);
            lblMedidaPerimetro.setText(String.valueOf(perimetroResultado));
            float areaResultado = figurasControl.calcularSuperficieCuadrado(medidaLado);
            lblMedidaArea.setText(String.valueOf(areaResultado));

        } catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese una medida valida del lado del cuadrado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        VistaPrincipal vistaPrincipal = null;
        try {
            vistaPrincipal = new VistaPrincipal();
        } catch (SQLException ex) {
            Logger.getLogger(VistaCuadrado.class.getName()).log(Level.SEVERE, null, ex);
        }
        vistaPrincipal.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtLadoCuadrado.setText("");
        
        lblMedidaPerimetro.setText("");
        lblMedidaArea.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblLadoC;
    private javax.swing.JLabel lblMedidaArea;
    private javax.swing.JLabel lblMedidaPerimetro;
    private javax.swing.JLabel lblMedidas;
    private javax.swing.JLabel lblPerimetro;
    private javax.swing.JLabel lblResultados;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtLadoCuadrado;
    // End of variables declaration//GEN-END:variables
}
