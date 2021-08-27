package dominio;

public class Ahorros {

    private String nombre;
    private double saldo;
    private int cuenta;
    private static int i;

    public Ahorros(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
        this.cuenta = Ahorros.i++;
    }

    public int getCuenta() {
        return cuenta;
    }
}
