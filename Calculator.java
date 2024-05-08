//Procedemos a crear la clase Calculator 

public class Calculator {
    int add(int a, int b){
        int r = a + b; 
        return r; 
    }
    int sub(int a, int b){
        return 0;
    }
    int mul(int a, int b){
        int r = a * b; 
        return r;
    }
    int div(int a, int b){
        if(b == 0){
            // Si en caso cumple la condicion pues el valor que retornara el metodo sera de 0
            System.out.println("No es posible esta division");
            a = 0;
        } 
        return a / b;
    }
    int mod(int a, int b) {
        if (b == 0) {
            System.out.println("Error: División por cero no permitida.");
            return -1; // o cualquier otro valor que indique un error
        }
        return a % b;
    }
}
