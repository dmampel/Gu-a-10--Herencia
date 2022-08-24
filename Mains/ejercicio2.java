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

/**
 *
 * @author Delfina
 */
public class ejercicio2 {

    public static void main(String[] args) {

        // ElectrodomesticoServicio servicio = new ElectrodomesticoServicio();
        // Electrodomestico e = servicio.crearElectrodomestico();
        // System.out.println(e.toString());
        LavadoraServicio ls = new LavadoraServicio();
        Lavadora l = ls.crearLavadora();
        ls.precioFinal(l);

        TelevisorServicio ts = new TelevisorServicio();
        Televisor t = ts.crearTelevisor();
        ts.precioFinal(t);

        ls.mostrarLavadora(l);
        ts.mostrarTelevisor(t);

    }

}
