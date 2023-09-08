package cs4truthzafranco;

public class exercise1 {
    static String racer1Name = "Strip 'The King' Weathers";
    static String racer1Sponsor = "Dinoco";
    static int racer1PistonCups = 7;
    
    static String racer2Name = "Chick Hicks";
    static String racer2Sponsor = "Hostile Takeover Bank";
    static int racer2PistonCups = 1;
    
    static String racer3Name = "Lightning McQueen";
    static String racer3Sponsor = "Rust-eze";
    static int racer3PistonCups = 7;
    
public static void main(String[] args) {
    System.out.println("Racer No. 1" + "\n");
    System.out.println("Name: " + racer1Name);
    System.out.println("Sponsor: " + racer1Sponsor);
    System.out.println("Number of Piston Cups won: " + racer1PistonCups + "\n\n");

    System.out.println("Racer No. 2" + "\n");
    System.out.println("Name: " + racer2Name);
    System.out.println("Sponsor: " + racer2Sponsor);
    System.out.println("Number of Piston Cups won: " + racer2PistonCups + "\n\n");

    System.out.println("Racer No. 3" + "\n");
    System.out.println("Name: " + racer3Name);
    System.out.println("Sponsor: " + racer3Sponsor);
    System.out.println("Number of Piston Cups won: " + racer3PistonCups + "\n\n");

    System.out.println("What is the total number of Piston Cups between the three racers?");
    System.out.println(racer1PistonCups + racer2PistonCups + racer3PistonCups);
    
    System.out.println("\nDoes Chick Hicks have more Piston Cups than Lightning McQueen?");
    System.out.println(racer2PistonCups > racer3PistonCups);

    System.out.println("\nIs Strip 'The King' Weathers sponsored by Dinoco?");
    System.out.println(racer1Sponsor == "Dinoco");
}
}
