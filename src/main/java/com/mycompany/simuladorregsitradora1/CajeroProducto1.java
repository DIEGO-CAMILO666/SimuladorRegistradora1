package com.mycompany.simuladorregsitradora1;

import cliente.ClienteProducto;
import cliente.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 * En esta clase crearemos un modelo de hilo para generar el proceso de compra
 * @author dcmr3 & axmr5
 */
public class CajeroProducto1 implements Runnable {

    /**
     * Declaracion de la variable nombre
     */
    private String nombre;

    /**
     * Metodos constructores
     */
    public CajeroProducto1(String nombre) {
        this.nombre = nombre;
    }

    public CajeroProducto1() {
    }

    /**
     * Metodo run para ser ejecutado cunado se llame de la clase principal
     */
    public void run(ClienteProducto cliente, long timeStamp) {
        System.out.println("El " + this.nombre + " inicia el proceso del cliente "
                + cliente.getNombre() + " en: " + (System.currentTimeMillis() - timeStamp) / 1000
                + " segundos");
        int conClienet = 1;
        for (Producto producto : cliente.getProductos()) {
            this.esperarXsegundos();
            System.out.println("Procesando el producto " + conClienet
                    + " nombre del producto " + producto.getNombre()
                    + " precio del producto " + producto.getPrecioUnitario()
                    + " cantidad de producto " + producto.getCantidad()
                    + " costo total del producto " + producto.getCantidad() * producto.getPrecioUnitario()
                    + " -> Tiempo: " + (System.currentTimeMillis() - timeStamp / 1000) + " segundos");
            conClienet++;
        }

    }

    private void esperarXsegundos() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }

    /**
     * sobreescritura del metodo run para ser ejecutado cunado se llame de la
     * clase principal
     */
    @Override
    public void run() {
        List<Producto> productos = new ArrayList<>();
        setProductos(productos);
        /**
         * instanciación del cliente y asignación del nombre
         */
        ClienteProducto cliente1 = new ClienteProducto(" DIEGO", productos);
        /**
         * instanciación del cajero y asigancion del nombre con tiempo de inicio
         * en ejecucion
         */
        long initialTime = System.currentTimeMillis();
        CajeroProducto1 cajero1 = new CajeroProducto1(" Cajero 1");

        cajero1.run(cliente1, initialTime);

    }

    /**
     * seteado del array Productos
     */
    private static void setProductos(List<Producto> productos) {
        Producto producto1 = new Producto("lapiz", 12, 1.200);
        Producto producto2 = new Producto("esfero", 12, 1.500);
        Producto producto3 = new Producto("cuaderno", 12, 5.000);
        /**
         * llenado del array
         */
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
    }

}
