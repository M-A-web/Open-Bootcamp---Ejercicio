public class Main {
    public static void main(String[] args) {

        /*Primera parte */
        System.out.println("primera parte");

        System.out.println("el coche tiene"+" "+suma(1000, 2000, 30000)+"km");

        /*Segunda parte */
        System.out.println("segunda parte");

           coche miCoche = new coche();

          while(miCoche.cantidadPuertas<4){
           miCoche.cantidadPuertas++;
          }

           System.out.println("el coche tiene "+miCoche.cantidadPuertas+" puertas");

           miCoche.añadirPuerta();

          System.out.println("ahora el coche tiene "+miCoche.cantidadPuertas+" puertas en total");


    }

    /*Primera parte */
    public static int suma(int km1,int km2,int km3){
        return km1+km2+km3;

    }

}