import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        double not;
        String nomb = "",r = "";
        BufferedReader te = new BufferedReader(new InputStreamReader(System.in));


      do{

        do {
            System.out.print("Por favor introduzca su nombre: ");
            try {
                nomb = te.readLine();
            } catch (Exception e) {
                System.out.println("Hubo excepcion....");
            }

            if (nomb.matches(".*\\d+.*")) {
                System.out.println("Hay un numero por ahí.");
            }
        } while (nomb.matches(".*\\d+.*"));

        do {
            System.out.print("Por favor introduzca su nota: ");
            try {
                not = Double.parseDouble(te.readLine());
            } catch (Exception f) {
                System.out.println("Error en lectura...");
                not = -1;
            }
            if (not == -1) {
                System.out.println("La nota es invalida.");
            }
        } while (not == -1);

        if (not < 0 || not > 100) {
            System.out.print("No Sigue instrucciones. ");
        } else if (not >= 91) {
            System.out.println("Su nombres es : " + nomb + " Obtuvo una A. ");
        } else if (not >= 81) {
            System.out.println("Su nombres es : " + nomb + " Obtuvo una B. ");
        } else if (not >= 71) {
            System.out.println("Su nombres es : " + nomb + " Obtuvo una C. ");
        } else if (not <= 70) {
            System.out.println("Su nombres es : " + nomb + " Obtuvo una F. ");

        }

        System.out.print("¿Desea continuar? S/N  ");
        r = te.readLine();
    }while(r.equals("S") || r.equals("s"));

        System.out.println("Gracias por usar el programa.");
    }
}