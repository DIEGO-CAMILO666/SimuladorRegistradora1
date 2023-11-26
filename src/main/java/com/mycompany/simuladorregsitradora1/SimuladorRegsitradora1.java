package com.mycompany.simuladorregsitradora1;

/**
 * En esta clase llamaremos el metodo por medio de Thread
 * @author dcmr3 & axmr5
 */
public class SimuladorRegsitradora1 {

    /**
     * Medotodo para instanciar cada hilo
     */
    public static void main(String[] args) {
        CajeroProducto1 cajero1 = new CajeroProducto1();
        CajeroProducto2 cajero2 = new CajeroProducto2();

        Thread thread1 = new Thread(cajero1);
        Thread thread2 = new Thread(cajero2);
        /**
         * Sentiencia de arranque de los hilos
         */
        thread1.start();
        thread2.start();
    }
}
