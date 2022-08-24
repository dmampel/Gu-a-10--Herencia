/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Delfina
 */
public class Televisor extends Electrodomestico{
    
    protected int resolucion;
    protected boolean sintonizador;

    public Televisor() {
    }
    

    public Televisor(int resolucion, boolean sintonizador, int precio, String color, String consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int reolucion) {
        this.resolucion = reolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    @Override
    public String toString() {
        return "Televisor{" + "\nresolucion=" + resolucion + ", \nsintonizador=" + sintonizador + '}';
    }
    
    
    
    
    
}
