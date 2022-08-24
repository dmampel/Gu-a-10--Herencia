/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Barco;
import Entidades.Velero;

/**
 *
 * @author Delfina
 */
public class VeleroServicio extends BarcoServicio {

    public Velero crearVelero() {

        Velero v = new Velero();
        Barco b = crearBarco();
        v.setMatricula(b.getMatricula());
        v.setEslora(b.getEslora());
        v.setAñoFabricacion(b.getAñoFabricacion());
        System.out.println("Ingrese el número de mástiles.");
        v.setCantidadMastiles(leer.nextInt());

        return v;

    }

    public int costoAlquiler(Velero v) {
        int precioBase = costoAlquilerGeneral(v);
        int precioFinal = precioBase * v.getCantidadMastiles();
        return precioFinal;
    }

    public void mostrarData(Velero v) {
        System.out.println("Matricula: " + v.getMatricula());
        System.out.println("Esnorla de " + v.getEslora() + "m.");
        System.out.println("Año de fábricación: " + v.getAñoFabricacion());
        System.out.println("Número de mástiles: " + v.getCantidadMastiles());
    }

}
