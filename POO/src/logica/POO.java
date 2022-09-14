package logica;

public class POO {

    public static void main(String[] args) {

        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(36, " sabrina", "techera");

        System.out.println(" la id del alumno 2 es " + alu2.getId());
        System.out.println(" el nombre del alumno 2 es " + alu2.getNombre());
        System.out.println(" elapellido del alumno 2 es " + alu2.getApellido());

        alu1.setId(33);
        alu1.setApellido("sosa");
        alu1.setNombre("Gladys");
        
        System.out.println("--------------------");
        
         System.out.println(" la id del alumno 1 es " + alu1.getId());
        System.out.println(" el nombre del alumno 1 es " + alu1.getNombre());
        System.out.println(" elapellido del alumno 1 es " + alu1.getApellido());
        
         System.out.println("--------------------");
        alu2.setId(38);// sobreescribir los datos ingresados.
        
        System.out.println(" la id del alumno 2 es " + alu2.getId());
        System.out.println(" el nombre del alumno 2 es " + alu2.getNombre());
        System.out.println(" elapellido del alumno 2 es " + alu2.getApellido());
        
        
        
    }

}
