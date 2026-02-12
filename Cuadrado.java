/**
 * Clase {@code Cuadrado}
 * Extiende de la clase {@link PoligonoRegular}
 * 
 * @author Luis Fernando Quintana López
 * @author Erick Xavier Martinez Briones
 * @version 1.0.0
 * @since 2026
 * 
 */

public class Cuadrado extends PoligonoRegular {
    private static final int LADOS = 4;
    private static final String TIPOFIGURA = "Cuadrado";

    /**
     * Constructor de la clase Cuadrado
     * 
     * @param longitudlado longitud de un lado del cuadrado
     */
    public Cuadrado(double longitudLado) {
        super(LADOS, longitudLado, TIPOFIGURA);
    }

    /**
     * Metodo para calcular el area de un cuadradi
     * Implementa el metodo calcularArea() de la interfaz {@link Figura}
     * 
     * @return double del area del cuadrado
     */
    @Override
    public double calcularArea() {
        return longitudLado * longitudLado;
    }
}