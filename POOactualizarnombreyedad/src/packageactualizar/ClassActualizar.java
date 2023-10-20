package packageactualizar;

import javax.swing.JOptionPane;

/**
 *
 * @author angie
 */
public class ClassActualizar {
    public String nombre;
    public int edad;
    
    //-------METODO CONSTRUCTOR
    public ClassActualizar(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //-------METODO GET AND SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
