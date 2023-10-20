/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediaycerosjava;

import javax.swing.JOptionPane;

public class Mediaycerosjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num[] = new int[5];
        int i, a, nceros = 0;
        float suma = 0, acu1 = 0, media1 = 0, media2 = 0, suma2 = 0, acu2 = 0;

        for (i = 0; i <= 4; i++) {
            num[i] = Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
        }

        for (a = 0; a <= 4; a++) {
            if (num[a] > 0) {
                suma += num[a];
                acu1++;
                media1 = suma / acu1;
            }

            if (num[a] < 0) {
                suma2 += num[a];
                acu2++;
                media2 = suma / acu2;
            }

            if (num[a] == 0) {
                nceros++;
            }
        }
        JOptionPane.showMessageDialog(null, "la media de los numeros positivos es: " + media1
                + "\n la media de los numeros negativos es: -" + media2
                + "\n la cantidad de numeros ceros es: " + nceros);

    }

}
