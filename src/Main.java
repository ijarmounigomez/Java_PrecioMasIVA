import java.util.Scanner;

public class Main {

    public static double precioMasIVA() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number and press enter: ");

        double enteredNumber = scanner.nextDouble();
        double iva = enteredNumber * (0.21);
        double precioFinal = enteredNumber + iva;


        return precioFinal;
    }
    public static void main(String[] args) {
        System.out.println(precioMasIVA());
    }
}