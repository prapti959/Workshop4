import java.util.Scanner;

/**
 * Write a description of class CinemaTicket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CinemaTicket
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n===== XFX Cinema Ticket Calculator =====");
        System.out.println("\nSelect Movie Language:");
        System.out.println("1. Nepali");
        System.out.println("2. Hindi");
        System.out.println("3. English");
        System.out.print("Enter choice (1-3): ");
        int lang = sc.nextInt();
        System.out.println("\nSelect Age Group:");
        System.out.println("1. Child (below 12)");
        System.out.println("2. Adult (12–59)");
        System.out.println("3. Senior (60+)");
        System.out.print("Enter choice (1-3): ");
        int age = sc.nextInt();

        double basePrice = 0;
        double finalPrice;

        if (age == 1) {
            basePrice = 150;
             } 
        else if (age == 2) {
            basePrice = 250;
        } 
        else if (age == 3) {
            basePrice = 200;
        } 
        else {
            System.out.println("Invalid age group!");
            return;     
        }

         if (lang == 1) { 
            finalPrice = basePrice;      
        } else if (lang == 2) {          
            finalPrice = basePrice + 50; 
        } else if (lang == 3) {          
            finalPrice = basePrice + 100;
        } else {
            System.out.println("Invalid language choice!");
            return;
        }


        System.out.print("\nIs the customer a student? (y/n): ");
        char student = sc.next().charAt(0);

        if (student == 'y' || student == 'Y') {
            double discount = finalPrice * 0.20;       
            finalPrice = finalPrice - discount;        
        }

      
        System.out.print("Is today a festival day? (y/n): ");
        char festival = sc.next().charAt(0);

        if (festival == 'y' || festival == 'Y') {
            double discount = finalPrice * 0.15;       
            finalPrice = finalPrice - discount;
        }

        
        System.out.println("\n-----------------------------------");
        System.out.printf("FINAL Ticket Price: Rs. %.2f\n", finalPrice);
        System.out.println("-----------------------------------");
    }
}