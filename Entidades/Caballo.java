/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

public class Caballo extends Animal {

    public Caballo() {
    }

    public Caballo(String nombre, String raza, String alimento, int edad) {
        super(nombre, raza, alimento, edad);
    }

    @Override
    public void mostrarAlimento(){
        System.out.println("El caballo come " +alimento);
    }
}
