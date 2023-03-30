package org.mateo.hilos.ejemplo.ejemplosync;

import org.mateo.hilos.ejemplo.ejemplosync.runnable.*;

public class EjemploProductorConsumidor {
    public static void main(String[] args) {

        Panaderia p = new Panaderia();

        new Thread( new Panadero(p)).start();
        new Thread( new Consumidor(p)).start();
    }
}
