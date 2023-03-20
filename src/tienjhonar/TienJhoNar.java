

package tienjhonar;

/**
 *
 * @author Jhoel Alexander Narváez Valarezo
 */
public class TienJhoNar {

    public static void main(String[] args) {
        //array
        Ele36JhoNar electro[]= new Ele36JhoNar[10];
        electro[0]= new Ele36JhoNar();
        //con precio y peso
        electro[1]= new Ele36JhoNar(300,5);
        //precio, eColor, consumo,peso
        electro[2]= new Ele36JhoNar(42,"Rojo",'b',40);
        electro[3]= new LavJhoNar();
        //con carga
        electro[4]= new LavJhoNar(20);
        //precio peso
        electro[5]= new LavJhoNar(200,5);
        electro[6]= new TvJhoNar();
        //precio peso
        electro[7]= new TvJhoNar(500,1);
        //resolucion, tdt
        electro[8]= new TvJhoNar(100,true);
        //prueba con un color que no este en enum y una letra que no es de consumo
        //comprobamos que coje los valorespor defecto
        electro[9]= new Ele36JhoNar(42,"amarillo",'k',40);;
        
        //PARA LAS SUMAS FINALES
        double precioEle,precioLava,precioTele;
        precioEle=precioLava=precioTele=0;
        
        for (Ele36JhoNar electro1 : electro) {
            if (electro1 != null) {
                 if (electro1 instanceof Ele36JhoNar) {
                    precioEle += electro1.precioFinal();
               }
                //usamos el instanceof para comprobar si el objeto es de x clase
                if (electro1 instanceof LavJhoNar) {
                    precioLava += electro1.precioFinal();
               }  else if (electro1 instanceof TvJhoNar) {
                    precioTele += electro1.precioFinal();
                }
            }
        }
        
        System.out.println("Precio final de los eletrodomesticos es: "+precioEle+" euros");
        System.out.println("Precio final de lavadoras es: "+precioLava+" euros");
        System.out.println("Precio final de televiciones es: "+precioTele+" euros");
        
                
    }
   
}
