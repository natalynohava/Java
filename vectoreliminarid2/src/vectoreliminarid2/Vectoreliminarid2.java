/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vectoreliminarid2;

import javax.swing.JOptionPane;

public class Vectoreliminarid2 {

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("wokers number"));

        int id[] = new int[n];
        int i, q, a;
        String message = "";

        for (i = 0; i <= (n - 1); i++) {
            id[i] = Integer.parseInt(JOptionPane.showInputDialog("enter id " + (i + 1)));
        }

        q = Integer.parseInt(JOptionPane.showInputDialog("enter id to delete"));

        for (i = 0; i <= (n - 1); i++) {
            if (q == id[i]) {
                id[i] = id[i + 1];
            }
            message += id[i] + "\n";
        } 
        

        JOptionPane.showMessageDialog(null, message);

    }
}
