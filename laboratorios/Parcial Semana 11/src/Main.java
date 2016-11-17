// Programa diseño por Francisco Rios & Freddy Galvez
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {

        String name = "";
        int ol, op = 0, life = 0, accr = 0;
        short pnt = 0;
        System.out.println("\t\tBienvenido....\n\n\t¿Que mascota desea usar hoy?\n\n\t\t\tPerro = 1 \n\t\t\tGato = 2");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ol = Integer.parseInt(br.readLine());

        if (ol == 1) {
            Mascotas.Perro p1 = new Mascotas.Perro();
            System.out.println("\t\t\tPor favor ponle un nombre a tu mascota.");
            name = br.readLine();
            System.out.println("\t\t" + name + " Es un perro Sus puntos de vida son 50 (Cada accion le suman o restan puntos de vida).");
            System.out.println("\t\tLas acciones que puede realizar son:  ");
            p1.Life1();
            while (p1.Life1() > 0) {
                accr ++;
                System.out.println("\t\t\t\t\t1. Comer (10 puntos de vida)\n\t\t\t\t\t2. Ladrar (- 2 puntos de vida)\n" +
                        "\t\t\t\t\t3. correr (- 5 puntos de vida).\n\t\t\t\t\t4. Salir\n\t\t\t\t\tDigite una opcion.");
                op = Integer.parseInt(br.readLine());
                switch (op) {
                    case 1:
                        p1.comer();
                        break;
                    case 2:
                        p1.ladrar();
                        break;
                    case 3:
                        p1.correr();
                        break;
                    case 4:
                        p1.salir();
                        break;
                }

            }
            pnt += p1.Life1;

        } else if (ol == 2) {
            Mascotas.Gato g1 = new Mascotas.Gato();
            System.out.println("\t\t\tPor favor ponle un nombre a tu mascota.");
            name = br.readLine();
            System.out.println("\t\t" + name + " Es un Gato Sus puntos de vida son 30 (Cada accion le suman o restan puntos de vida).");
            System.out.println("\t\tLas acciones que puede realizar son:  ");
            g1.Life2();
            while (g1.Life2() > 0) {
                accr ++;
                System.out.println("\t\t\t\t\t1. Comer (5 puntos de vida)\n\t\t\t\t\t2. dormir (2 puntos de vida)\n" +
                        "\t\t\t\t\t3. caminar (- 5 puntos de vida).\n\t\t\t\t\t4. Salir\n\t\t\t\t\tDigite una opcion.");
                op = Integer.parseInt(br.readLine());
                switch (op) {
                    case 1:
                        g1.comer();
                        break;
                    case 2:
                        g1.dormir();
                        break;
                    case 3:
                        g1.caminar();
                        break;
                    case 4:
                        g1.salir();
                        break;
                }

            }
            pnt += g1.Life2;
        } else {
            System.out.println("Error, opción no valida.");
        }
        final StringBuilder builder = new StringBuilder();
        builder.append("Nombre: " + name + "\r\n");

        builder.append("Acciones realizadas: " + accr + "\r\n");

        builder.append("puntos de vida:" + pnt + "\r\n");

        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("Datosmascota.txt")))) {
            writer.write(builder.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}