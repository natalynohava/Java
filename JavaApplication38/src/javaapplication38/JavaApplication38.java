/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication38;

import javax.swing.JOptionPane;
public class JavaApplication38 {

    /**
     * @param args the command line arguments
     */
    public static void Calcular(String estado, int nombre){
        if(nombre == 5){
            JOptionPane.showMessageDialog(null, "eres gey");
            estado = "ACTIVO";
        }
        else{
            estado = "INACTIVO";
        }

    }
    public static void main(String[] args) {
        //
        int nombre = Integer.parseInt(JOptionPane.showInputDialog("ingrese su numero"));
        String estado="";
        
        Calcular(estado,nombre);
        
        if(estado == "INACTIVO"){
            JOptionPane.showMessageDialog(null,":v");
        }else{
            JOptionPane.showMessageDialog(null,"sancocho");
        }
        
    }
    
}
