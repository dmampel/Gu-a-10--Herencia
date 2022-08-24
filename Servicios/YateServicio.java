/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Barco;
import Entidades.Yate;

/**
 *
 * @author Delfina
 */
public class YateServicio extends BarcoServicio {

    public Yate crearYate() {
        Yate y = new Yate();
        Barco b = crearBarco();
        y.setMatricula(b.getMatricula());
        y.setEslora(b.getEslora());
        y.setAñoFabricacion(b.getAñoFabricacion());
        System.out.println("Ingrese la potencia del motor en CV.");
        y.setPotencia(leer.nextInt());
        System.out.println("Ingrese el número de camarotes.");
        y.setCantidadCamarotes(leer.nextInt());

        return y;
    }

    public int costoAlquiler(Yate y) {
        int precioBase = costoAlquilerGeneral(y);
        int precioFinal = precioBase * y.getCantidadCamarotes() * y.getPotencia();
        return precioFinal;
    }

    public void mostrarData(Yate y) {
        System.out.println("Matricula: " + y.getMatricula());
        System.out.println("Esnorla de " + y.getEslora() + "m.");
        System.out.println("Año de fábricación: " + y.getAñoFabricacion());
        System.out.println("Potencia de motor: " + y.getPotencia() + " caballos de fuerza.");
        System.out.println("Número de camarotes: " + y.getCantidadCamarotes());
    }

}
