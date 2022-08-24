/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerosPasos;

public class Gato extends Animal {

    private String razaGatuna;

    public Gato() {
    }

    public Gato(String razaGatuna, String nombre) {
        super(nombre);
        this.razaGatuna = razaGatuna;
    }

    @Override
    public void hacerRuido() {
        System.out.println("Hola! soy un gato.");
    }

    @Override
    public String toString() {
        return "Gato{" + "razaGatuna=" + razaGatuna + '}';
    }

}
