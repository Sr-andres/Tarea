public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(String marca, String modelo, double precio, int cantidadPuertas) {
        super(marca, modelo, precio);
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public String toString() {
        return "Auto [marca=" + getMarca() + ", modelo=" + getModelo() + ", precio=" + getPrecio() + ", cantidadPuertas=" + cantidadPuertas + "]";
    }
}
