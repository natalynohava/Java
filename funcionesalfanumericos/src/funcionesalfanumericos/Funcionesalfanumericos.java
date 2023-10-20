/*datos alfanumericos en funciones
 */
package funcionesalfanumericos;

import javax.swing.JOptionPane;

public class Funcionesalfanumericos {
    public static String nombre(String nombre){
        return nombre;
    }
    public static int nombre(int a){
        return a;
    }
    

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,nombre("manuel"));
        JOptionPane.showMessageDialog(null,nombre(7));
    }
    
}
