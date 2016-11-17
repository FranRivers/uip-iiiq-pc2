package Mascotas;

public class Perro {

    public int Life1 = 50;
    private int comer = 10;
    private int ladrar = 2;
    private int correr = 5;


    public int Life1() {
        return Life1;
    }

    public void comer() {
        System.out.print("Alimento a su perro + 10 ");
        Life1 = Life1 + comer;
        System.out.println("\nSu vida actual es de " + Life1 + " puntos de vida.");
    }

    public void ladrar() {
        Life1= Life1 - ladrar;
        System.out.println("Guauf Guafu  Tu perro ha Ladrado. - 2");
        System.out.println("\nSu vida actual es de " + Life1 + " puntos de vida.");
    }

    public void correr() {
        Life1 = Life1 - correr;
        System.out.println("Vaya como ha corrido. -5 ");
        System.out.println("\nSu vida actual es de " + Life1 + " puntos de vida.");
    }


    public void salir() {
        System.out.print("Usted eligio salir.");
        System.exit(-1);
    }
}
