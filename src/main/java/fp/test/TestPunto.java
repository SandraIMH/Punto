package fp.test;
import fp.punto.*;

/**
 *
 * @author SandraIMH
 */

public class TestPunto extends Test {
    public static void main(String[] args){
        Punto p = new Puntolmpl(2.0, 3.0);
        mostrar("Punto: ", p);
        p.setX(3.0);
        mostrar("Punto:", p);
        p.setY(2.0);
        mostrar("Punto:",p);
        
        Punto p2 = new Puntolmpl(-1.0, -3.0);
        Double distancia = p.getDistanciaAOtroPunto(p2);
        mostrar("Distancia entre los puntos: ", distancia);
    }
}
