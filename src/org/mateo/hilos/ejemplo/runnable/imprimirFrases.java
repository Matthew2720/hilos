package org.mateo.hilos.ejemplo.runnable;

import static org.mateo.hilos.ejemplo.EjemploSincronizacionThread.imprimirFrases;

public class imprimirFrases implements Runnable {

    private String frase1,frase2;

    public  imprimirFrases(String frase1,String frase2){
        this.frase1 = frase1;
        this.frase2 = frase2;
    }

    @Override
    public void run() {
        imprimirFrases(this.frase1,this.frase2);

    }
}
