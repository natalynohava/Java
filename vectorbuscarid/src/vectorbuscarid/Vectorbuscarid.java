/*gusrdar 3 id en un vector y buscar 1 
 */
package vectorbuscarid;

import javax.swing.JOptionPane;

/**
 *
 * @author angie
 */
public class Vectorbuscarid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int id[] = new int[3];
        int i, acu = 0;

        for (i = 0; i <= 2; i++) {
            id[i] = Integer.parseInt(JOptionPane.showInputDialog("ingresa id " + (i + 1)));
        }

        int q = Integer.parseInt(JOptionPane.showInputDialog("ingresa la identificacion a buscar"));

        for (i = 0; i <= 2; i++) {
            if (q == id[i]) {
                acu = acu + 1;
                JOptionPane.showMessageDialog(null, "ya existe");
            } else {
                acu = 0;
            }
        }
    }
}
