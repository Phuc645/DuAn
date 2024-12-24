package com.concert;

import java.util.Scanner;

public class MainCustomer {
    public static void main(String[] args) {
        int choice;
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.format("1.Account Setting\n");
        System.out.format("2.Ticket Management\n");
        System.out.format("Enter your choice: ");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                break;
            case 2:
                MainTicket.main(args);
                break;
            default:
                System.out.format("Invalid choice");
        }
    }
}
