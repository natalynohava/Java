
package admin;

/**
 *
 * @author angie
 */
public class Factura {
    private int id;
    private String nombres;
    private String producto;
    private double valor;
    private int cantidad;

    public Factura(int id, String nombres, String producto, double valor, int cantidad) {
        this.id = id;
        this.nombres = nombres;
        this.producto = producto;
        this.valor = valor;
        this.cantidad = cantidad;
    }/* cerrar metodo.El contructor tiene el mismo nombre que la clase */
    
    /*-------------------------------------- METODO GET ----------------------------------------------------*/

    public int getId() {
        return id;
    }

    public String getNombres() {
        return nombres;
    }

    public String getProducto() {
        return producto;
    }

    public double getValor() {
        return valor;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    /*-------------------------------------- METODO SET ----------------------------------------------------*/

    public void setId(int id) {
        this.id = id;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    //-----------------------------------------METODO CALCULO-------------------------------------------------//
    
    public double totalCompra(){
        return getCantidad() * getValor();
    }    
    

}/* cerrar main */