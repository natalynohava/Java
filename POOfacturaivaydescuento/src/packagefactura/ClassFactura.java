/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packagefactura;

/**
 *
 * @author angie
 */
public class ClassFactura {
    public String nombre,id,articulo,subtotal;
    public int valor,cantidad,descuento;
    public double Descuento,iva,total;
    
    //<--------------------------------------METODO CONSTRUCTOR------------------------------------------------->//

    public ClassFactura(String nombre, String id, String articulo, int valor, int cantidad, int descuento) {
        this.nombre = nombre;
        this.id = id;
        this.articulo = articulo;
        this.valor = valor;
        this.cantidad = cantidad;
        this.descuento = descuento;
    }
    //<--------------------------------------METODO SET AND GET------------------------------------------------->//

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
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

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
    //<--------------------------------------METODOS CALCULAR------------------------------------------------->//
    
    public int subtotal(){
        return valor*cantidad;
    }
    
    public double iva(){
        return subtotal()*0.19/100;
    }
    
    public double Descuento(){
        return subtotal()*descuento/100;
    }
    
    public double total(){
        return subtotal()+iva()-Descuento();
    }
}
