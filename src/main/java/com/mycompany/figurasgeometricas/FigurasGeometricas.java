

package com.mycompany.figurasgeometricas;

import com.mycompany.figurasgeometricas.vistas.VistaPrincipal;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FigurasGeometricas {

    public static void main(String[] args) {
        
        //Instancio la vista principal
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new VistaPrincipal().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FigurasGeometricas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
}
