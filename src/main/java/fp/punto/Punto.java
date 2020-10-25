package fp.punto;

/**
 *
 * @author SandraIMH
 */

public interface Punto {
    public void setX(Double x);
    public void setY(Double y);
    public Double getX();
    public Double getY();
    Double getDistanciaAOtroPunto(Punto p);
}
