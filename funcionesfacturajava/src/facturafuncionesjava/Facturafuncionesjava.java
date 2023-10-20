/*ejercicio factura con iva y descuento a pedido del cliente con funciones
 */
package facturafuncionesjava;

import javax.swing.JOptionPane;

public class Facturafuncionesjava {
    
    public static int subtotal(int a,int b){
        return a*b;
    }
    public static double iva(int a,int b){
        return (subtotal(a, b) * 19)/100;
    }
    public static double total(int a , int b){
        return (subtotal(a, b) + iva(a, b));
    }
    
    public static void main(String[] args) {
        int id,cantidad,valor;
        String nombre,articulo;
        
        id = Integer.parseInt(JOptionPane.showInputDialog("ingrese su identificación"));
        nombre = JOptionPane.showInputDialog("ingrese su nombre");
        articulo = JOptionPane.showInputDialog("articulo a comprar");
        valor = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor unitario del articulo"));
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("ingresa la cantidad de articulos"));
        
        
        JOptionPane.showMessageDialog(null,"su nombre es: "+nombre+"\n su identificacion es: "+id+
                "\n el subtotal es: "+subtotal(valor,cantidad)+
                "\n valor del iva: "+iva(valor,cantidad)+
                "\n total a pagar: "+total(valor,cantidad));
           
    }
    
}
