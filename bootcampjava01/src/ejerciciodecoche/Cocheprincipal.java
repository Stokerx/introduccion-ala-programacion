package ejerciciodecoche;

public class Cocheprincipal {

    static int sumar(int a , int b, int c){

        int suma = a + b + c;

        return suma;
    }


    public static void main(String[] args) {


        int resultado = sumar( 4,8,10);

        System.out.println(resultado);

        /*
            Parte 2
            Crear una clase coche.
            Dentro de la clase coche, una variable numérica que almacene
            el número de puertas que tiene.
            Una función que incremente el número de puertas que tiene
            el coche.
            Crear un objeto miCoche en el main y añadirle una puerta.
            Mostrar el número de puertas que tiene el objeto.
         */
        Coche miCoche = new Coche();
        int puertas = 4;
        miCoche.AgregarPuertas(puertas);
        System.out.println(miCoche.puertas);


    }
    public static int Sumar(int numA, int numB, int numC)
    {
        int resultado;
        resultado = numA + numB + numC;
        return resultado;
    }
}

class Coche
{
    //Atributos de la clase
    public int puertas = 0;

    public void AgregarPuertas(int puertasPa)
    {
        this.puertas += puertasPa;
    }
}