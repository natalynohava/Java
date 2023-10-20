
package npackage;

/**
 *
 * @author angie
 */
public class ClassFactura {
    public String nombre,articulo,id,subtotal;
    public int valor,cantidad;
    public double iva,total;
    
    /*-------------------------------------- METODO CONDTRUCTOR --------------------------------------------------*/

    public ClassFactura(String nombre, String articulo, String id, int valor, int cantidad) {
        this.nombre = nombre;
        this.articulo = articulo;
        this.id = id;
        this.valor = valor;
        this.cantidad = cantidad;
    }
    /*-------------------------------------- METODO GET AND SET --------------------------------------------------*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    /*-------------------------------------- METODO CaLCULOS --------------------------------------------------*/
    
    public int subtotal(){
        return valor*cantidad;
    }
    public double iva(){
        return (subtotal()*0.19)/100;
    }
    public double total(){
        return subtotal() + iva();
    }
    
}
