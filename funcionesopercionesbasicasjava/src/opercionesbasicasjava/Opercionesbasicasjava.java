/*realizar 4 operaciones basicas con funciones
 */
package opercionesbasicasjava;

import javax.swing.JOptionPane;

public class Opercionesbasicasjava {

    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("ingresa otro numero"));

        JOptionPane.showMessageDialog(null, "la suma es: " + suma(a, b)+
                "\n la resta es: " + resta(a, b)+
                "\n la multiplicación es: " + multi(a, b)+
                "\n la división es: " + divi(a, b));
    }

    public static int suma(int n1, int n2) {
        return n1 + n2;
    }

    public static int resta(int n1, int n2) {
        return n1 - n2;
    }

    public static int multi(int n1, int n2) {
        return n1 * n2;
    }

    public static int divi(int n1, int n2) {
        return n1 / n2;
    }

}
