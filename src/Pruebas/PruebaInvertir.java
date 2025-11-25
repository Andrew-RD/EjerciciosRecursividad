package Pruebas;

import Ejercicios.Invertir;
import java.util.Scanner;

public class PruebaInvertir {

    public static void probar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== PRUEBA EJERCICIO 3: INVERTIR CADENA ===");
        System.out.print("Ingrese una cadena de texto: ");
        String texto = sc.nextLine();

        String invIterativo = Invertir.invertirIterativo(texto);
        String invRecursivo = Invertir.invertirRecursivo(texto, 0);

        System.out.println("-> Original:  " + texto);
        System.out.println("-> Iterativo: " + invIterativo);
        System.out.println("-> Recursivo: " + invRecursivo);
    }
}