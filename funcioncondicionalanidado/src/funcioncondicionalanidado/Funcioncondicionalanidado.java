/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcioncondicionalanidado;

import javax.swing.JOptionPane;

/**
 *
 * @author angie
 */
public class Funcioncondicionalanidado {

    public static int pareimpar(int a){
        if(a%2==0){
            JOptionPane.showMessageDialog(null,"par");
        }else{
            JOptionPane.showMessageDialog(null,"impar");
        }
        return a;
    }
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero"));
        
        JOptionPane.showMessageDialog(null,"el numero  es: "+pareimpar(a));
    }
    
}
