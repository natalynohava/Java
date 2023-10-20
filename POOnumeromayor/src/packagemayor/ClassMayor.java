/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packagemayor;

import javax.swing.JOptionPane;

/**
 *
 * @author angie
 */
public class ClassMayor {
    public int num1,num2,num3;
    public String message;
    
    //<-------------------------------------METODO  CONSTRUCTOR----------------------------------------------->//
    public ClassMayor(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    //<-------------------------------------METODO GET AND SET------------------------------------------------->//

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }
    //<-------------------------------------METODO CONDICIONAL------------------------------------------------->//
    
    public void mayor(){
        if(num1>num2 && num1>num3){
            JOptionPane.showMessageDialog(null,"el numero mayor es: "+num1);
        }else{
            if(num2>num1 && num2>num3){
                JOptionPane.showMessageDialog(null,"el numero mayor es: "+num2);
            }else{
                if(num3>num1 && num3>num2){
                    JOptionPane.showMessageDialog(null,"el numero mayor es: "+num3);
                }
            }
        }
    }

   
    
}
