/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionesfrutas;

import javax.swing.JOptionPane;

/**
 *
 * @author angie
 */
public class Funcionesfrutas {

    public static int total(int a,int b){
        return a*b;
    }
    public static void main(String[] args) {
        String fruta="";
        int valor= 0;
        int frutas = Integer.parseInt(JOptionPane.showInputDialog("**fruatas"+
                "\n 1 para manzana \n 2 para pera \n 3 para piña"));
        
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad a comprar"));
        
        switch(frutas){
            case 1:
                fruta = "manzana";
                valor = 2000;
                break;
            case 2:
                fruta = "pera";
                valor = 1000;
                break;
            case 3:
                fruta = "piña";
                valor = 3000;
                break;
        }
        JOptionPane.showMessageDialog(null,"su fruta es: "+fruta
                + "\n el valor de su fruta es: "+valor
                + "\n total a pagar es: "+total(cantidad,valor));
    }
    
}
