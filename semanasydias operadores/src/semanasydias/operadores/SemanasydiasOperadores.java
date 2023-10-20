/*Construir un programa que, dado un numero total de horas, devulve el numero de semanas dias y horas equivalentes 
 */
package semanasydias.operadores;

/**
 *
 * @author angie
 */

import javax.swing.JOptionPane;
public class SemanasydiasOperadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Thoras,semanas,dias,horas;
        Thoras = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número total de horas"));
        
        semanas = (Thoras/24)/7;
        dias = (Thoras/24)-(semanas*7);
        horas = Thoras -(dias*24)-((semanas*7)*24);
        
        
        JOptionPane.showMessageDialog(null,"Semanas: "+semanas+"\n"+"Dias: "+dias+"\n"+"Horas: "+horas);
        
    }
    
}
