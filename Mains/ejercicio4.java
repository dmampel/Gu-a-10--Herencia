/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mains;

import Entidades.Circulo;
import Entidades.Rectangulo;

/**
 *
 * @author Delfina
 */
public class ejercicio4 {

    public static void main(String[] args) {
        
        Circulo c = new Circulo(5);
        Rectangulo r = new Rectangulo(4, 6);
        c.calcularArea();
        c.calcularPerimetro();
        r.calcularArea();
        r.calcularPerimetro();
    }
    
}
