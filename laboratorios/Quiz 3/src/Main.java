import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        int cent = 1 ;
        double usd, eur;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Convertidor de centavos");

        System.out.print("¿Cuantos centavos tienes?: " );
        cent = Integer.parseInt(br.readLine());

        if (cent >= 0 ) {


            System.out.println("Tienes " + cent + " centavos.");

            usd = cent / 100.0;
            eur = usd * 0.89;

            System.out.println("USD = $" + usd);
            System.out.println("EUR = €" + eur);
        } else if( cent <0 ){
            System.out.println("Por favor Introduzca una cantidad valida.");
        }

    }
}