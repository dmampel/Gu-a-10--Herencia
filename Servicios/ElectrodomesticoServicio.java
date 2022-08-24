/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Electrodomestico;
import java.util.Scanner;

public class ElectrodomesticoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private void comprobarConsumoEnergetico(String consumoEnergetico, Electrodomestico e) {

        if (consumoEnergetico.equals("A")) {
            e.setConsumoEnergetico("A");
        } else if (consumoEnergetico.equals("B")) {
            e.setConsumoEnergetico("B");
        } else if (consumoEnergetico.equals("C")) {
            e.setConsumoEnergetico("C");
        } else if (consumoEnergetico.equals("D")) {
            e.setConsumoEnergetico("D");
        } else if (consumoEnergetico.equals("E")) {
            e.setConsumoEnergetico("E");
        } else if (consumoEnergetico.equals("F")) {
            e.setConsumoEnergetico("F");
        } else {
            e.setConsumoEnergetico("F");
        }
    }

    private void comprobarColor(String color, Electrodomestico e) {

        switch (color) {
            case "BLANCO":
                e.setColor("BLANCO");
                break;
            case "AZUL":
                e.setColor("AZUL");
                break;
            case "NEGRO":
                e.setColor("NEGRO");
                break;
            case "ROJO":
                e.setColor("ROJO");
                break;
            case "GRIS":
                e.setColor("GRIS");
                break;
            default:
                e.setColor("BLANCO");
                break;
        }
    }

    public Electrodomestico crearElectrodomestico() {

        Electrodomestico e = new Electrodomestico();

        System.out.println("Vamos a crear un Electrodoméstico.");
        System.out.println("Ingrese los siguientes datos, si es tan amable.");

        System.out.println("El precio por defecto será de $1000.");
        e.setPrecio(1000);
        System.out.println("Color.");
        e.setColor(leer.next());
        System.out.println("Consumo energético.");
        e.setConsumoEnergetico(leer.next());
        
        System.out.println("Peso en kg.");
        e.setPeso(leer.nextInt());

        comprobarConsumoEnergetico(e.getConsumoEnergetico(), e);
        comprobarColor(e.getColor(), e);
        precioFinal(e.getConsumoEnergetico(), e);

        return e;

    }

    public void precioFinal(String consumoEnergetico, Electrodomestico e) {

        switch (consumoEnergetico) {

            case "A":
                e.setPrecio(e.getPrecio() + 1000);
                break;
            case "B":
                e.setPrecio(e.getPrecio() + 800);
                break;
            case "C":
                e.setPrecio(e.getPrecio() + 600);
                break;
            case "D":
                e.setPrecio(e.getPrecio() + 500);
                break;
            case "E":
                e.setPrecio(e.getPrecio() + 300);
                break;
            case "F":
                e.setPrecio(e.getPrecio() + 100);
                break;
        }

        if ((e.getPeso() > 0) & (e.getPeso() < 20)) {
            e.setPrecio(e.getPrecio() + 100);
        } else if ((e.getPeso() > 19) & (e.getPeso() < 50)) {
            e.setPrecio(e.getPrecio() + 500);
        } else if ((e.getPeso() > 49) & (e.getPeso() < 80)) {
            e.setPrecio(e.getPrecio() + 800);
        } else if (e.getPeso() > 79) {
            e.setPrecio(e.getPrecio() + 1000);
        }
    }
}
