import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pharmacy> pharmacies = new ArrayList<>();

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Enter information");
            System.out.println("2. Show all data");
            System.out.println("3. Print all medicines with price and specific provider");
            System.out.println("4. Print all medicines imported from a specific person");
            System.out.println("5. Print all importers");
            System.out.println("6. Exit");
            System.out.println();
            System.out.print("Choose: ");
            int n = scanner.nextInt();

            switch (n) {
                case 1:
                    System.out.println();
                    pharmacies.add(insertData(scanner));
                    break;
                case 2:
                    System.out.println();
                    printData(pharmacies);
                    break;
                case 3:
                    System.out.println();
                    printAllMedicinesWithPriceAndSpecificProvider(pharmacies, scanner);
                    break;
                case 4:
                    System.out.println();
                    printAllMedicinesWithSpecificImporter(pharmacies, scanner);
                    break;
                case 5:
                    System.out.println();
                    printAllImporters(pharmacies);
                    break;
                case 6:
                    exit(0);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }

    public static void printAllMedicinesWithPriceAndSpecificProvider(ArrayList<Pharmacy> pharmacies, Scanner sc) {

        ArrayList<Pharmacy> newPharmacies = new ArrayList<>();

        String nothing = sc.nextLine();

        System.out.println();
        System.out.println("Enter a price: ");
        double price = sc.nextDouble();
        System.out.println();
        String nothing1 = sc.nextLine();
        System.out.println("Enter a manufacturer name: ");
        String name = sc.nextLine();

        for (Pharmacy d : pharmacies) {
            if(d.getManufacturer().getName().equals(name)) {
                if(d.getMedicine().getPrice() < price) {
                    newPharmacies.add(d);
                }
            }
        }

        for (Pharmacy d : newPharmacies) {
            System.out.println(d.getMedicine().toString());
        }
    }

    public static void printAllMedicinesWithSpecificImporter(ArrayList<Pharmacy> pharmacies, Scanner sc) {

        ArrayList<Pharmacy> newPharmacies = new ArrayList<>();

        String nothing = sc.nextLine();

        System.out.println();
        System.out.println("Enter a importer name: ");
        String name = sc.nextLine();

        for (Pharmacy d : pharmacies) {
            if(d.getImporter().getName().equals(name)) {
                newPharmacies.add(d);
            }
        }

        for (Pharmacy d : newPharmacies) {
            System.out.println(d.getMedicine().toString());
        }
    }

    public static void printData(ArrayList<Pharmacy> pharmacies) {
        System.out.println("Print all data!");
        for (Pharmacy h : pharmacies) {
            System.out.println(h.toString());
        }
    }

    public static void printAllImporters(ArrayList<Pharmacy> pharmacies) {
        System.out.println("All importers info!");
        for (Pharmacy h : pharmacies) {
            System.out.println(h.getManufacturer().toString());
        }
    }

    public static Pharmacy insertData(Scanner scanner) {
        return new Pharmacy();
    }
}