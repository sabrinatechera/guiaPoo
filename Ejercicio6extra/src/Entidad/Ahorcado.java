
package Entidad;




public class Ahorcado {
    
    private String [] buscar;
    private Integer intentos;
    private Integer errados;
    private Integer encontradas;

    public Ahorcado() {
    }

    public Ahorcado(String[] buscar, Integer intentos, Integer errados, Integer encontradas) {
        this.buscar = buscar;
        this.intentos = intentos;
        this.errados = errados;
        this.encontradas = encontradas;
    }

    public String[] getBuscar() {
        return buscar;
    }

    public void setBuscar(String[] buscar) {
        this.buscar = buscar;
    }

    public Integer getIntentos() {
        return intentos;
    }

    public void setIntentos(Integer intentos) {
        this.intentos = intentos;
    }

    public Integer getErrados() {
        return errados;
    }

    public void setErrados(Integer errados) {
        this.errados = errados;
    }

    public Integer getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(Integer encontradas) {
        this.encontradas = encontradas;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "buscar=" + buscar + ", intentos=" + intentos + ", errados=" + errados + ", encontradas=" + encontradas + '}';
    }
    
 
    
    
}
