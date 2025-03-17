package ejercicio;

import java.util.Scanner;

public class PrincipalRectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad máxima de rectángulos: ");
        int maxRect = scanner.nextInt();

        ContainerRect contenedor = new ContainerRect(maxRect);

        for (int i = 0; i < maxRect; i++) {
            System.out.println("Ingrese una esquina del rectángulo " + (i + 1) + ":");
            Coordenada c1 = new Coordenada(scanner.nextDouble(), scanner.nextDouble());
            System.out.println("Ingrese la esquina opuesta del rectángulo " + (i + 1) + ":");
            Coordenada c2 = new Coordenada(scanner.nextDouble(), scanner.nextDouble());
            Rectangulo r = new Rectangulo(c1, c2);
            contenedor.addRectangulo(r);
        }

        System.out.println("\n" + contenedor);
        scanner.close();
    }
}
