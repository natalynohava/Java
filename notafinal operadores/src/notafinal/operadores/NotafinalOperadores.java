/*La calidicación final de un estudiante de informatica se calacula con base a la calificación de cuatro aspectos:
- participación
- primer examen parcial
- segundo examen parcial
- examen final
Sabienddo que las calificaciones anteriores entran a la calificación final con ponderaciones del 
10%, 25%, 25% y 40%. Hacer un programa que calcule e imprima la calificación final de un estidiante
 */
package notafinal.operadores;

import javax.swing.JOptionPane;

/*
 *
 * @author angie
 */
public class NotafinalOperadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double p,pep,sep,ef;
        double p_p, p_pep, p_sep, p_ef, total;
        
        //se piden las 4 notas
        p = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido!"+"\n"+"Ingrese nota de participación"));
        pep = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nota de primer examen parcial"));
        sep = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nota de segundo examen parcial"));
        ef = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nota de examen final"));
        
        //se calcula el porcentaje correspondiente a cada nota
        p_p = p*0.10;
        p_pep = pep*0.25;
        p_sep = sep*0.25;
        p_ef = ef*0.40;
        
        //se suman las notas
        total = p_p + p_pep + p_sep + p_ef;
        
        JOptionPane.showMessageDialog(null,"su nota final es: "+total);
        
        
    }
    
}
