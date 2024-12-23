package com.concert;

import java.util.ArrayList;
import java.util.Scanner;

public class TicketManagementCustomer {
    private ArrayList<Ticket> vip = new ArrayList<Ticket>(5);
    private ArrayList<Ticket> general = new ArrayList<Ticket>(10);

    public void addTicket() {
        Ticket t1 = new Ticket();
        Scanner sc = new Scanner(System.in);
        Scanner sc0 = new Scanner(System.in);
        System.out.format("Enter the name of the customer: ");
        t1.setName(sc.nextLine());
        System.out.format("Enter the concert name: ");
        t1.setConcert(sc.nextLine());
        System.out.format("Enter the ticket type(VIP or General): ");
        t1.setTicketType(sc.nextLine());
        System.out.format("Enter the date: ");
        t1.setDate(sc.nextLine());
        if (t1.getTicketType().equals("VIP")) {
            System.out.format("Price per ticket: $60\n");
            System.out.format("Enter the quantity: ");
            t1.setQuantity(sc0.nextInt());
            for (int i = 0; i < t1.getQuantity(); i++) {
                System.out.format("Enter the seat number: ");
                t1.setSeat(sc0.nextInt());
                vip.add(t1);
            }
            System.out.format("Tickets added successfully");
            displayTickets();
        } else if (t1.getTicketType().equals("General")) {
            System.out.format("Price per ticket: $30\n");
            System.out.format("Enter the quantity: ");
            t1.setQuantity(sc0.nextInt());
            for (int i = 0; i < t1.getQuantity(); i++) {
                System.out.format("Enter the seat number: ");
                t1.setSeat(sc0.nextInt());
                general.add(t1);
            }
            System.out.format("Tickets added successfully");
            displayTickets();
        } else {
            System.out.format("Invalid ticket type");
        }
    }

    public void removeTicket() {
        Ticket t1 = new Ticket();
        Scanner sc = new Scanner(System.in);
        System.out.format("Enter the name of the customer: ");
        t1.setName(sc.nextLine());
        System.out.format("Enter the ticket type(VIP or General): ");
        t1.setTicketType(sc.nextLine());
        System.out.format("Enter the concert name: ");
        t1.setConcert(sc.nextLine());
        System.out.format("Enter the date: ");
        t1.setDate(sc.nextLine());
        if (t1.getTicketType().equals("VIP")) {
            for (Ticket t : vip) {
                if (t.getName().equals(t1.getName()) && t.getConcert().equals(t1.getConcert())
                        && t.getDate().equals(t1.getDate())) {
                    vip.remove(t);
                    System.out.format("Tickets removed successfully");
                    displayTickets();
                }
            }
        } else if (t1.getTicketType().equals("General")) {
            for (Ticket t : general) {
                if (t.getName().equals(t1.getName()) && t.getConcert().equals(t1.getConcert())
                        && t.getDate().equals(t1.getDate())) {
                    general.remove(t);
                    System.out.format("Tickets removed successfully");
                    displayTickets();
                }
            }
        } else {
            System.out.format("Invalid ticket type");
        }
    }

    public void displayTickets() {
        Ticket t1 = new Ticket();
        System.out.format("Enter the ticket type(VIP or General): ");
        Scanner sc = new Scanner(System.in);
        t1.setTicketType(sc.nextLine());
        if (t1.getTicketType().equals("VIP")) {
            for (Ticket t : vip) {
                System.out.format("%s %d %s %d %s\n", t.getName(), t.getSeat(), t.getConcert(), t.getQuantity(),
                        t.getDate());
            }
        } else if (t1.getTicketType().equals("General")) {
            for (Ticket t : general) {
                System.out.format("%s %d %s %d %s\n", t.getName(), t.getSeat(), t.getConcert(), t.getQuantity(),
                        t.getDate());
            }
        } else {
            System.out.format("Invalid ticket type");
        }
    }
}