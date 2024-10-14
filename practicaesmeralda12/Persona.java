/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaesmeralda12;

/**
 *
 * @author Andrea
 */
public class Persona {
    String nombre;
    String apellidos;
    int edad;
    String genero;
    String nacionalidad;
    
    
    
public Persona (String nombre, String apellidos, int edad, String genero, String nacionalidad ){
this.nombre = nombre;
this.apellidos = apellidos;
this.edad = edad;
this.genero = genero;
this.nacionalidad = nacionalidad;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }


}

