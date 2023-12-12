package proyecto_de_versiones;

import java.util.Random;
import java.util.Scanner;

public class Proyecto_de_versiones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("¡Bienvenido a la partida de dados de Dungeons and Dragons!");
        System.out.println("¿Cuántos dados quieres lanzar? (ej. 2d6 lanzará 2 dados de 6 caras)");

        String input = scanner.nextLine().toLowerCase(); // Ejemplo: 2d6, 3d8, etc.

        // Dividir la entrada en cantidad de dados y caras del dado
        String[] parts = input.split("d");

        if (parts.length != 2) {
            System.out.println("Entrada incorrecta. Debe ser en el formato XdY.");
            return;
        }

        int numDice = Integer.parseInt(parts[0]);
        int numFaces = Integer.parseInt(parts[1]);

        int total = 0;

        System.out.print("Resultado del lanzamiento: ");
        for (int i = 0; i < numDice; i++) {
            int roll = random.nextInt(numFaces) + 1;
            total += roll;
            System.out.print(roll);

            if (i < numDice - 1) {
                System.out.print(" + ");
            }
        }

        System.out.println(" = " + total);
    }
}
