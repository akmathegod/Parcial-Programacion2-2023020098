public class ComisionPersonalizada implements EstrategiaComision {
    private static final String PRIMER_NOMBRE = "Vidal";

    @Override
    public double calcularComision(double montoVenta) {
        int n = PRIMER_NOMBRE.length();
        double porcentaje = (5 + n) / 100.0;
        return montoVenta * porcentaje;
    }
}
