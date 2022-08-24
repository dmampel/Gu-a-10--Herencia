/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerosPasos;

public class Perro extends Animal {

    private String razaPerruna;

    public Perro() {
    }

    public Perro(String razaPerruna, String nombre) {
        super(nombre);
        this.razaPerruna = razaPerruna;
    }

    @Override
    public void hacerRuido() {
        System.out.println("Hola! soy un perro.");
    }

    @Override
    public String toString() {
        return "Perro{" + "razaPerruna=" + razaPerruna + '}';
    }

}
