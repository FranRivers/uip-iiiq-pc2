package Mascotas;

public class Gato {

    public int Life2 = 30;
    private int caminar = 5;
    private int comer = 5;
    private int dormir = 2;

    public int Life2() {
    return Life2;
    }

    public void caminar() {
        Life2 = Life2 - caminar;
        System.out.println("Tu Gato ha caminado -5");
        System.out.println("Su vida actual es de " + Life2 + " puntos de vida.");
    }

    public void comer() {
        Life2 = Life2 + comer;
        System.out.println("Tu Gato ha comido + 5");
        System.out.println("Su vida actual es de " + Life2 + " puntos de vida.");
    }

    public void dormir() {
        Life2 = Life2 + dormir;
        System.out.println("Tu Gato ha dormido + 2");
        System.out.println("Su vida actual es de " + Life2 + " puntos de vida.");
    }
    public void salir() {
        System.out.print("Usted eligio salir.");
        System.exit(-1);
    }
}

