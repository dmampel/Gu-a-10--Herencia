/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alquiler;
import Entidades.Barco;
import java.util.Scanner;

/**
 *
 * @author Delfina
 */
public class BarcoServicio {

    Scanner leer = new Scanner(System.in);

    public Barco crearBarco() {

        Barco b = new Barco();
        System.out.println("Vamos a ingresar su bote.");
        System.out.println("Mátricula del mismo por favor.");
        b.setMatricula(leer.nextLine().toUpperCase());
        System.out.println("Longitud de esnorla en m.");
        b.setEslora(leer.nextInt());
        System.out.println("Año de fabricación.");
        b.setAñoFabricacion(leer.nextInt());

        return b;
    }

    public int costoAlquilerGeneral(Barco b) {
        AlquilerServicio s = new AlquilerServicio();
        Alquiler a = s.crearAlquiler(b);

        int totalDias = a.getFechaDevolucion().getDate() - a.getFechaAlquiler().getDate();
        int valorModulo = b.getEslora() * 10;
        int precio = totalDias * valorModulo;

        return precio;
    }

    public void mostrarData(Barco b) {

        System.out.println("Matricula: " + b.getMatricula());
        System.out.println("Esnorla de " + b.getEslora() + "m.");
        System.out.println("Año de fábricación: " + b.getAñoFabricacion());

    }

}
