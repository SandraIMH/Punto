package fp.punto;

/**
 *
 * @author SandraIMH
 */

public class Puntolmpl implements Punto{
    private Double x;
    private Double y;
    
    public Puntolmpl(Double x1, Double y1){
        x = x1;
        y = y1;
    }
    public Double getX(){
        return x;
    }
    public Double getY(){
        return y;
    }
    public void setX(Double x1){
        x = x1;
    }
    public void setY(Double y1){
        y = y1;
    }
    public String toString(){
        String s = "("+getX()+","+getY()+")";
        return s;
    }
    public Double getDistanciaAOtroPunto(Punto p){
        Double dx = this.getX()-p.getX();
        Double dy = this.getY()-p.getY();
        return Math.sqrt(dx*dx + dy*dy);
    }

}
