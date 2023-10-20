/*pedir 3 id y guerdarlas en un vector
 */
package vectorguardarid;

import javax.swing.JOptionPane;

public class Vectorguardarid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int id[] = new int[3];
        int i, acu = 0;

        for (i = 0; i <= 2; i++) {
            id[i] = Integer.parseInt(JOptionPane.showInputDialog("ingresa id " + (i + 1)));
        }
    }
    
}
