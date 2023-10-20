/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numberlargestjava;

import javax.swing.JOptionPane;

/**
 *
 * @author angie
 */
public class Numberlargestjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number[] = new int[3];
        int i,a,largest=0;
        
        for(i=0 ; i<=2 ; i++){
            number[i] = Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
        }
        
        number[0] = largest;
        
        for(a=0 ; a<=2 ; a++){
            if(number[a]>largest){
                largest = number[a];
            }
        }
        JOptionPane.showMessageDialog(null,"the largest number is: "+largest);
    }
    
}
