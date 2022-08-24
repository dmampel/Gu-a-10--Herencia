/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerosPasos;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Animal> animales = new ArrayList();

        Animal a = new Animal("Estefano el pez");
        Perro p = new Perro("GOLDEN", "Rodrigo");
        Gato g = new Gato("PERSA", "Victor");

        animales.add(a);

        animales.add(p);

        animales.add(g);

        for (Animal aux : animales) {
            System.out.println(aux);
            aux.hacerRuido();
        }
    }

}
