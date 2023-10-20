/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionesmenuresturante;

import javax.swing.JOptionPane;

/**
 *
 * @author angie
 */
public class Funcionesmenuresturante {
  
    public static int comidas(String c,int vc){
        int cs = Integer.parseInt(JOptionPane.showInputDialog("**comidas**\"\n" +
                "1 para arroz con pollo consome de pollo $12000 \"\n" +
                "2 para arroz blanco con sanchoco carne asada $15.000\"\n" +
                "3 para arroz con zanahoria, sanchoco de gallina,carne de cerdo $1700\"\n" +
                "4 para arroz blaco con sanchoco, pechuga a la plancha $12000\""));
        
        switch(cs){
            case 1:
                c = "arroz con pollo consome de pollo";
                vc = 12000;
                break;
            case 2:
                c = "arroz blanco con sancocho carne asada";
                vc = 15000;
                break;
            case 3:
                c = "arroz con zanahoria, sancocho de gallina, carne de cerdo";
                vc = 17000;
                break;
            case 4:
                c = "arroz blanco con sancocho, pechuga a la plancha";
                vc = 12000;
                break;
        }
        return  0;
        
    }
    public static int bebidas(String b,int vb){
        int bebidas = Integer.parseInt(JOptionPane.showInputDialog("**bebidas"
                + "\n 1 para botella de agua $2000"
                + "\n 2 para jugo natural en agua $3000"
                + "\n 3 para jugo natural en leche $4000"
                + "\n 4 para cerveza $4000"
                + "\n 5 para ninguna $00"));
        
        switch(bebidas){
            case 1:
                b = "botella de agua";
                vb = 2000;
                break;
            case 2:
                b = "jugo natural en agua";
                vb = 3000;
                break;
            case 3:
                b = "jugo natural en leche";
                vb = 4000;
                break;
            case 4:
                b = "cerveza";
                vb = 4000;
                break;
            case 5:
                b = "ninguna";
                vb = 00;
        }
        return 0;
    }

    public static int total(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        String comida="",bebida="";
        int valorc=0,  valorb=0;
        JOptionPane.showMessageDialog(null,"su comida es: "+comidas(comida,valorc)
                + "\n el valor de su comida es: "+comidas(comida,valorc)
                + "\n su bebida es: "+bebidas(bebida,valorb)
                + "\n el valor de su bebida es: "+bebidas(bebida,valorb)
                + "\n total a pagar es: "+total(valorc,valorb));
    }
    
    
}
