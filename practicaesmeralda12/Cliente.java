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
public class Cliente extends Persona {
    private int id_cliente;
    private String correo;
    private String direccion;
    private int puntos_acumulados;
            
 public Cliente(String nombre, String apellidos, int edad, String genero, String nacionalidad, int id_cliente, String correo, String direccion, int puntos_acumulados) {
 super(nombre, apellidos, edad, genero, nacionalidad);
 this.id_cliente = id_cliente;
 this.correo = correo;
 this.direccion = direccion;
 this.puntos_acumulados = puntos_acumulados;
 
 }         

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getPuntos_acumulados() {
        return puntos_acumulados;
    }

    public void setPuntos_acumulados(int puntos_acumulados) {
        this.puntos_acumulados = puntos_acumulados;
    }

    public void contactarunrepresentante() {
        System.out.println("Esta contactando con un representante");
    }

    public void solicitarinformacion() {
        System.out.println("Esta solicitando informacion");
    }
      
            
}
