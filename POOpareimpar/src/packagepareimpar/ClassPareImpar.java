/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packagepareimpar;

import javax.swing.JOptionPane;

public class ClassPareImpar {
    public int numero;

    public ClassPareImpar(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int Mayor(){
        if(numero%2==0){
            JOptionPane.showMessageDialog(null,"el numero "+numero+" es par");
        }else{
            JOptionPane.showMessageDialog(null,"el numero "+numero+" es impar");
        }
        return numero;
    }
    
}
