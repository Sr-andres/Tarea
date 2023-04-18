import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaVehiculos {

    public static void main(String[] args) {

        List<Vehiculo> listaVehiculos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        
        listaVehiculos.add(new Camion("nisa", "2023", 200.000  , 15000));
        listaVehiculos.add(new Furgoneta("Volkswagen", "caddy", 70.000, 8));
        listaVehiculos.add(new Auto("Toyota", "GR Supra 2023 ", 59.990, 2));

       
        while (opcion != 4) {
            System.out.println("\n Bienvenidos a mi intento de pasar esta materia :/");
            System.out.println("\n-----------------------------------------------");
            System.out.println("1. Ver la lista");
            System.out.println("2. Añadir un vehículo");
            System.out.println("3. Eliminar un vehículo");
            System.out.println("4. Salir");
            System.out.print("Digite la opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcion) {
                case 1:
                    System.out.println("La lista de vehículos es:");
                    for (Vehiculo vehiculo : listaVehiculos) {
                        System.out.println(vehiculo);
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el tipo de vehículo que desea agregar (1: Camión, 2: Furgoneta, 3: Auto):");
                    int tipoVehiculo = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Ingrese la marca del vehículo: ");
                    String marca = scanner.nextLine();
                    System.out.print("Ingrese el modelo del vehículo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Ingrese el precio del vehículo: ");
                    double precio = scanner.nextDouble();
                    scanner.nextLine(); 
                    switch (tipoVehiculo) {
                        case 1:
                            System.out.print("Ingrese la capacidad de carga del camión: ");
                            double capacidadCarga = scanner.nextDouble();
                            scanner.nextLine();
                            listaVehiculos.add(new Camion(marca, modelo, precio, capacidadCarga));
                            break;
                        case 2:
                            System.out.print("Ingrese el volumen de carga de la furgoneta: ");
                            double volumenCarga = scanner.nextDouble();
                            scanner.nextLine(); 
                            listaVehiculos.add(new Furgoneta(marca, modelo, precio, volumenCarga));
                            break;
                        case 3:
                            System.out.print("Ingrese la cantidad de puertas del auto: ");
                            int cantidadPuertas = scanner.nextInt();
                            scanner.nextLine(); 
                            listaVehiculos.add(new Auto(marca, modelo, precio, cantidadPuertas));
                            break;
                        default:
                            System.out.println("Opción inválida. Por favor, intente nuevamente.");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el número del vehículo que desea eliminar:");
                    int indiceVehiculo = scanner.nextInt();
                    scanner.nextLine();   
                    
                    
                }
            }
        }
    }


