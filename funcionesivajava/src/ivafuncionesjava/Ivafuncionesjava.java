/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ivafuncionesjava;

import javax.swing.JOptionPane;

public class Ivafuncionesjava {

    public static int subtotal(int a,int b){
        return a*b;
    }
    public static double iva(int a,int b){
        return (subtotal(a, b) * 19)/100;
    }
    public static double total(int a , int b){
        return (subtotal(a, b) + iva(a, b));
    }
    public static double descuento(int a, int b,int c){
        return (total(a,b)*c/100)+total(a,b);
    }
    
    public static void main(String[] args) {
        int id,cantidad,valor,desc;
        String nombre,articulo;
        
        id = Integer.parseInt(JOptionPane.showInputDialog("enter id"));
        nombre = JOptionPane.showInputDialog("enter your name");
        articulo = JOptionPane.showInputDialog("articulo a comprar");
        valor = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor unitario del articulo"));
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("ingresa la cantidad de articulos"));
        desc = Integer.parseInt(JOptionPane.showInputDialog("ingrese valor del descuento"));
        
        
        JOptionPane.showMessageDialog(null,"su nombre es: "+nombre+"\n su identificacion es: "+id+
                "\n el subtotal es: "+subtotal(valor,cantidad)+
                "\n valor del iva: "+iva(valor,cantidad)+
                "\n total a pagar: "+descuento(valor,cantidad,desc));
    }
    
}
