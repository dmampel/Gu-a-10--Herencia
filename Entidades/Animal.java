/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

public class Animal {
    
    protected String nombre;
    protected String raza;
    protected String alimento;
    protected int edad;

    public Animal() {
    }

    public Animal(String nombre, String raza, String alimento, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.alimento = alimento;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", raza=" + raza + ", alimento=" + alimento + ", edad=" + edad + '}';
    }
    
    public void mostrarAlimento(){
        System.out.println("El animal come comida.");
    }
}
