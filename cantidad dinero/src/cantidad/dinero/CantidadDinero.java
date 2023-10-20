/*Guillermo tiene N dolares. Luis tiene la mitad de lo que posee Guillermo. Juan tine la mitad de lo que posee Luis
y Guillermo juntos. Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los 3
 */
package cantidad.dinero;

import javax.swing.JOptionPane;

public class CantidadDinero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //se pide el dato de entrada a guillermo
        int cant_guillermo = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido Guillermo"+"\n"+ "Ingresa tu cantidad de dinero"));
        
        //se calcula el monto de Luis
        int cant_luis = cant_guillermo/2;
        
        //se calcula el monto de Juan
        int cant_juan = (cant_guillermo + cant_luis)/2;
        
        //se calcula el total
        int total = cant_guillermo + cant_luis + cant_juan;
        
        JOptionPane.showMessageDialog(null,"Total: "+total);
    }
    
}
