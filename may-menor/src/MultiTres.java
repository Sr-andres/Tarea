import java.util.Scanner;

public class MultiTres {
    public static void main(String[] args) {
        while (true) {

            Scanner MultiTres = new Scanner(System.in);

            System.out.print("--Bienvenido--");
            System.out.print("\n");
            System.out.print("====================================");
            System.out.print("\n");

            System.out.print("Ingresa el primer número: ");
            int nume1 = MultiTres.nextInt();

            System.out.print("Ingresa el segundo número: ");
            int nume2 = MultiTres.nextInt();

            System.out.print("Ingresa el tercer número: ");
            int nume3 = MultiTres.nextInt();

            int resul = nume1 * nume2 * nume3;
            System.out.print("El producto es:" + resul);
            System.out.println("\n");



            // Encuentra el número mayor
            int mayor = nume1;
            if (nume2 > mayor) {
                mayor = nume2;
            }
            if (nume3 > mayor) {
                mayor = nume3;
            }

            // Encuentra el número menor
            int menor = nume1;
            if (nume2 < menor) {
                menor = nume2;
            }
            if (nume3 < menor) {
                menor = nume3;
            }


            System.out.println("El número mayor es: " + mayor);
            System.out.println("El número menor es: " + menor);

            // Determina si el producto es par o impar
            int producto = nume1 * nume2 * nume3;
            if (producto % 2 == 0) {
                System.out.println("\n");
                System.out.println("El producto es PAR");
            } else {
                System.out.println("\n");
                System.out.println("El producto es IMPAR");
            }
            System.out.println("GRACIAS POR USAR ESTE PROGRAMA");
            System.out.println("\n");

        }

    }
}