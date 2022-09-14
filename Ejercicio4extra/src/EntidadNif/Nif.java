
package EntidadNif;


public class Nif {
    
    private long dni;
    private String letra;// con chart no tiene los mismos metodos que con STRing.

    public Nif() {
    }

    public Nif(long dni, String letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Nif{" + "dni=" + dni + ", letra=" + letra + '}';
    }
    
    
    
    
    
}
