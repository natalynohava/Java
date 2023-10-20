
package packagemenu;

import javax.swing.JOptionPane;

public class Classfrutas {

    public int fruta, cantidad, valor, total,menu;
    public String nombre;

    public Classfrutas(int fruta, int cantidad, String nombre) {
        this.fruta = fruta;
        this.cantidad = cantidad;
        this.nombre = nombre;
    }

    public int getFruta() {
        return fruta;
    }

    public void setFruta(int fruta) {
        this.fruta = fruta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public int menu() {
        switch (fruta) {
            case 1: {
                valor = 1000;
                total = valor * cantidad;
                JOptionPane.showMessageDialog(null, "nombre: " + nombre+"\n"
                        +"fruta: Manzana"+"\n"
                        +"su total a pagar es de: " + total);
                break;
            }
            case 2: {
                valor = 500;
                total= valor * cantidad;
                JOptionPane.showMessageDialog(null, "nombre: " + nombre+"\n"
                        + "fruta: Pera"+"\n"
                        + "su total a pagar es de: " + total);
                break;
            } // cierre caso 2
            case 3: {
                valor = 400;
                total = valor * cantidad;
                JOptionPane.showMessageDialog(null, "nombre: " + nombre+ "\n"
                        + "fruta: piña"+ "\n"
                        + "su total a pagar es de: " + total);
                break;
            } //cierre caso 3
           
            default: {
                JOptionPane.showMessageDialog(null, "no es una opcion");
            }
        }//cierre del switch

        return fruta;

    }

}
