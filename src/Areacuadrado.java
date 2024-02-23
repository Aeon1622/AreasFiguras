import java.util.Scanner;

public class Areacuadrado {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingresa el lado 1 del Cuadrado: ");
    double lado1 = scanner.nextDouble();

    System.out.print("Ingresa el lado 2 del Cuadrado: ");
    double lado2= scanner.nextDouble();

    double area = (lado1 * lado2);

    System.out.println("El área del cuadrado con lado1 " + lado1 + " y lado2" + lado2 + " es: " + area);

    scanner.close();
}
}

