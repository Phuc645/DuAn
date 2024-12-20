package com.concert;

public class Ticket extends Customer{
    private String ticketId;
    private String ticketType;
    private int ticketPrice;
    private int seat;
    private String date;
    public Ticket() {

    }
    public Ticket(String name, String email, String phone, String ticketId, String ticketType, int ticketPrice,int seat, String date) {
        super(name, email, phone);
        this.ticketId = ticketId;
        this.ticketType = ticketType;
        this.ticketPrice = ticketPrice;
        this.seat = seat;
        this.date = date;
    }
    public String getTicketId() {
        return ticketId;
    }
    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }
    public String getTicketType() {
        return ticketType;
    }
    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }
    public int getTicketPrice() {
        return ticketPrice;
    }
    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
    public int getSeat() {
        return seat;
    }
    public void setSeat(int seat) {
        this.seat = seat;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    

    
}
