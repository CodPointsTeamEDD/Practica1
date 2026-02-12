/**
 * Clase {@code TrianguloEquilatero}
 * Extiende de la clase {@link PoligonoRegular}
 * 
 * @author Luis Fernando Quintana López
 * @author Erick Xavier Martinez Briones
 * @version 1.0.0
 * @since 2026
 * 
 */

public class TrianguloEquilatero extends PoligonoRegular {

    /** Numero de lados de la figura */
    private static final int LADOS = 3;
    /** Cadena con el tipo de la figura */
    private static final String TIPOFIGURA = "Triángulo equilátero";

    /**
     * Constructor de la clase {@code TrianguloEquilatero}
     * 
     * @param longitudLado longitud de un lado de la figura
     */
    public TrianguloEquilatero(double longitudLado) {
        super(LADOS, longitudLado, TIPOFIGURA);
    }

    /**
     * Metodo para calcular el area del Triangulo 
     * Implementa el metodo calcularArea() de la interfaz {@link Figura}
     * 
     * @return area del triangulo
     */
    @Override
    public double calcularArea() {
        return (Math.pow(longitudLado, 2) * Math.sqrt(3) / 4);
    }
}