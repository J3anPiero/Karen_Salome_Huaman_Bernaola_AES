package evaluacion;

import java.util.Scanner;

public class Principal {
    private static SobrePuesto[] sobrepuestos;
    private static int numRectangulos = 0;
    private static int maxRectangulos;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número máximo de rectángulos: ");
        maxRectangulos = scanner.nextInt();
        sobrepuestos = new SobrePuesto[maxRectangulos];

        while (numRectangulos < maxRectangulos) {
            System.out.println("Ingrese la esquina del rectángulo:");
            Coordenada c1 = new Coordenada(scanner.nextDouble(), scanner.nextDouble());
            System.out.println("Ingrese la esquina opuesta:");
            Coordenada c2 = new Coordenada(scanner.nextDouble(), scanner.nextDouble());
            Rectangulo nuevoRect = new Rectangulo(c1, c2);

            addRectangulo(nuevoRect);
        }

        listaSobrePos();
        scanner.close();
    }

    public static void addRectangulo(Rectangulo nuevo) {
        if (numRectangulos >= maxRectangulos) {
            System.out.println("No se pueden agregar más rectángulos.");
            return;
        }

        SobrePuesto sp = new SobrePuesto(nuevo);

        for (int i = 0; i < numRectangulos; i++) {
            Rectangulo existente = sobrepuestos[i].rectangulo;
            Rectangulo interseccion = Rectangulo.rectanguloSobre(nuevo, existente);

            if (interseccion != null) {
                double area = interseccion.calculoArea();
                sp.agregarSobreposicion(existente, area);
                sobrepuestos[i].agregarSobreposicion(nuevo, area);
            }
        }

        sobrepuestos[numRectangulos++] = sp;
    }

    public static void listaSobrePos() {
        System.out.println("Rectangulo\tCoordenadas\t\tRectangulos Sobrepuestos (área)");
        for (int i = 0; i < numRectangulos; i++) {
            System.out.println(sobrepuestos[i]);
        }
    }
}
