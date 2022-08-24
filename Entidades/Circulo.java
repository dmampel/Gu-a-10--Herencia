/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Interfaces.calculosFormas;

/**
 *
 * @author Delfina
 */
public class Circulo implements calculosFormas{
    
    private int radio;

    public Circulo() {
    }

    public Circulo(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
       double area = PI * (radio * radio);
        System.out.println("El área del círculo es " +area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = 2 * PI * radio;
        System.out.println("El perímetro del círculo es " +perimetro);
    }
    
    
}
