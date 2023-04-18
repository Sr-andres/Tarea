public class Camion extends Vehiculo {
    private double capacidadCarga;

    public Camion(String marca, String modelo, double precio, double capacidadCarga) {
        super(marca, modelo, precio);
        this.capacidadCarga = capacidadCarga;
    }

    public Camion(String marca, String modelo, double precio, Double capacidadCarga) {
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return "Camion [marca=" + getMarca() + ", modelo=" + getModelo() + ", precio=" + getPrecio() + ", capacidadCarga=" + capacidadCarga + "]";
    }
}
