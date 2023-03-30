package org.mateo.hilos.ejemplo;

import org.mateo.hilos.ejemplo.thread.NombreThread;

public class EjemploExtenderThread {
    public static void main(String[] args) throws InterruptedException {

        Thread hilo = new NombreThread("John Doe");
        System.out.println(hilo.getState()); //Retorna NEW, se creo el hilo sin ejecutar

        hilo.start();

        Thread hilo2 = new NombreThread("Maria");
        hilo2.start();

        NombreThread hilo3 = new NombreThread("Pepe");
        hilo3.start();

        //Thread.sleep(100); //Genera espera del hilo MAIN para que la siguiente instruccion se ejecute a tiempo
        System.out.println(hilo.getState()); //Retorna el nuevo estado (Antes del Sleep retorna RUNNABLE)
                                            //Luego del Sleep retorna TERMINATED

    }
}
