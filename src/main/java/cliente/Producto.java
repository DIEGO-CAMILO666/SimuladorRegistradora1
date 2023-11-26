package cliente;

/**
 * En esta clase crearemos el producto con sus atributos
 * @author dcmr3 & axmr5
 */
public class Producto {

    /**
     * Deckaramos los atributos y su tipo
     */
    private String nombre; // atributo para asignar el nombre del producto
    private int cantidad;  // Atributo para asignar la catidad del rpoducto a comprar
    private Double precioUnitario; //Atributo para asignar el valor unitario del producto

    /**
     * Metodos constructores del producto
     */
    public Producto(String nombre, int cantidad, Double precioUnitario) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    /**
     * Metodos set y geters del producto
     */
    /**
     * Metodo get para retornar el nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo set para asignar el nombre del producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo get para retornar la cantidad del producto
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Metodo set para asignar la cantidad del producto
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Metodo get para retornar el valor unitario del producto
     */
    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * Metodo set para asignar el valor unitario del producto
     */
    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    /**
     * sobrecraga del metodo String
     */
    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario + '}';
    }

}
