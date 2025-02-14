//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner scxrt = new Scanner(System.in);

        int [] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scxrt.nextInt();
        }

        System.out.println("\nNúmeros ingresados:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        // Ordenar el arreglo para la búsqueda binaria
        Arrays.sort(numeros);
        System.out.println("\nArreglo ordenado: " + Arrays.toString(numeros));


        System.out.print("Ingrese un número a buscar: ");
        int objetivo = scxrt.nextInt();

        // Búsqueda secuencial
        int resultadoSecuencial = Busqueda.busquedaSecuencial(numeros, objetivo);
        System.out.println((resultadoSecuencial != -1)
                ? "Encontrado con búsqueda secuencial en la posición: " + resultadoSecuencial
                : "No encontrado con búsqueda secuencial");

        // Búsqueda binaria
        int resultadoBinario = Busqueda.busquedaBinaria(numeros, objetivo);
        System.out.println((resultadoBinario != -1)
                ? "Encontrado con búsqueda binaria en la posición: " + resultadoBinario
                : "No encontrado con búsqueda binaria");
        }
    }
