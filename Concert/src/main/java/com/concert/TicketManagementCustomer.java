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
            for (int i = 0; i < vip.size(); i++) {
                System.out.format("%s %d %s %d %s\n", vip.get(i).getName(), vip.get(i).getSeat(),
                        vip.get(i).getConcert(), vip.get(i).getQuantity(), vip.get(i).getDate());
            }
        } else if (t1.getTicketType().equals("General")) {
            for (int i = 0; i < general.size(); i++) {
                System.out.format("%s %d %s %d %s\n", general.get(i).getName(), general.get(i).getSeat(),
                        general.get(i).getConcert(), general.get(i).getQuantity(), general.get(i).getDate());
            }
        } else {
            System.out.format("Invalid ticket type");
        }
    }
}