//Procedemos a crear la clase Calculator 

public class Calculator {
    int add(int a, int b){
        return 0;
    }
    int sub(int a, int b){
        return 0;
    }
    int mul(int a, int b){
        return 0;
    }
    int div(int a, int b){
        return 0;
    }
    int mod(int a, int b) {
        if (b == 0) {
            System.out.println("Error: División por cero no permitida.");
            return -1; // o cualquier otro valor que indique un error
        }
        return a % b;
    }
}
