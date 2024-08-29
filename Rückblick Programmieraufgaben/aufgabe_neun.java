import java.util.Scanner;

public class aufgabe_neun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Aufgabe a)
        int[] numbers = new int[10];

        System.out.println("Gib 10 ganze Zahlen ein:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\nDie Zahlen in umgekehrter Reihenfolge:");
        for (int i = 9; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
        
        // Aufgabe b)
        /*System.out.print("Wie viele Zahlen moechtest du eingeben? ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Gib " + n + " ganze Zahlen ein:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\nDie Zahlen in umgekehrter Reihenfolge:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }*/
    }
}