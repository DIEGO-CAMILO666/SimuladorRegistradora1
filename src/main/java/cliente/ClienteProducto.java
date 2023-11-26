package cliente;

import java.util.List;

/**
 * En esta clase crearemos el ClienetProducto con sus atributos
 *
 * @author dcmr3 & axmr5
 */
public class ClienteProducto {

    /**
     * Deckaramos los atributos y su tipo
     */
    private final String nombre;
    /**
     * Deckaramos el array y su tipo
     */
    private final List<Producto> productos;

    /**
     * Metodos contsructores
     */
    public ClienteProducto(String nombre, List<Producto> productos) {
        this.nombre = nombre;
        this.productos = productos;
    }

    /**
     * Metodo get para retornar el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo get para retornar la lista de proiductos
     */
    public List<Producto> getProductos() {
        return productos;
    }
}
