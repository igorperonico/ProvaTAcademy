package task09;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try{
            while(true) {
                System.out.println("\n===== Alien Management System =====");
                System.out.println("1. Register Species");
                System.out.println("2. Register Alien");
                System.out.println("3. List Aliens");
                System.out.println("4. List Species");
                System.out.println("5. Monitor Dangerous Aliens");
                System.out.println("6. Generate Alien Report");
                System.out.println("7. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter Species name: ");
                        String speciesName = scanner.nextLine();
                        System.out.print("Enter Planet of Origin: ");
                        String planet = scanner.nextLine();
                        System.out.print("Enter Base Dangerousness Level: ");
                        int baseDangerousnessLevel = scanner.nextInt();
                        AlienRegistry.registerSpecies(new Species(speciesName, planet, baseDangerousnessLevel));

                        break;
                    case 2:
                        System.out.print("Enter Alien name: ");
                        String alienName = scanner.nextLine();
                        System.out.print("Enter Alien species: ");
                        String species = scanner.nextLine();
                        System.out.print("Enter Alien dangerousness level: ");
                        int dangerousness = scanner.nextInt();
                        System.out.print("Enter Alien entry time (yyyy-MM-dd HH:mm): ");
                        LocalDateTime entryTime = LocalDateTime.parse(scanner.next());
                        /*Não deu tempo...*/
                        break;
                    case 3:
                        System.out.println("Registered Aliens:");
                        AlienRegistry.listAliens();
                        break;
                    case 4:
                        System.out.println("Registered Species:");
                        AlienRegistry.listSpecies();
                        break;
                    case 5:
                        System.out.println("Monitoring Dangerous Aliens in Quarantine:");
                        AlienRegistry.monitorAliens();
                        break;
                    case 6:
                        System.out.println("Generating Alien Report:");
                        AlienRegistry.generateAlienReport();
                        break;
                    case 7:
                        System.out.println("Exiting program...");
                        scanner.close();
                        return; // Terminates the main method and thus the program
                    default:
                        System.out.println("Invalid choice. Please enter a number from 1 to 6.");
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
