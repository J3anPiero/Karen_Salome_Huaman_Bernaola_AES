package ejercicio;

public class Verificador {
    public static int determinarCaso(Rectangulo r1, Rectangulo r2) {
        if (seSobreponen(r1, r2)) return 1;
        if (estanJuntos(r1, r2)) return 2;
        return 3;
    }

    private static boolean seSobreponen(Rectangulo r1, Rectangulo r2) {
        return !(r1.getEsquina2().getX() <= r2.getEsquina1().getX() ||
                 r2.getEsquina2().getX() <= r1.getEsquina1().getX() ||
                 r1.getEsquina2().getY() <= r2.getEsquina1().getY() ||
                 r2.getEsquina2().getY() <= r1.getEsquina1().getY());
    }

    private static boolean estanJuntos(Rectangulo r1, Rectangulo r2) {
        return (r1.getEsquina2().getX() == r2.getEsquina1().getX() || r1.getEsquina1().getX() == r2.getEsquina2().getX() ||
                r1.getEsquina2().getY() == r2.getEsquina1().getY() || r1.getEsquina1().getY() == r2.getEsquina2().getY());
    }
}
