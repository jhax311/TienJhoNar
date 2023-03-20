package tienjhonar;

/**
 *
 * @author Jhoel Alexander Narváez Valarezo
 */
public class TvJhoNar extends Ele36JhoNar {

    private int resolucion;
    private boolean sintonizador;

    public TvJhoNar() {
        super();
        this.resolucion = 20;
        this.sintonizador = false;
    }

    public TvJhoNar(double precio, double peso) {
        super(precio, peso);
        this.resolucion = 20;
        this.sintonizador = false;
    }
    public TvJhoNar(int resol, boolean tdt){
        super();
        this.resolucion=resol;
        this.sintonizador=tdt;
        
    }
 
    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }
    @Override
    public double precioFinal(){
        double precio=super.precioFinal();
        if (getResolucion() > 40) {
            precio= (precio*0.3)+precio;
        }
        if (isSintonizador()) {
            precio+=50;
        }
        return precio;
    }
    
    
    //FINNNNNNNN

    @Override
    public String toString() {
        return super.toString()+"\tTelevision \n\tresolucion=" + resolucion + "\n\tsintonizador=" + sintonizador ;
    }

}
