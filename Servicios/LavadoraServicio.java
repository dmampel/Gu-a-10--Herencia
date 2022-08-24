/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;


import Entidades.Electrodomestico;
import Entidades.Lavadora;


/**
 *
 * @author Delfina
 */
public class LavadoraServicio extends ElectrodomesticoServicio {
    
    
    
    public Lavadora crearLavadora(){
        
        Lavadora l = new Lavadora();
        Electrodomestico e = crearElectrodomestico();
        l.setColor(e.getColor());
        l.setConsumoEnergetico(e.getConsumoEnergetico());
        l.setPeso(e.getPeso());
        l.setPrecio(e.getPrecio());
        System.out.println("Vamos a transformar el objeto en una lavadora.");
        System.out.println("Ingrese la carga en kg.");
        l.setCarga(leer.nextInt());
        
        return l;
    }

    
    public void precioFinal(Lavadora l){
        
        precioFinal(l.getConsumoEnergetico(), l);
        
        if (l.getCarga() > 30){
            l.setPrecio(l.getPrecio() + 500);
            //System.out.println("El precio aumentó $" +500);
        }else{
            //System.out.println("El precio no se modifica.");
        }
        
        //System.out.println("Precio final: " +l.getPrecio());
    }
    
    public void mostrarLavadora(Lavadora l){
        System.out.println("Color: " +l.getColor());
        System.out.println("Consumo: " +l.getConsumoEnergetico());
        System.out.println("Peso: " +l.getPeso()+ "kg.");
        System.out.println("Precio: $" +l.getPrecio());
        System.out.println("Carga: " +l.getCarga()+ "kg.");
        
    }
    
    

   
    
    
    
    
    

   

    
    
    
}
