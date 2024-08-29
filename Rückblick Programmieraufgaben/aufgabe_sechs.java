import java.util.Scanner;

public class aufgabe_sechs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Gib eine positive ganze Zahl ein: ");
        int bottles = scanner.nextInt();
        
        // while loop
        while (bottles > 1) {
            System.out.print(bottles);
            System.out.println(" bottles of rum, pass one around, until it's gone,");
            bottles--;
        }
        
        System.out.println("last bottle of rum, pass it around, and now I'm done");

        // for loop
        /*for (int i = bottles; i > 1; i--){
            System.out.print(i);
            System.out.println(" bottles of rum, pass one around, until it's gone,");
        }

        System.out.println("last bottle of rum, pass it around, and now I'm done");*/
    }
}