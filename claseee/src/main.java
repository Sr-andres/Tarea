import java.util.Date;




class Pacientee {

    private String nombre;
    private String apellido;
    private String edad;
    private String email;
    private String cita;

    public Pacientee (String nombre, String apellido, String edad, String email, String cita) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.email = email;
        this.cita = cita;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEdad() {
        return edad;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    public String getCita() {
        return cita;
    }
}


class String {

    public String(Paciente paciente2, Date date, String string) {
        // TODO Auto-generated constructor stub
    }

    public int getComentario() {
        // TODO Auto-generated method stub
        return 0;
    }

    public String getFecha() {
        // TODO Auto-generated method stub
        return null;
    }

}


public class main {

    public static void main(String[] args) {

        Paciente paciente2 = new Paciente("lilia", "villamizar","19","lilia.villamizar@example.com",  "dolor de cabeza");
        Paciente paciente1 = new Paciente("luis","gomez","20","luis.gomez@example.com");


        Cita cita1 = new Cita(paciente1, new Date(), "Examen físico");
        Cita cita2 = new Cita(paciente2, new Date(), "Consulta general");




        System.out.println("Citas de " + paciente1.getNombre() + " " + paciente1.getApellido() + ":");
        System.out.println("examen fisico");
        System.out.println(paciente1.getEmail());
        System.out.println("\n");


        System.out.println("Citas de " + paciente2.getNombre() + " " + paciente2.getApellido() + ":");
        System.out.println("Consulta general");
        System.out.println(paciente2.getEmail());
    }
}
