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
public class Empleado extends Persona{
    private int id_empleado;
    private int sueldo;
    private int horas_extra;
    private String cargo;
    
    
    
    
    public Empleado(String nombre, String apellidos, int edad, String genero, String nacionalidad, int id_empleado, int sueldo, int horas_extra, String cargo){
    super(nombre, apellidos, edad, genero, nacionalidad);
    this.id_empleado = id_empleado;
    this.sueldo = sueldo;
    this.horas_extra = horas_extra;
    this.cargo = cargo;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getHoras_extra() {
        return horas_extra;
    }

    public void setHoras_extra(int horas_extra) {
        this.horas_extra = horas_extra;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void solicitudPermiso() {
        System.out.println("Esta solicitando permiso");
    }

    public void reportarhorasextra() {
        System.out.println("Esta reportando horas extras");
    }
    
    
            
}
