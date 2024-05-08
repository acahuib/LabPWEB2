import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenido a la Calculadora Interactiva");
        System.out.println("Por favor, seleccione la operación que desea realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Módulo");
        System.out.print("Ingrese el número correspondiente a la operación: ");
        
        int operation = scanner.nextInt();
        
        switch(operation) {
            case 1:
                System.out.print("Ingrese el primer número: ");
                int a = scanner.nextInt();
                System.out.print("Ingrese el segundo número: ");
                int b = scanner.nextInt();
                System.out.println("El resultado de la suma es: " + calculator.add(a, b));
                break;
            case 2:
                System.out.print("Ingrese el primer número: ");
                int c = scanner.nextInt();
                System.out.print("Ingrese el segundo número: ");
                int d = scanner.nextInt();
                System.out.println("El resultado de la resta es: " + calculator.sub(c, d));
                break;
            case 3:
                System.out.print("Ingrese el primer número: ");
                int e = scanner.nextInt();
                System.out.print("Ingrese el segundo número: ");
                int f = scanner.nextInt();
                System.out.println("El resultado de la multiplicación es: " + calculator.mul(e, f));
                break;
            case 4:
                System.out.print("Ingrese el primer número: ");
                int g = scanner.nextInt();
                System.out.print("Ingrese el segundo número: ");
                int h = scanner.nextInt();
                if (h == 0) {
                    System.out.println("Error: División por cero no permitida.");
                } else {
                    System.out.println("El resultado de la división es: " + calculator.div(g, h));
                }
                break;
            case 5:
                System.out.print("Ingrese el primer número: ");
                int i = scanner.nextInt();
                System.out.print("Ingrese el segundo número: ");
                int j = scanner.nextInt();
                if (j == 0) {
                    System.out.println("Error: División por cero no permitida.");
                } else {
                    System.out.println("El resultado del módulo es: " + calculator.mod(i, j));
                }
                break;
            default:
                System.out.println("Operación no válida. Por favor, seleccione una opción del 1 al 5.");
        }
        
        scanner.close();
    }
}

