/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mains;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

public class ejercicio1 {

    public static void main(String[] args) {
        
        Animal p = new Perro("Victor", "Golden", "Pollo", 5);
        p.mostrarAlimento();
        
        Animal g = new Gato("Manuel", "Persa", "Pasto", 4);
        g.mostrarAlimento();
        
        Animal c = new Caballo("Eduardo", "Criollo", "sushi", 15);
        c.mostrarAlimento();
    }
    
}
