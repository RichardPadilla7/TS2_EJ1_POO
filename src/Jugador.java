//Richard Padilla
public class Jugador{

    String nombre, posicion;
    int edad, nCamiseta;

    public Jugador(String nombre, String posicion, int edad, int nCamiseta){
        this.nombre=nombre;
        this.posicion=posicion;
        this.edad=edad;
        this.nCamiseta=nCamiseta;
    }


    public void Delantero(){
        System.out.println("1.- Soy " + nombre + " jugador de la seleccion del Ecuador como " + posicion +
                ". Tengo " + edad + " años y mi numero de camistea es el " + nCamiseta +
                ". Deseame suerte en el partido!!,");

    }

    public void Defensa(){
        System.out.println("2.- Yo soy " + nombre + " perteneciente de la TRI como " + posicion +
                ". LLevo 2 años en la seleccion y tengo " + edad + " años con el numero " + nCamiseta + " en la camiseta." );

    }

    public void Arquero(){
        System.out.println("3.- El jugador " + nombre + ", " + posicion + " de la seleccion del Ecuador. El dia de hoy cumpple " + edad +
                " años y le otorgaron el numero " + nCamiseta + " como regalo.");

    }


    public static void main(String[] args){

        Jugador delantero1 = new Jugador("Antonio Valencia", "Delantero", 35, 7);
        delantero1.Delantero();
        Jugador defensa1 = new Jugador("Luis Suarez", "Defensa", 25, 10);
        defensa1.Defensa();
        Jugador arquero1 = new Jugador("Marco Dinamita", "Arquero", 22, 22);
        arquero1.Arquero();

    }
}