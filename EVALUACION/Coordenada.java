package evaluacion;

public class Coordenada {
    private double x;
    private double y;

    public Coordenada(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }

    public String toString() {
        return "[" + x + ", " + y + "]";
    }
}
