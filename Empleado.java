public class Empleado {

    private String nombre;
    private double sueldo;
    private double dinero;

    public Empleado(String n, double s) {
        nombre = n;
        sueldo = s;
        dinero = 0;
    }

    public double getSueldo() {
        return sueldo;
    }

    public double getDinero() {
        return dinero;
    }

    public void cobrar(double cantidad) throws CabreoException {
        if (sueldo > cantidad) {
            throw new CabreoException("Al empleado " + nombre + " no se le han\n"
                    + "pagado " + (sueldo - cantidad) + " euros");
        }
        dinero = +cantidad;
    }
}