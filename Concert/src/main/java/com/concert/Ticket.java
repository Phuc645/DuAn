package com.concert;

public class Ticket extends Customer{
    private String concert;
    private String ticketType;
    private int quantity;
    private int seat;
    private String date;
    public Ticket() {

    }
    public Ticket(String name,String concert,String ticketType, int quantity,int seat, String date) {
        super(name);
        this.concert = concert;
        this.ticketType = ticketType;
        this.quantity = quantity;
        this.seat = seat;
        this.date = date;
    }
    public String getConcert() {
        return concert;
    }
    public void setConcert(String concert) {
        this.concert = concert;
    }
    public String getTicketType() {
        return ticketType;
    }
    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
