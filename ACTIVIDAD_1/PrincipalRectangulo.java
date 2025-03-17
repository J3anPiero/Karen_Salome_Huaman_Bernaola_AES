package actividad_cuadrado;

import java.util.Scanner;

public class PrincipalRectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una esquina del 1er rectángulo:");
        Coordenada c1 = new Coordenada(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Ingrese la esquina opuesta del 1er rectángulo:");
        Coordenada c2 = new Coordenada(scanner.nextDouble(), scanner.nextDouble());
        Rectangulo r1 = new Rectangulo(c1, c2);

        System.out.println("Ingrese una esquina del 2do rectángulo:");
        Coordenada c3 = new Coordenada(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Ingrese la esquina opuesta del 2do rectángulo:");
        Coordenada c4 = new Coordenada(scanner.nextDouble(), scanner.nextDouble());
        Rectangulo r2 = new Rectangulo(c3, c4);

        System.out.println("Rectángulo A = " + r1);
        System.out.println("Rectángulo B = " + r2);

        int caso = Verificador.determinarCaso(r1, r2);
        switch (caso) {
            case 1:
                System.out.println("Rectángulos A y B se sobreponen.");
                Rectangulo sobreposicion = Rectangulo.rectanguloSobre(r1, r2);
                if (sobreposicion != null) {
                    System.out.println("Área de sobreposición = " + String.format("%.2f", sobreposicion.calculoArea()));
                }
                break;
            case 2:
                System.out.println("Rectángulos A y B se juntan");
                break;
            case 3:
                System.out.println("Rectángulos A y B son disjuntos");
                break;
        }
        scanner.close();
    }
}
