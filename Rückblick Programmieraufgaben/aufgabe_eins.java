import java.util.Scanner;

public class aufgabe_eins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Wie ist Ihr Name?: ");
        String name = scanner.nextLine();
        
        System.out.println("Im welchen Jahr wurden Sie geboren?: ");
        int geburtsjahr = scanner.nextInt();
        
        int alter = 2024 - geburtsjahr;
        
        System.out.println("\nHallo " + name + ", Sie sind " + alter + " Jahre alt.");
    }
}