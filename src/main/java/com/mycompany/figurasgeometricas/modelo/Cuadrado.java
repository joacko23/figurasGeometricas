
package com.mycompany.figurasgeometricas.modelo;

import com.mycompany.figurasgeometricas.interfaces.ICalculable;


public class Cuadrado implements ICalculable{
     private Float lado;

    public Cuadrado() {
    }

    public Cuadrado(Float lado) {
        this.lado = lado;
    }

    public Float getLado() {
        return lado;
    }

    public void setLado(Float lado) {
        this.lado = lado;
    }

    @Override
    public float calcularSuperficie(Object e) {
        Cuadrado cuadrado = (Cuadrado) e;
       return cuadrado.getLado() * cuadrado.getLado();
    }

    @Override
    public float calcularPerimetro(Object e) {
        Cuadrado cuadrado = (Cuadrado) e;
       return 4 * cuadrado.getLado();
    }
    
}
