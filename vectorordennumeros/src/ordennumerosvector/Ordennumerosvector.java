/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordennumerosvector;

import javax.swing.JOptionPane;

/**
 *
 * @author angie
 */
public class Ordennumerosvector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeros[] = new int[10];
        int i,a;
        int primero,segundo=0,tercero=0,cuarto=0,quinto=0,sexto=0,septimo=0,octavo=0,noveno=0,decimo=0;
        
        for(i=0 ; i<=2 ; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("ingrese numero "+(i+1)));
        }
        
        for(a=0 ; a<=2 ; a++){
            if(primero>0 && primero<numeros[a+1]){
                primero = numeros[a];
            }
            if(numeros[0]>primero && numeros[a]<numeros[a+1]){
                segundo = numeros[a];
            }
            
        }
        JOptionPane.showMessageDialog(null,"el primero es: "+primero+
                "\n el segundo es: "+segundo);
    }
    
}
