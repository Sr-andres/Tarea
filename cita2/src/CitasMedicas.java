import java.util.ArrayList;
import java.util.Scanner;

public class CitasMedicas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> citas = new ArrayList<String>();

        while (true) {
            System.out.println("Bienvenido al agendador de citas de la unipaz\n");
            System.out.println("¿Qué acción desea realizar?");
            System.out.println("1. Agregar cita médica");
            System.out.println("2. Ver citas médicas programadas");
            System.out.println("3. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del estudiante:");
                    String nombreEstudiante = scanner.next();
                    System.out.println("Ingrese el nombre del doctor:");
                    String nombreDoctor = scanner.next();
                    System.out.println("Ingrese la fecha y hora de la cita (DIAS/MES/AÑO/HORA):");
                    String fecha = scanner.next();
                    Estudiante estudiante = new Estudiante(nombreEstudiante);
                    Doctor doctor = new Doctor(nombreDoctor);
                    citas.add("Estudiante:" + estudiante.getNombre() + " Doctor:" + doctor.getNombre() + " Fecha:" + fecha);
                    System.out.println("Cita médica agregada exitosamente.\n");
                    break;
                case 2:
                    if (citas.isEmpty()) {
                        System.out.println("No hay citas médicas programadas.");
                    } else {
                        System.out.println("Citas médicas programadas:");
                        for (String cita : citas) {
                            System.out.println(cita);
                        }
                    }
                    break;
                case 3:
                    System.out.println("¡Gracias por utilizar el sistema de citas médicas de la unipaz!");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}
