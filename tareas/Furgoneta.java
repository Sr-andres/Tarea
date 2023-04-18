public class Furgoneta extends Vehiculo {
    private double volumenCarga;

    public Furgoneta(String marca, String modelo, double precio, double volumenCarga) {
        super(marca, modelo, precio);
        this.volumenCarga = volumenCarga;
    }

    public double getVolumenCarga() {
        return volumenCarga;
    }

    public void setVolumenCarga(double volumenCarga) {
        this.volumenCarga = volumenCarga;
    }

    @Override
    public String toString() {
        return "Furgoneta [marca=" + getMarca() + ", modelo=" + getModelo() + ", precio=" + getPrecio() + ", volumenCarga=" + volumenCarga + "]";
    }
}
