import java.util.Scanner;

public class aufgabe_vier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Geben Sie die 1.Zahl ein: ");
        float firstNumber = scanner.nextFloat();
        
        System.out.println("Geben Sie die 2.Zahl ein: ");
        float secondNumber = scanner.nextFloat();
        
        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " ist größer als " + secondNumber);
        } else if (secondNumber > firstNumber) {
            System.out.println(secondNumber + " ist größer als " + firstNumber);
        } else if (firstNumber == secondNumber) {
            System.out.println("\nBeide Zahlen sind gleich groß!");
        } else {
            System.out.println("Versuchen Sie es erneut!");
        }
    }
}