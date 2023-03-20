package tienjhonar;

/**
 *
 * @author Jhoel Alexander Narváez Valarezo
 */
public class LavJhoNar extends Ele36JhoNar {

    private double carga;

    public LavJhoNar() {
        super();
        this.carga = 5;
    }

    public LavJhoNar(double precio, double peso) {
        super(precio, peso);
        this.carga = 5;
    }

    public LavJhoNar(double carga) {
        super();
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }
    @Override
    public double precioFinal() {
        double precio = super.precioFinal();
        if (getCarga() > 30) {
            precio += 50;
        }
        return precio;
    }
    @Override
    public String toString() {
        return super.toString()+"\tLavadora \n\tcarga=" + carga;
    }
}
