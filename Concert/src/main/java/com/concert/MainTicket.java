package com.concert;

import java.util.Scanner;

public class MainTicket {
    public static void main(String[] args) {
        TicketManagementCustomer tmc = new TicketManagementCustomer();
        int choice;
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.format("1. Add Ticket\n");
            System.out.format("2. Update Ticket\n");
            System.out.format("3. Remove Ticket\n");
            System.out.format("4. Display Ticket\n");
            System.out.format("5. Sort Ticket\n");
            System.out.format("6. Return\ns");
            System.out.format("Enter your choice: ");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    tmc.addTicket();
                    break;
                case 2:
                    tmc.updateTicket();
                    break;
                case 3:
                    tmc.removeTicket();
                    break;
                case 4:
                    tmc.displayTickets();
                    break;
                case 5:
                    tmc.sortTickets();
                    break;
                case 6:
                    System.out.format("Returning...\n");
                    MainCustomer.main(args);
                default:
                    System.out.format("Invalid choice\n");
            }
        } while (choice != 6);
    }
}
