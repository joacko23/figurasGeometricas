
package com.mycompany.figurasgeometricas.vistas;

import com.mycompany.figurasgeometricas.controladores.FigurasControl;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class VistaCirculo extends javax.swing.JFrame {

    FigurasControl figurasControl;
    
    public VistaCirculo() throws SQLException {
        figurasControl = FigurasControl.GetInstance();
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTituloCirculo = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        lblRadio = new javax.swing.JLabel();
        txtRadioC = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        lblMedidas = new javax.swing.JLabel();
        lblResultados = new javax.swing.JLabel();
        lblPerimetro = new javax.swing.JLabel();
        lblMedidaPerimetro = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        lblMedidaArea = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTituloCirculo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTituloCirculo.setText("Circulo");

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblRadio.setText("Radio:");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lblMedidas.setText("Ingrese las medidas:");

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
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblRadio)
                            .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(lblTituloCirculo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRadioC, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblResultados)
                            .addComponent(lblMedidas)
                            .addComponent(btnLimpiar)
                            .addComponent(btnCalcular)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPerimetro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMedidaPerimetro)
                                .addGap(18, 18, 18)
                                .addComponent(lblArea)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMedidaArea)))))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloCirculo)
                    .addComponent(btnVolver))
                .addGap(37, 37, 37)
                .addComponent(lblMedidas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRadio)
                    .addComponent(txtRadioC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(28, Short.MAX_VALUE))
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

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
        VistaPrincipal vistaPrincipal = null;
        try {
            vistaPrincipal = new VistaPrincipal();
        } catch(SQLException ex){
            Logger.getLogger(VistaCirculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        vistaPrincipal.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        try{
            float medidaRadio = Float.parseFloat(txtRadioC.getText());
            
            float resultadoPerimetro = figurasControl.calcularPerimetroCirculo(medidaRadio);
            float resultadoArea = figurasControl.calcularSuperficieCirculo(medidaRadio);
            
            lblMedidaPerimetro.setText(String.valueOf(resultadoPerimetro));
            lblMedidaArea.setText(String.valueOf(resultadoArea));
            
        }catch(NumberFormatException exception){
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un radio valido para realizar el calculo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtRadioC.setText("");
        
        
        lblMedidaPerimetro.setText("");
        lblMedidaArea.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblMedidaArea;
    private javax.swing.JLabel lblMedidaPerimetro;
    private javax.swing.JLabel lblMedidas;
    private javax.swing.JLabel lblPerimetro;
    private javax.swing.JLabel lblRadio;
    private javax.swing.JLabel lblResultados;
    private javax.swing.JLabel lblTituloCirculo;
    private javax.swing.JTextField txtRadioC;
    // End of variables declaration//GEN-END:variables
}
