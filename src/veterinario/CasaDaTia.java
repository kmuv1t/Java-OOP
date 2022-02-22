package veterinario;

public class CasaDaTia {

    public static void main(String[] args){
        Gato felix = new Gato();
        Gato garfield = new Gato();
        felix.miar();

        felix.calcularDose(6, 5);
        System.out.println("O gato deve tomar gotas(s)");
    }
}