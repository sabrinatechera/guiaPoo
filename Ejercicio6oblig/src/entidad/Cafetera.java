package entidad;

public class Cafetera {

    private int capMaxima;
    private long camActual;

    public Cafetera() {
    }

    public Cafetera(int capMaxima, long camActual) {
        this.capMaxima = capMaxima;
        this.camActual = camActual;
    }

    public int getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }

    public long getCamActual() {
        return camActual;
    }

    public void setCamActual(long camActual) {
        this.camActual = camActual;
    }


    
}
