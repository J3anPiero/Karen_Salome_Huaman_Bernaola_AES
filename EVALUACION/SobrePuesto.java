package evaluacion;

import java.util.ArrayList;

public class SobrePuesto {
    Rectangulo rectangulo;
    private ArrayList<String> sobrepuestos;

    public SobrePuesto(Rectangulo rectangulo) {
        this.rectangulo = rectangulo;
        this.sobrepuestos = new ArrayList<>();
    }

    public void agregarSobreposicion(Rectangulo r, double area) {
        sobrepuestos.add((char) ('A' + r.getId() - 1) + " [" + String.format("%.3f", area) + "]");
    }

    public String toString() {
        return rectangulo + " " + String.join(" ", sobrepuestos);
    }
}
