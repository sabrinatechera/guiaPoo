
import Entidad.Ahorcado;
import Service.ServiceAhorcado;

//
//
//packagMétodo buscar(letra): este método recibe una letra dada por el usuario y busca sila
//letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
//• Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
//cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
//devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
//busque una letra que no esté, se le restará uno a sus oportunidades.
//• Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
//• Método juego(): el método juego se encargará de llamar todos los métodos
//previamente mencionados e informará cuando el usuario descubra toda la palabra o
//se quede sin intentos. Este método se llamará en el main.e ejercicio6extra;


public class Ejercicio6extra {

    public static void main(String[] args) {
    
       Ahorcado juego1= new Ahorcado();
       ServiceAhorcado service= new ServiceAhorcado();
       
       service.juego(juego1);
       
       
       
        
    }
    
}
