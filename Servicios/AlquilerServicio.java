/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alquiler;
import Entidades.Barco;
import Entidades.BarcoAMotor;
import Entidades.Velero;
import Entidades.Yate;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Delfina
 */
public class AlquilerServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alquiler crearAlquiler(Barco b) {

        Alquiler a = new Alquiler();

        System.out.println("Nuevo alquiler.");
        System.out.println("...............");
        System.out.println("Necesitamos que ingrese la siguiente información:");
        System.out.println("Nombre completo.");
        a.setNombreCliente(leer.next().toUpperCase());
        System.out.println("Número de documento.");
        a.setDni(leer.nextInt());
        System.out.println("Fecha de alquiler (Dia).");
        int dia = leer.nextInt();
        System.out.println("Fecha de alquiler (Mes).");
        int mes = leer.nextInt();
        System.out.println("Fecha de alquiler (Año).");
        int anio = leer.nextInt();
        Date fechaAlquiler = new Date(anio - 1900, mes, dia);
        a.setFechaAlquiler(fechaAlquiler);
        System.out.println("Fecha de devolución (Dia).");
        int diaDev = leer.nextInt();
        System.out.println("Fecha de devolución (Mes).");
        int mesDev = leer.nextInt();
        System.out.println("Fecha de devolución (Año).");
        int anioDev = leer.nextInt();
        Date fechaDevolucion = new Date(anioDev - 1900, mesDev, diaDev);
        a.setFechaDevolucion(fechaDevolucion);
        a.setBarco(b);
        mostrarDataCliente(a);
        return a;
    }

    public void menu() {

        System.out.println("Bienvenido a nuestro rental de amarres para barcos.");
        System.out.println("Ingrese el tipo de barco que tiene y le diremos el precio del alquiler.");
        System.out.println("Tipo 1- Barco básico.");
        System.out.println("Tipo 2- Velero.");
        System.out.println("Tipo 3- Barco a motor.");
        System.out.println("Tipo 4- Yate.");

        int respuesta = leer.nextInt();

        switch (respuesta) {
            case 1:
                BarcoServicio bs = new BarcoServicio();
                Barco b = bs.crearBarco();
                bs.mostrarData(b);
                int precio = bs.costoAlquilerGeneral(b);
                System.out.println("El precio de alquiler de su barco es de $" + precio);
                break;
            case 2:
                VeleroServicio vs = new VeleroServicio();
                Velero v = vs.crearVelero();
                vs.mostrarData(v);
                precio = vs.costoAlquiler(v);
                System.out.println("El precio de alquiler de su velero es de $" + precio);
                break;
            case 3:
                BarcoMotorServicio bms = new BarcoMotorServicio();
                BarcoAMotor bm = bms.crearBarcoMotor();
                bms.mostrarData(bm);
                precio = bms.costoAlquiler(bm);
                System.out.println("El precio de alquiler de su barco a motor es de $" + precio);
                break;
            case 4:
                YateServicio ys = new YateServicio();
                Yate y = ys.crearYate();
                ys.mostrarData(y);
                precio = ys.costoAlquiler(y);
                System.out.println("El precio de alquiler de su yate es de $" + precio);
                break;
        }
    }

    public void mostrarDataCliente(Alquiler a) {

        System.out.println("Nombre del cliente: " + a.getNombreCliente());
        System.out.println("DNI: " + a.getDni());

    }
}
