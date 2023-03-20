package tienjhonar;

/**
 *
 * @author Jhoel Alexander Narváez Valarezo
 */
public class Ele36JhoNar {

    protected enum tipoColor {
        blanco, negro, rojo, azul, gris
    };
    protected double pecioBase;
    protected tipoColor color;
    protected char conEner;
    protected double peso;

    public Ele36JhoNar() {
        pecioBase = 100;
        color = tipoColor.blanco;
        conEner = 'F';
        peso = 5;
    }

    public Ele36JhoNar(double precio, double peso) {
        this();
        this.pecioBase = precio;
        this.peso = peso;
    }

    public Ele36JhoNar(double precio, String eColor, char consumo, double peso) {
        this();
        this.pecioBase = precio;
        this.peso = peso;
        if (comColor(eColor)) {
           this.color = tipoColor.valueOf(eColor.toLowerCase());
        }
        if (comConsuEner(consumo)) {
          consumo=Character.toUpperCase(consumo);
            this.conEner = consumo;
        }
        
    }

    public double getPecioBase() {
        return pecioBase;
    }

    public tipoColor getColor() {
        return color;
    }

    public char getConEner() {
        return conEner;
    }

    public double getPeso() {
        return peso;
    }

    //char A=65 F=70
    public boolean comConsuEner(char esLetra) {
        esLetra= Character.toUpperCase(esLetra);
        return esLetra >= 65 && esLetra <= 70;

    }

    public boolean comColor(String colors) {
        try {
            tipoColor seAcceptaColor = tipoColor.valueOf(colors.toLowerCase());
            return true;
        } catch (IllegalArgumentException iae) {
            return false;
        } 
    }
    
    public double precioFinal(){
        double precio=getPecioBase();
        int consum= getConEner();
        double pesoPre= getPeso();
        switch (consum) {
            case 65 -> precio +=100;
            case 66 -> precio +=80;
            case 67 -> precio +=60;
            case 68 -> precio +=50;
            case 69 -> precio +=30;
            case 70 -> precio +=10;
            
        }
        if (pesoPre > 80) {
            precio+=100;
        }else if (pesoPre >= 50) {
            precio+=80;
        }else if (pesoPre >= 20) {
            precio+=50;
        }else if (pesoPre >= 0) {
            precio+=10;
        }

        return precio;
    }

    @Override
    public String toString() {
        return "\tElectrodomestico \n\tpecioBase=" + pecioBase
                + "\n\t color=" + color + "\n\t conEner=" + conEner + "\n\t peso=" + peso + "\n ";
    }

}
