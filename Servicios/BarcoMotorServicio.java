/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Barco;
import Entidades.BarcoAMotor;

/**
 *
 * @author Delfina
 */
public class BarcoMotorServicio extends BarcoServicio {

    public BarcoAMotor crearBarcoMotor() {

        BarcoAMotor bm = new BarcoAMotor();
        Barco b = crearBarco();
        bm.setMatricula(b.getMatricula());
        bm.setEslora(b.getEslora());
        bm.setAñoFabricacion(b.getAñoFabricacion());
        System.out.println("Ingrese la potencia del motor en CV.");
        bm.setPotencia(leer.nextInt());
        return bm;
    }

    public int costoAlquiler(BarcoAMotor bm) {
        int precioBase = costoAlquilerGeneral(bm);
        int precioFinal = precioBase * bm.getPotencia();
        return precioFinal;
    }

    public void mostrarData(BarcoAMotor bm) {
        System.out.println("Matricula: " + bm.getMatricula());
        System.out.println("Esnorla de " + bm.getEslora() + "m.");
        System.out.println("Año de fábricación: " + bm.getAñoFabricacion());
        System.out.println("Potencia de motor: " + bm.getPotencia() + " caballos de fuerza.");
    }
}
