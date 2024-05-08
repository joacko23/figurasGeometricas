
package com.mycompany.figurasgeometricas.modelo;

import com.mycompany.figurasgeometricas.interfaces.ICalculable;


public class Poligono implements ICalculable {
    private int lados;
    private float longitudLado;

    public Poligono(int lados, float longitudLado) {
        this.lados = lados;
        this.longitudLado = longitudLado;
    }



    @Override
    public float calcularSuperficie(Object e) {
        Poligono poligono = (Poligono) e;
        float apotema = (float) (poligono.longitudLado / (2 * Math.tan(Math.PI / poligono.lados)));
        return (poligono.lados * poligono.longitudLado * apotema) / 2;
    }

    @Override
    public float calcularPerimetro(Object e) {
        Poligono poligono = (Poligono) e;
        return poligono.lados * poligono.longitudLado;
    }
}
