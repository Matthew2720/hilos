package org.mateo.hilos.ejemplo;


import org.mateo.hilos.ejemplo.runnable.imprimirFrases;

public class EjemploSincronizacionThread {
    public static void main(String[] args) throws InterruptedException {

        new Thread(new imprimirFrases("Hola"," que tal!")).start();
        new Thread(new imprimirFrases("Quien eres ","tu?")).start();
        Thread.sleep(100);
        Thread h3 = new Thread(new imprimirFrases("Muchas ","gracias amigo"));
        h3.start();
        Thread.sleep(100);
        System.out.println(h3.getState());

    }

    public synchronized static void imprimirFrases(String frase1, String frase2){
        System.out.print(frase1);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(frase2);
    }
}
