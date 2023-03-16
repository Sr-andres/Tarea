import java.util.Date;



class Paciente {

    private String nombre;
    private String apellido;
    private String edad;
    private String email;
    private Cita cita;

    public Paciente(String nombre, String apellido, String edad, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.email = email;
    }

    public Paciente(java.lang.String lilia, java.lang.String villamizar, java.lang.String s, java.lang.String s1, java.lang.String dolor_de_cabeza) {
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

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

}


class Citaa {

    public Citaa(Paciente paciente2, Date date, String string) {
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



