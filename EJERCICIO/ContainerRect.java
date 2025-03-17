package ejercicio;

public class ContainerRect {
    private Rectangulo[] rectangulos;
    private double[] distancias;
    private double[] areas;
    private int n;
    private static int numRec = 0;

    public ContainerRect(int n) {
        this.n = n;
        rectangulos = new Rectangulo[n];
        distancias = new double[n];
        areas = new double[n];
    }

    public void addRectangulo(Rectangulo r) {
        if (numRec < n) {
            rectangulos[numRec] = r;
            distancias[numRec] = Coordenada.distancia(r.getEsquina1(), r.getEsquina2());
            areas[numRec] = r.calculoArea();
            numRec++;
        } else {
            System.out.println("El contenedor está lleno, no se puede agregar más rectángulos.");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-10s %-25s %-10s %-10s\n", "Rectángulo", "Coordenadas", "Distancia", "Área"));
        sb.append("-------------------------------------------------------------\n");
        for (int i = 0; i < numRec; i++) {
            sb.append(String.format("%-10d (%s, %s) %-10.3f %-10.2f\n",
                    i + 1,
                    rectangulos[i].getEsquina1(),
                    rectangulos[i].getEsquina2(),
                    distancias[i],
                    areas[i]));
        }
        return sb.toString();
    }
}
