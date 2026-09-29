public class Vendedor extends Empleado {
    public Vendedor(String nombre, double ventasMes) {
        super(nombre, ventasMes, new ComisionEstandar());
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Venta total: " + ventasMes);
        System.out.println("Comisión: " + estrategia.calcularComision(ventasMes));
    }
}
