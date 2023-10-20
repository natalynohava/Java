package menupackage;

import javax.swing.JOptionPane;

/**
 *
 * @author angie
 */
public class ClassMenu {
    public int menucomida,menubebida,comidas,bebidas,valorc,valorb;
    public String comida;
    public String bebida;
    public String nombre,apellido,identificacion;
    
    /*<------------------------------------------------METODO CONSTRUCTOR-------------------------------------->*/

    public ClassMenu(int comidas, int bebidas, String nombre, String apellido, String identificacion) {
        this.comidas = comidas;
        this.bebidas = bebidas;
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
    }

    
    public int getComidas(){    
        return comidas;
    }

    public void setComidas(int comidas) {
        this.comidas = comidas;
    }

    public int getBebidas() {
        return bebidas;
    }

    public void setBebidas(int bebidas) {
        this.bebidas = bebidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    /*<------------------------------------------------METODO GET AND SET-------------------------------------->*/
    public void setIdentificacion(String identificacion) {    
        this.identificacion = identificacion;
    }

    /*<------------------------------------------------METODOS MENUS------------------------------------------>*/
    public int menucomida() {
        switch(comidas){
            case 1:
                comida = "arroz con pollo y consome de pollo";
                valorc = 12000;
                
                break;
            case 2:
                comida = "arroz blanco con sancocho, carne asada";
                valorc = 12000;
                break;
            case 3:
                comida = "arroz con zanahoria, sancocho de gallina, carne de cerdo";
                valorc = 12000;
                break;
            case 4:
                comida = "arroz blanco con sancocho, pechuga a la plancha";
                valorc = 12000;
                break;                
        }
        return comidas;
    }
    public int menubebidas(){
            switch (bebidas) {
                case 1:
                    bebida = "botella de agua";
                    valorb = 2000;
                    JOptionPane.showMessageDialog(null,"su nombre es: "+nombre+"\n"
                        + "su apellido es: "+apellido+"\n"
                        + "su identificacion es: "+identificacion+"\n"
                        + "su comida es: "+comida+"\n"
                        + "valor comida: "+valorc+"\n"
                        + "su bebida es :"+bebida +"\n"
                        + "valor bebida: "+valorb+"\n"
                        + "total a pagar es: "+(valorc+valorb)
                    );
                    break;
                case 2:
                    bebida = "jugo natural en agua";
                    valorb = 3000;
                    JOptionPane.showMessageDialog(null,"su nombre es: "+nombre+"\n"
                        + "su apellido es: "+apellido+"\n"
                        + "su identificacion es: "+identificacion+"\n"
                        + "su comida es: "+comida+"\n"
                        + "valor comida: "+valorc+"\n"
                        + "su bebida es :"+bebida +"\n"
                        + "valor bebida: "+valorb+"\n"
                        + "total a pagar es: "+(valorc+valorb)+"\n"
                    );
                    break;
                case 3:
                    bebida = "jugo natural en leche";
                    valorb = 4000;
                    JOptionPane.showMessageDialog(null,"su nombre es: "+nombre+"\n"
                        + "su apellido es: "+apellido+"\n"
                        + "su identificacion es: "+identificacion+"\n"
                        + "su comida es: "+comida+"\n"
                        + "valor comida: "+valorc+"\n"
                        + "su bebida es :"+bebida+"\n"
                        + "valor bebida: "+valorb+"\n"
                        + "total a pagar es: "+(valorc+valorb)
                    );
                    break;
                case 4:
                    bebida = "cerveza";
                    valorb = 4000;
                    JOptionPane.showMessageDialog(null,"su nombre es: "+nombre+"\n"
                        + "su apellido es: "+apellido+"\n"
                        + "su identificacion es: "+identificacion+"\n"
                        + "su comida es: "+comida+"\n"
                        + "valor comida: "+valorc+"\n"
                        + "su bebida es :"+bebida +"\n"
                        + "valor bebida: "+valorb+"\n"
                        + "total a pagar es: "+(valorc+valorb)
                    );
                    break;
                case 5:
                    bebida = "ninguna";
                    valorb = 00;
                    JOptionPane.showMessageDialog(null,"su nombre es: "+nombre+"\n"
                        + "su apellido es: "+apellido+"\n"
                        + "su identificacion es: "+identificacion+"\n"
                        + "su comida es: "+comida+"\n"
                        + "su valor es: "+valorc+"\n"
                        + "su bebida es:"+bebida +"\n"
                        + "valor bebida: "+valorb+"\n"
                        + "total a pagar es: "+(valorc+valorb)
                    );
                    break;
            }
            return bebidas;
    }
    
    
}
