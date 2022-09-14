package servicio;

import entidad.Persona;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


import java.util.Scanner;

public class ServicePersona {

    Scanner leer = new Scanner(System.in);

    public void crearPersona(Persona persona) {

        System.out.println(" ingrese su nombre ");
        persona.setNombre(leer.nextLine());

        System.out.println(" ingrese dia de nacimiento");
        int dia = leer.nextInt();
        System.out.println(" ingrese mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println(" ingrese anio de nacimiento");
        int anio = leer.nextInt();
        
      LocalDate fechaNac = LocalDate.of(anio, mes, dia);     
      persona.setFechaNac(fechaNac);
    }

   public void calcularEdad(Persona persona){
       
       
     ChronoUnit.YEARS.between(persona.getFechaNac(), LocalDate.now());
       
   }
  /**
   * si luego apretas control y barra te ofrece la explicacion 
   * @param edad2
   * @param persona
   * @return false blablabalabla
   */
   public boolean menorQue(int edad2, Persona persona){
       
       
       int edad1= (int) ChronoUnit.YEARS.between(persona.getFechaNac(), LocalDate.now());
       
       
    return edad1>edad2;    

       
   }
   /**
    * 
    * @param persona 
    */
   public void mostrarPersona(Persona persona){
       
       
       System.out.println("su nombre es "+ persona.getNombre()+" su fecha de nacimiento es"+ persona.getFechaNac());  
       System.out.println(" su edad es :"+ ChronoUnit.YEARS.between(persona.getFechaNac(), LocalDate.now()));
   }
   
   
    
}
