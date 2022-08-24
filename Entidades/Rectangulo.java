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
public class Rectangulo implements calculosFormas {
    
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        int area = base * altura;
        System.out.println("El área del réctangulo es " +area);
    }

    @Override
    public void calcularPerimetro() {
        int perimetro = (base * 2) + (altura * 2);
        System.out.println("El perímetro del réctangulo es " +perimetro);
    }
    
    
}
