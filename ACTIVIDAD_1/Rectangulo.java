package actividad_cuadrado;

public class Rectangulo { 
    private Coordenada esquina1;
    private Coordenada esquina2;

    public Rectangulo(Coordenada c1, Coordenada c2) {
        double x1 = Math.min(c1.getX(), c2.getX());  // Menor X (izquierda)
        double y1 = Math.min(c1.getY(), c2.getY());  // Menor Y (abajo)
        double x2 = Math.max(c1.getX(), c2.getX());  // Mayor X (derecha)
        double y2 = Math.max(c1.getY(), c2.getY());  // Mayor Y (arriba)

        this.esquina1 = new Coordenada(x1, y1);
        this.esquina2 = new Coordenada(x2, y2);
    }

    public Coordenada getEsquina1() { return esquina1; }
    public Coordenada getEsquina2() { return esquina2; }

    public double calculoArea() {
        double base = Math.abs(esquina2.getX() - esquina1.getX());
        double altura = Math.abs(esquina2.getY() - esquina1.getY());
        return base * altura;
    }

    public static Rectangulo rectanguloSobre(Rectangulo r1, Rectangulo r2) {
        double x1 = Math.max(r1.getEsquina1().getX(), r2.getEsquina1().getX());
        double y1 = Math.max(r1.getEsquina1().getY(), r2.getEsquina1().getY());
        double x2 = Math.min(r1.getEsquina2().getX(), r2.getEsquina2().getX());
        double y2 = Math.min(r1.getEsquina2().getY(), r2.getEsquina2().getY());

        if (x1 < x2 && y1 < y2) {
            return new Rectangulo(new Coordenada(x1, y1), new Coordenada(x2, y2));
        }
        return null;
    }

    public String toString() {
        return "[" + esquina1 + ", " + esquina2 + "]";
    }
}
