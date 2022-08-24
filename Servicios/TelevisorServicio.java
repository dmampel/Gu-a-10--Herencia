/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Electrodomestico;
import Entidades.Televisor;

public class TelevisorServicio extends ElectrodomesticoServicio {
    
    public Televisor crearTelevisor(){
        
        Electrodomestico e = new Electrodomestico();
        Televisor t = new Televisor();
        crearElectrodomestico();
        t.setColor(e.getColor());
        t.setConsumoEnergetico(e.getConsumoEnergetico());
        t.setPeso(e.getPeso());
        t.setPrecio(1000);
        System.out.println("Vamos a transformar el electrodomestico en un televisor.");
        System.out.println("Ingrese el número de pulgadas.");
        t.setResolucion(leer.nextInt());
        System.out.println("Posee sintonizador TDT?");
        t.setSintonizador(leer.nextBoolean());
        
        return t;
    }

    
    public void precioFinal(Televisor t) {
        
        precioFinal(t.getConsumoEnergetico(), t);
        
        int aumento = (30 * t.getPrecio()) / 100;
        if (t.getResolucion() > 40){
            t.setPrecio(t.getPrecio() + aumento);
            //System.out.println("Al superar las 40 pulgadas, le damos un aumento de $" +aumento);
        }
        
        if (t.isSintonizador() == true){
            t.setPrecio(t.getPrecio() + 500);
            //System.out.println("Al poseer sintonizador se le aumentan $ " +500);
        }
        
        //System.out.println("Precio final: " +t.getPrecio());
    }
    
    public void mostrarTelevisor(Televisor t){
        System.out.println(t.toString());
    }
    
    
}
