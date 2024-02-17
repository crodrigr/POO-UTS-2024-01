package javaapplication11;

import java.util.Scanner;

public class InvertirNumero {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        // Llamar a la función para invertir el número
        int numeroInvertido = invertirNumero(numero);

        // Mostrar el resultado
        System.out.println("Número invertido: " + numeroInvertido);

        // Cerrar el Scanner
        scanner.close();
    }

    // Función para invertir un número
    public static int invertirNumero(int num) {
        int numeroInvertido = 0;

        // Mientras haya dígitos en el número
        while (num != 0) {
            // Obtener el último dígito
            int digito = num % 10;

            // Agregar el dígito al número invertido
            numeroInvertido = numeroInvertido * 10 + digito;

            // Eliminar el último dígito del número original
            num = num / 10;
        }

        return numeroInvertido;
    }
}
