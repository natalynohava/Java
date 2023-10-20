/*algoritmo que indique cual es numero mayor con funciones  
 */
package funcionesnumeromayor;

import javax.swing.JOptionPane;

public class Funcionesnumeromayor {

    public static int mayora(int a,int b, int c){
        if(a>b && a>c){
            JOptionPane.showMessageDialog(null,"el numero mayor es "+a);
        }else{
            if(b>a && b>c){
                JOptionPane.showMessageDialog(null,"el numero mayor es "+b);
            }else{
                if(c>a && b<c){
                JOptionPane.showMessageDialog(null,"el numero mayor es "+c);
                }
            }
        }
        return 0;
        
        
    }
    
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("ingresa un numeros"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("ingresa un numeros"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("ingresa un numeros"));
        
        int nums = mayora(num1,num2,num3);
        
    }
    
}
