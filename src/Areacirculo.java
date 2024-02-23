import java.util.Scanner;

public class Areacirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el radio: ");
        double Radio = scanner.nextDouble();

        double area = (Math.PI * (Radio*Radio));

        System.out.println("El área del circulo con Radio " + Radio + " es: " + area);

        scanner.close();
    }
}
