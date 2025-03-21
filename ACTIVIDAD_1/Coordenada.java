package actividad_cuadrado;

public class Coordenada {
    private double x;
    private double y;

    // Constructor por defecto
    public Coordenada() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor con valores
    public Coordenada(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Constructor copia
    public Coordenada(Coordenada c) {
        this.x = c.x;
        this.y = c.y;
    }

    // Métodos setter
    void setX(double x) {
        this.x = x;
    }

    void setY(double y) {
        this.y = y;
    }

    // Métodos getter
    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    // Método de instancia que calcula la distancia euclidiana
    double distancia(Coordenada c) {
        return Math.sqrt(Math.pow(this.x - c.x, 2) + Math.pow(this.y - c.y, 2));
    }

    // Método de clase que calcula la distancia euclidiana
    static double distancia(Coordenada c1, Coordenada c2) {
        return Math.sqrt(Math.pow(c1.x - c2.x, 2) + Math.pow(c1.y - c2.y, 2));
    }

    // Representación en String
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
