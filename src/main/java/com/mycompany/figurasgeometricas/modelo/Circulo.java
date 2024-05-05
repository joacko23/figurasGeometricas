
package com.mycompany.figurasgeometricas.modelo;

import com.mycompany.figurasgeometricas.interfaces.ICalculable;


public class Circulo implements ICalculable{
     private float radio;

    public Circulo() {
    }

    public Circulo(Float radio) {
        this.radio = radio;
    }

    public Float getRadio() {
        return radio;
    }

    public void setRadio(Float radio) {
        this.radio = radio;
    }

    @Override
    public float calcularSuperficie(Object e) {
        Circulo circulo = (Circulo) e;
        return (float) (Math.PI * circulo.getRadio() * circulo.getRadio());
    }

    @Override
    public float calcularPerimetro(Object e) {
        Circulo circulo = (Circulo) e;
        return (float) (2 * Math.PI * circulo.getRadio());
    }

    
}
