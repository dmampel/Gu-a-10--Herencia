/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mains;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;


import Servicios.LavadoraServicio;
import Servicios.TelevisorServicio;
import java.util.ArrayList;

/**
 *
 * @author Delfina
 */
public class ejercicio3 {

    public static void main(String[] args) {

        LavadoraServicio ls = new LavadoraServicio();
        TelevisorServicio ts = new TelevisorServicio();

        Lavadora l1 = new Lavadora(30, 1000, "Rojo", "A", 60);
        Lavadora l2 = new Lavadora(55, 1000, "Negro", "A", 80);

        Televisor t1 = new Televisor(60, true, 1000, "Blanco", "C", 25);
        Televisor t2 = new Televisor(95, false, 1000, "Gris", "C", 42);

        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();

        electrodomesticos.add(l1);
        electrodomesticos.add(l2);
        electrodomesticos.add(t1);
        electrodomesticos.add(t2);
        
        int precioTotal = 0;
        int c1 = 0;
        int c2 = 0;

        for (Electrodomestico aux : electrodomesticos) {
            
            
            if (aux instanceof Lavadora) {
                c1++;
                Lavadora l = (Lavadora) aux;
                ls.precioFinal(l);
                System.out.println("Precio lavadora " +c1+ ": $" +l.getPrecio());
                precioTotal = precioTotal + l.getPrecio();
                continue;
            }

            if (aux instanceof Televisor) {
                c2++;
                Televisor t = (Televisor) aux;
                ts.precioFinal(t);
                System.out.println("Precio televisor " +c2+ ": $" +t.getPrecio());
                precioTotal = precioTotal + t.getPrecio();
                continue;
            }
        }

        System.out.println("El precio total de todos los electrodomesticos: $" +precioTotal);
    }

}
