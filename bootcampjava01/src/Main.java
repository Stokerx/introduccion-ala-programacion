public class Main {

    public static void main(String[] args) {
     Potato miPotato = new Potato();
     miPotato.Quitarbrazo();
        miPotato.Quitarbrazo();
        miPotato.Quitarbrazo();
        System.out.println(miPotato.brazo);



    }

    public static int suma(int a, int b) {

        return a + b;

    }
}

class Potato {
    public int brazo = 3;

    public void Quitarbrazo(){

    {

        this.brazo--;
    }
}


}