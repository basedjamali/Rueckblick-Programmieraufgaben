public class aufgabe_drei {
       public static void main(String[] args) {
              System.out.println("Geben Sie 4 Zahlen ein, um den Mittelwert zu berechnen");
    
              int a = InOut.readInt("1. Zahl: ");             
              int b = InOut.readInt("2. Zahl: ");             
              int c = InOut.readInt("3. Zahl: ");             
              int d = InOut.readInt("4. Zahl: ");
    
              double mittelwert = (a + b + c + d) / 4.0;
    
              System.out.println("\nDer Mittelwert beträgt: " + mittelwert);                                 
       }
  }