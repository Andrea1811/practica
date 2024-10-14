/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaesmeralda12;

import java.util.Scanner;

/**
 *
 * @author Andrea
 */



public class ClasePrincipal {
    
public static void main(String[] args){
Empleado empleado = new Empleado("Andrea","Abreu",30,"Femenino","Tailandesa",01,20000,05,"DBA");
Cliente cliente = new Cliente ("Dalquiris","De la Cruz",22,"Femenino","Noregua",02,"dalquiqui09@gmail.com","CALLE #5",2333);
Scanner lectura = new Scanner (System.in);


int opcion = 0;
    System.out.println("Seleccione una opcion:");
    System.out.println("1. Solicitar un permiso como Empleado");
    System.out.println("2. Reportar horas extra como Empleado");
    System.out.println("3. Contactar un representante como Cliente");
    System.out.println("4. Solicitad información como Cliente");
    
    opcion = lectura.nextInt();
    
    
   switch (opcion){
       case 1:
           empleado.solicitudPermiso();
           break;
       case 2:
           empleado.reportarhorasextra();
           break;
       case 3:
           cliente.contactarunrepresentante();
           break;
       case 4:
           cliente.solicitarinformacion();
           break;
       default:
           System.out.println("NO VALIDO");
           
  
   } 

}

       }
