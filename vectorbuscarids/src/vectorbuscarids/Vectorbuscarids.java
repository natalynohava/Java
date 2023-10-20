/*
 */
package vectorbuscarids;

import javax.swing.JOptionPane;

public class Vectorbuscarids {

    public static void main(String[] args) {
        int id[] = new int[3];
        int  i,q,numberdelete;
        String message="";
        
        for(i=0 ; i<=2 ; i++){
            id[i] =Integer.parseInt(JOptionPane.showInputDialog("Enter id "+(i+1)));
        }
        
        q = Integer.parseInt(JOptionPane.showInputDialog("Enter id to delete"));
        
        for(i=0 ; i<=2 ; i++){
            if(q==id[i]){
               id[i] = 0;
            }
            message += id[i] + "\n";
        }
        JOptionPane.showMessageDialog(null,message);
    }
}
