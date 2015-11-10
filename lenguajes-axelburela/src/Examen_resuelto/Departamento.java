//BURELA NAVA AXEL Y.

package Examen_resuelto;

import java.io.Serializable;


public class Departamento implements Serializable {
    private String nombre;
   
    public Departamento(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
