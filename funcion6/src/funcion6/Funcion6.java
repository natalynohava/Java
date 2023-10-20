
package funcion6;

import javax.swing.JOptionPane;

public class Funcion6 {

    public static void main(String[] args) {
       String nombre, articulo;
       int cantidad, valoruni, subtotal;
       
       JOptionPane.showMessageDialog(null, "*** Tienda no te pases ***");
       nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
       articulo = JOptionPane.showInputDialog("Ingrese el articulo: ");
       cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad: "));
       valoruni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor unitario: "));
       
       JOptionPane.showMessageDialog(null, "*** Factura ***");
       JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\n" + 
        "Articulo: " + articulo + "\n" + 
        "Cantidad: " + cantidad + "\n" + 
        "Subtotal: " + sub(cantidad, valoruni) + "\n" + 
        "Iva: " + iva(sub(cantidad, valoruni),0.19) + "\n" +
        "Total: " + total(sub(cantidad,valoruni),iva(sub(cantidad, valoruni),0.19)));
    }
    public static int sub(int n1, int n2){
        return n1 * n2;
    }
    public static double iva(double n1, double n2){
        return n1 * n2;
    }
    public static double total(int n1, double n2){
        return n1 + n2;
    }
}
