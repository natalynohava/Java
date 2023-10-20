/*
 */
package fucionesmenu2;

import javax.swing.JOptionPane;

/**
 *
 * @author angie
 */
public class Fucionesmenu2 {

    public static String nombre(){
        String nom;
        nom = JOptionPane.showInputDialog("inrese su nombre");
        return nom;
    }
    public static int edad(){
        int a;
        a = Integer.parseInt(JOptionPane.showInputDialog("ingrese su edad"));
        return a;
    }
    public static String calcularedad(){
        int edad=edad();
        if(edad>=18){
            return "usted es mayor de edad";
        }else{
            return "usted es menor de edad";
        }
       
    }
    public static void main(String[] args) {
        String nom;
        String ed; 
        
        nom = nombre();
        ed = calcularedad();
        
        JOptionPane.showMessageDialog(null,"su nombre es: "+nom+ed);
    }
    
}

