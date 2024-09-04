import java.awt.Label;
public class aufgabe_fünf {
       public static void main(String[] args) {
              double betrag = InOut.readInt("Geben Sie ihren Betrag ein: ");
    
              if (betrag >= 100) {
                 double rabatt = betrag * 0.95;
                 System.out.println("\nBetrag: " + betrag + "\nRabatt: " + rabatt);
              } else if (betrag >= 500) {
                double rabatt = betrag * 0.9;
                System.out.println("\nBetrag: " + betrag + "\nRabatt: " + rabatt);    
              } else {
                System.out.println("Betrag: ");    
              } // end of if-else  
       }
  }