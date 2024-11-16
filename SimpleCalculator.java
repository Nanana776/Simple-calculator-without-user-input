public class SimpleCalculator {

    public static void main(String[] args) {
        
        double num1=10;
        double num2=5;
        
        double sum=add(num1, num2);
        double difference=subtract(num1, num2);
        double product=multiply(num1, num2);
        double quotient=divide(num1, num2);

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + quotient);
    }
    
    
    public static double add(double a, double b) {
        return a+b;
    }
    
    
    public static double subtract(double a, double b) {
        return a-b;
    }
    
    
    public static double multiply(double a, double b) {
        return a*b;
    }
    
    
    public static double divide(double a, double b) {
        if (b!= 0) {
            return a/b;
            } 
        else {
            System.out.println("Can't divide by zero");
            return 0;
        }
    }
}
